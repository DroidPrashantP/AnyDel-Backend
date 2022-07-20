package com.quadvision.anydel.backend.ui.login

import com.quadvision.anydel.backend.data.model.SubmitRatingPayload

interface DialogSubmitRatingActionListener {
    fun onSubmit(submitRatingPayload : SubmitRatingPayload)
}