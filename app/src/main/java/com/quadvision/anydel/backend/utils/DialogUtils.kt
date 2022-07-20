package com.quadvision.anydel.backend.utils

import android.app.Dialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.RatingBar
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.quadvision.anydel.backend.R
import com.quadvision.anydel.backend.data.model.City
import com.quadvision.anydel.backend.data.model.PackageInfo
import com.quadvision.anydel.backend.data.model.SubmitRatingPayload
import com.quadvision.anydel.backend.data.model.UserType
import com.quadvision.anydel.backend.ui.detail.AssignedToOptionListAdapter
import com.quadvision.anydel.backend.ui.detail.PackageWeightSizeChangeListener
import com.quadvision.anydel.backend.ui.home.CityItemListAdapter
import com.quadvision.anydel.backend.ui.home.PackageStatusItemListAdapter
import com.quadvision.anydel.backend.ui.login.DialogActionListener
import com.quadvision.anydel.backend.ui.login.DialogSubmitRatingActionListener


object DialogUtils {

    private var mProgressDialog: Dialog? = null

    fun showCustomDialog(
        context: Context?,
        title: String?,
        message: String?,
        isPositiveAction: Boolean,
        isCancelable: Boolean,
        dialogActionListener: DialogActionListener?,
        showImage: Boolean,
        isCancelBtnRequired: Boolean
    ) {
        if (context != null) {
            val builder = AlertDialog.Builder(context)
            val customView: View = LayoutInflater.from(context).inflate(
                R.layout.layout_custom_app_dialog,
                null,
                false
            )
            builder.setView(customView)
            val dialogActionImageView: AppCompatImageView =
                customView.findViewById(R.id.btn_dialog_image)
            val titleTV: AppCompatTextView = customView.findViewById(R.id.tv_dialog_title)
            val messageTV: AppCompatTextView = customView.findViewById(R.id.tv_dialog_message)
            val okayBtn: AppCompatButton = customView.findViewById(R.id.btn_dialog_okay)
            val cancelBtn: AppCompatButton = customView.findViewById(R.id.btn_dialog_cancel)

            if (title != null) {
                titleTV.text = title
            } else {
                titleTV.visibility = View.GONE
            }
            if (message != null) {
                messageTV.text = message
            } else {
                messageTV.visibility = View.GONE
            }

            if (isCancelBtnRequired) {
                cancelBtn.show()
            } else {
                cancelBtn.hide()
            }

            if (showImage) {
                dialogActionImageView.show()

                dialogActionImageView.setImageDrawable(
                    if (isPositiveAction) ContextCompat.getDrawable(
                        context,
                        R.drawable.ic_round_correct
                    ) else ContextCompat.getDrawable(context, R.drawable.ic_round_cancel)
                )
            } else {
                dialogActionImageView.hide()
            }

            builder.setCancelable(isCancelable)
            val dialog = builder.create()
            okayBtn.setOnClickListener {
                dialog.dismiss()
                dialogActionListener?.onOkayBtnClick()
            }

            cancelBtn.setOnClickListener {
                dialog.dismiss()
            }
            dialog.show()
        }
    }

    fun showRatingDialog(
        context: Context?,
        dialogActionListener: DialogSubmitRatingActionListener?,
        packId: String
    ) {
        if (context != null) {
            var packageRating = 0
            var delBoyRating = 0
            val builder = AlertDialog.Builder(context)
            val customView: View = LayoutInflater.from(context).inflate(
                R.layout.layout_rating_dialog,
                null,
                false
            )
            builder.setView(customView)
            val mSubmitBtn: AppCompatButton = customView.findViewById(R.id.btn_dialog_submit)
            val mRatingBar: RatingBar = customView.findViewById(R.id.rb_dialogUI)
            val mDelBoyRatingBar: RatingBar = customView.findViewById(R.id.rb_dialogUI)
            val mEdtRatingComment: AppCompatEditText =
                customView.findViewById(R.id.edt_ratingComment)

            builder.setCancelable(true)
            val dialog = builder.create()
            mSubmitBtn.setOnClickListener {
                packageRating = mRatingBar.rating.toInt()
                delBoyRating = mDelBoyRatingBar.rating.toInt()
                if (packageRating > 0 && delBoyRating > 0)
                    dialog.dismiss()
                dialogActionListener?.onSubmit(
                    SubmitRatingPayload(
                        CommonUtility.getUserMobileData().appendZeroToMobileNumber(),
                        packId, packageRating, delBoyRating, mEdtRatingComment.text.getValue()
                    )
                )
            }
            dialog.show()
        }
    }

