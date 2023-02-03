package com.example.kafedra.presentation

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.kafedra.R
import com.example.kafedra.presentation.auth.AuthFragment
import com.example.kafedra.presentation.auth.RegistrationFragment

object FragmentActions {
    @JvmStatic
    fun openFragment(manager: FragmentManager, fragment: Fragment, tag: String) {
        manager.beginTransaction()
            .setCustomAnimations(
                R.anim.slide_in,
                R.anim.fade_out,
                R.anim.fade_in,
                R.anim.slide_out
            )
            .replace(R.id.container, fragment, tag)
            .addToBackStack(null)
            .commit()
    }

    @JvmStatic
    fun closeFragment(manager: FragmentManager, fragment: Fragment) {
        manager.popBackStack()
        manager.beginTransaction()
            .remove(fragment)
            .commit()
    }
}