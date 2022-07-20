package com.quadvision.anydel.backend.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.quadvision.anydel.backend.ui.delivery.DeliveryCompletedViewModel
import com.quadvision.anydel.backend.ui.home.HomeDataSource
import com.quadvision.anydel.backend.ui.home.HomeRepository
import com.quadvision.anydel.backend.ui.home.HomeViewModel
import com.quadvision.anydel.backend.ui.home.PackageDetailViewModel
import com.quadvision.anydel.backend.ui.login.data.LoginDataSource
import com.quadvision.anydel.backend.ui.login.data.LoginRepository
import com.quadvision.anydel.backend.ui.login.ui.login.LoginViewModel
import com.quadvision.anydel.backend.ui.profile.ProfileViewModel

/**
 * ViewModel provider factory to instantiate LoginViewModel.
 * Required given LoginViewModel has a non-empty constructor
 */
class ViewModelFactory : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(LoginViewModel::class.java)) {
            return LoginViewModel(
                loginRepository = LoginRepository(
                    dataSource = LoginDataSource()
                )
            ) as T
        }


        if (modelClass.isAssignableFrom(HomeViewModel::class.java)) {
            return HomeViewModel(
                homeRepository = HomeRepository(
                    homeDataSource = HomeDataSource()
                )
            ) as T
        }

        if (modelClass.isAssignableFrom(ProfileViewModel::class.java)) {
            return ProfileViewModel(
                homeRepository = HomeRepository(
                    homeDataSource = HomeDataSource()
                )
            ) as T
        }

        if (modelClass.isAssignableFrom(DeliveryCompletedViewModel::class.java)) {
            return DeliveryCompletedViewModel(
                homeRepository = HomeRepository(
                    homeDataSource = HomeDataSource()
                )
            ) as T
        }

        if (modelClass.isAssignableFrom(PackageDetailViewModel::class.java)) {
            return PackageDetailViewModel(
                homeRepository = HomeRepository(
                    homeDataSource = HomeDataSource()
                )
            ) as T
        }


        throw IllegalArgumentException("Unknown ViewModel class")
    }


}