    fun showContactNumberDialog(context: Context?, dialogActionListener: DialogActionListener?) {
        if (context != null) {
            val builder = AlertDialog.Builder(context)
            val customView: View = LayoutInflater.from(context).inflate(
                R.layout.layout_contact_number_dialog,
                null,
                false
            )
            builder.setView(customView)
            val mOkayBtn: AppCompatButton = customView.findViewById(R.id.btn_dialog_okayBtn)
            builder.setCancelable(true)
            val dialog = builder.create()
            mOkayBtn.setOnClickListener {
                dialog.dismiss()
                dialogActionListener?.onOkayBtnClick()
            }
            dialog.show()
        }
    }

    fun showProgressDialog(context: Context?, message: String?) {
        if (context != null) {
            val builder = AlertDialog.Builder(context)
            val customView: View = LayoutInflater.from(context).inflate(
                R.layout.layout_custom_progress_dialog,
                null,
                false
            )
            builder.setView(customView)
            val titleTV: AppCompatTextView = customView.findViewById(R.id.progressText)


            if (message != null) {
                titleTV.text = message
            } else {
                titleTV.visibility = View.GONE
            }

            builder.setCancelable(false)
            mProgressDialog = builder.create()

            mProgressDialog?.show()
        }
    }

    fun hideProgressDialog() {
        mProgressDialog?.dismiss()
    }

    fun selectCityDialog(
        context: Context?,
        cityList: MutableList<City>?,
        cityListener: CityItemListAdapter.CityListAdapterListener
    ) {
        if (context != null) {
            var dialog: Dialog? = null
            val builder = AlertDialog.Builder(context)
            val customView: View = LayoutInflater.from(context).inflate(
                R.layout.layout_city_selection_dialog,
                null,
                false
            )
            builder.setView(customView)
            val listOfCitiesRV: RecyclerView = customView.findViewById(R.id.rv_listOfCities)
            var cityAdapter = CityItemListAdapter(context, object :
                CityItemListAdapter.CityListAdapterListener {
                override fun selectCity(city: City?) {
                    dialog?.dismiss()
                    cityListener.selectCity(city)

                }

            })
            cityAdapter.updateCityList(cityList)
            listOfCitiesRV.apply {
                layoutManager = LinearLayoutManager(context)
                adapter = cityAdapter
            }

            builder.setCancelable(false)
            dialog = builder.create()
            dialog.show()
        }
    }

    fun setThePackageStatus(
        context: Context?,
        statusList: MutableList<String>?,
        packageStatusListener: PackageStatusItemListAdapter.PackageStatusAdapterListener
    ) {
        if (context != null) {
            var dialog: Dialog? = null
            val builder = AlertDialog.Builder(context)
            val customView: View = LayoutInflater.from(context).inflate(
                R.layout.layout_package_status_selection_dialog,
                null,
                false
            )
            builder.setView(customView)
            val listOfPackageStatusRV: RecyclerView =
                customView.findViewById(R.id.rv_listOfPackageStatus)
            var packageStatusItemListAdapter = PackageStatusItemListAdapter(context, object :
                PackageStatusItemListAdapter.PackageStatusAdapterListener {
                override fun selectStatus(status: String?) {
                    dialog?.dismiss()
                    packageStatusListener.selectStatus(status)

                }

            })
            packageStatusItemListAdapter.updateStatusList(statusList)
            listOfPackageStatusRV.apply {
                layoutManager = LinearLayoutManager(context)
                adapter = packageStatusItemListAdapter
            }

//            builder.setCancelable(false)
            dialog = builder.create()
            dialog.show()
        }
    }

