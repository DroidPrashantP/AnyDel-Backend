package com.quadvision.anydel.backend.ui.home

import androidx.fragment.app.Fragment

interface HomeActivityListener {
     fun changeFragment(fragment: Fragment)
     fun onBackPressedFragment()
     fun clearFragmentBackstack()
}