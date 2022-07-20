package com.quadvision.anydel.backend.ui.detail

interface PackageWeightSizeChangeListener {
     fun onPackageSizeChange(packWeight: Int, packLength: Int, packBreadth: Int, packHeight: Int)
}