    fun setTheAssignedToOptions(
        context: Context?,
        optionList: List<UserType>,
        assignedToOptionListListener: AssignedToOptionListAdapter.AssignedToOptionListListener
    ) {
        if (context != null) {
            var dialog: Dialog? = null
            val builder = AlertDialog.Builder(context)
            val customView: View = LayoutInflater.from(context).inflate(
                R.layout.layout_package_status_selection_dialog,
                null,
                false
            )
            builder.setView(customView)
            val listOfPackageStatusRV: RecyclerView =
                customView.findViewById(R.id.rv_listOfPackageStatus)
            var assignedToOptionListAdapter = AssignedToOptionListAdapter(context, object :
                AssignedToOptionListAdapter.AssignedToOptionListListener {
                override fun selectUserType(userType: UserType?) {
                    dialog?.dismiss()
                    assignedToOptionListListener.selectUserType(userType)

                }

            })
            assignedToOptionListAdapter.updateStatusList(optionList as MutableList<UserType>)
            listOfPackageStatusRV.apply {
                layoutManager = LinearLayoutManager(context)
                adapter = assignedToOptionListAdapter
            }

//            builder.setCancelable(false)
            dialog = builder.create()
            dialog.show()
        }
    }

    fun editPackageSizeAndWeight(
        context: Context?,
        packageInfo: PackageInfo,
        packageWeightSizeChangeListener: PackageWeightSizeChangeListener
    ) {
        if (context != null) {
            var dialog: Dialog? = null
            val builder = AlertDialog.Builder(context)
            val customView: View = LayoutInflater.from(context).inflate(
                R.layout.layout_package_size_change_dialog,
                null,
                false
            )
            builder.setView(customView)
            val mEdtPackageWeight: AppCompatEditText =
                customView.findViewById(R.id.edt_packageInfo_pickWeightField)
            val mEdtPackageLength: AppCompatEditText =
                customView.findViewById(R.id.edt_packageInfo_lengthField)
            val mEdtPackageBreadth: AppCompatEditText =
                customView.findViewById(R.id.edt_packageInfo_breadthField)
            val mEdtPackageHeight: AppCompatEditText =
                customView.findViewById(R.id.edt_packageInfo_heightField)
            val mBtnUpdate: AppCompatButton = customView.findViewById(R.id.btn_packageInfo_update)

            packageInfo?.let {
                mEdtPackageWeight.setText(it.packWeight.toString())
                mEdtPackageLength.setText(it.packLength.toString())
                mEdtPackageBreadth.setText(it.packBreadth.toString())
                mEdtPackageHeight.setText(it.packHeight.toString())
            }

            builder.setCancelable(false)
            dialog = builder.create()

            mBtnUpdate.setOnClickListener {
                var weight = mEdtPackageWeight.text.toString()
                var length = mEdtPackageLength.text.toString()
                var bredth = mEdtPackageBreadth.text.toString()
                var height = mEdtPackageHeight.text.toString()
                if (weight.isNotNullOrEmpty() && length.isNotNullOrEmpty() && bredth.isNotNullOrEmpty() && height.isNotNullOrEmpty()) {
                    dialog.dismiss()
                    packageWeightSizeChangeListener.onPackageSizeChange(
                        weight.toInt(),
                        length.toInt(),
                        bredth.toInt(),
                        height.toInt()
                    )
                } else {
                    context?.showToast("Please add the missing dimension")
                }
            }


            dialog.show()
        }
    }
}


