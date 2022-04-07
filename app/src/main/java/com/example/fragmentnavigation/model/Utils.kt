package com.example.fragmentnavigation.model

import androidx.navigation.NavOptions
import com.example.fragmentnavigation.R

object Utils {
    fun navOption():NavOptions{
        return NavOptions.Builder()
            .setEnterAnim(R.anim.slide_in_up)
            .setExitAnim(R.anim.slide_out_left)
            .build()
    }
}