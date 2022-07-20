package com.quadvision.anydel.backend.ui.login.ui.login

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.view.inputmethod.EditorInfo
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatTextView
import androidx.appcompat.widget.Toolbar
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import butterknife.BindString
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.Unbinder
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.messaging.FirebaseMessaging
import com.google.gson.Gson
import com.quadvision.anydel.backend.R
import com.quadvision.anydel.backend.data.model.LoginPayload
import com.quadvision.anydel.backend.ui.ViewModelFactory
import com.quadvision.anydel.backend.utils.ActivityNavigator
import com.quadvision.anydel.backend.utils.AnyDelConstant
import com.quadvision.anydel.backend.utils.CommonUtility
import com.quadvision.anydel.backend.utils.DialogUtils
import com.quadvision.anydel.backend.utils.SecuredSharePreferenceUtil
import com.quadvision.anydel.backend.utils.afterTextChanged
import com.quadvision.anydel.backend.utils.appendZeroToMobileNumber
import com.quadvision.anydel.backend.utils.isNotNullOrEmpty
import com.quadvision.anydel.backend.utils.showSnackBarMsg
import com.quadvision.anydel.backend.utils.showToast
import timber.log.Timber


class LoginActivity : AppCompatActivity() {

    @BindView(R.id.coordinatorLayout_loginScreen)
    lateinit var mMainContainer: CoordinatorLayout

    @BindView(R.id.toolbar)
    lateinit var mToolBar: Toolbar

    @BindView(R.id.tv_toolbarTitle)
    lateinit var mToolBarTitleTV: AppCompatTextView

    @BindView(R.id.cl_progressBarContainer)
    lateinit var mProgressBarContainer: ConstraintLayout

    @BindView(R.id.edt_loginScreen_emailMobileField)
    lateinit var mEdtMobileOrEmailField: AppCompatEditText

    @BindView(R.id.edt_loginScreen_passwordField)
    lateinit var mEdtPasswordField: AppCompatEditText

    @BindView(R.id.rg_loginScreen_roleContainer)
    lateinit var mRoleContainerRadioGroup: RadioGroup

    @BindView(R.id.btn_loginScreen_login)
    lateinit var mBtnLogin: AppCompatButton

    @BindString(R.string.login_validation_error_message)
    lateinit var mLoginValidationErrorMsg: String

    @BindString(R.string.login)
    lateinit var mLoginMsg: String

    private lateinit var loginViewModel: LoginViewModel
    private lateinit var mContext: Context
    private var mUnBinder: Unbinder? = null
    private var mSelectedRole: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mContext = this
        setContentView(R.layout.activity_login)
        mUnBinder = ButterKnife.bind(this)
        bindView()
        setToolbarTitle()
        observeViews()

        FirebaseMessaging.getInstance().token.addOnCompleteListener(OnCompleteListener { task ->
            if (!task.isSuccessful) {
                Timber.d("Fetching FCM registration token failed ${task.exception}")
                return@OnCompleteListener
            }

            // Get new FCM registration token
            val token = task.result

            if (token.isNotNullOrEmpty()) {
                SecuredSharePreferenceUtil.putData(SecuredSharePreferenceUtil.FCM_TOKEN, token)
            }
            // Log and toast
            val msg = getString(R.string.msg_token_fmt, token)
            Timber.d("Fetching FCM registration token ${msg}")
        })
    }

    private fun setToolbarTitle() {
        mToolBarTitleTV.text = mLoginMsg

        mSelectedRole = AnyDelConstant.USER_ROLE_SUPERVISOR

        mRoleContainerRadioGroup.setOnCheckedChangeListener { radioGroup, checkedId ->
            if (checkedId == R.id.rb_loginScreen_supervisor) {
                mSelectedRole = AnyDelConstant.USER_ROLE_SUPERVISOR
            } else if (checkedId == R.id.rb_loginScreen_deliveryBoys) {
                mSelectedRole = AnyDelConstant.USER_ROLE_DELIVERY_BOYS
            }
        }
    }

    private fun loginRequest() {
        CommonUtility.hideKeyboard(mContext as Activity)
        if (CommonUtility.isNetworkAvailable(mContext)) {
            if (mEdtMobileOrEmailField.text.toString()
                    .isNotNullOrEmpty() && mEdtPasswordField.text.toString().isNotNullOrEmpty()
            ) {

                DialogUtils.showProgressDialog(mContext, "Login in progress..")
                loginViewModel.login(
                    LoginPayload(
                        mEdtMobileOrEmailField.text.toString().appendZeroToMobileNumber(),
                        mEdtPasswordField.text.toString(),
                        SecuredSharePreferenceUtil.getStringData(
                            SecuredSharePreferenceUtil.FCM_TOKEN,
                            null
                        ),
                        mSelectedRole
                    )
                )
            } else {
                mMainContainer.showSnackBarMsg(mLoginValidationErrorMsg)
            }
        } else {
            mContext.showToast(getString(R.string.internet_connection_msg))
        }
    }

    private fun bindView() {
        loginViewModel = ViewModelProvider(this, ViewModelFactory())
            .get(LoginViewModel::class.java)
        mToolBarTitleTV.text = getString(R.string.login)
        mBtnLogin.isEnabled = false
        mBtnLogin.setOnClickListener {
            if (mSelectedRole != null) {
                loginRequest()
            } else {
                mContext.showToast("Please select the user role")
            }
        }

        mEdtMobileOrEmailField.afterTextChanged {
            loginViewModel.loginDataChanged(
                mEdtMobileOrEmailField.text.toString(),
                mEdtPasswordField.text.toString()
            )
        }

        mEdtPasswordField.apply {
            afterTextChanged {
                loginViewModel.loginDataChanged(
                    mEdtMobileOrEmailField.text.toString(),
                    mEdtPasswordField.text.toString()
                )
            }

            setOnEditorActionListener { _, actionId, _ ->
                when (actionId) {
                    EditorInfo.IME_ACTION_DONE ->
                        loginRequest()
                }
                false
            }
        }
    }

    private fun observeViews() {
        loginViewModel.loginFormState.observe(this@LoginActivity, Observer {
            val loginState = it ?: return@Observer

            // disable login button unless both username / password is valid
            mBtnLogin.isEnabled = loginState.isDataValid

        })

        loginViewModel.loginResult.observe(this@LoginActivity, Observer {
            val loginResult = it ?: return@Observer
            DialogUtils.hideProgressDialog()
            if (loginResult.error != null) {
                mMainContainer.showSnackBarMsg(loginResult.error)
            } else if (loginResult.success != null) {
                SecuredSharePreferenceUtil.putBooleanData(
                    SecuredSharePreferenceUtil.PREF_IS_LOGIN,
                    true
                )
                if (loginResult.success.userInfo != null) {
                    SecuredSharePreferenceUtil.putUserData(
                        SecuredSharePreferenceUtil.USER_DATA,
                        Gson().toJson(loginResult.success.userInfo)
                    )
                    SecuredSharePreferenceUtil.putData(
                        SecuredSharePreferenceUtil.API_TOKEN,
                        loginResult.success.userInfo.token
                    )
                    SecuredSharePreferenceUtil.putStringData(
                        SecuredSharePreferenceUtil.BUNDLE_MOBILE_NUMBER,
                        loginResult.success.userInfo.mobileNo
                    )
                }
                ActivityNavigator.navigateToHomeActivity(mContext)
                finish()
            }
        })

    }

    override fun onDestroy() {
        super.onDestroy()
        mUnBinder?.unbind()
    }
}

