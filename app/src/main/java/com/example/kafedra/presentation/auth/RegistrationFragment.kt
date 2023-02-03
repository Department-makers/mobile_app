package com.example.kafedra.presentation.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import com.example.kafedra.databinding.FragmentRegistrationBinding
import com.example.kafedra.presentation.FragmentActions

class RegistrationFragment : Fragment() {
    private lateinit var binding: FragmentRegistrationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRegistrationBinding.inflate(inflater)
        cancelButtonListener()
        doneButtonListener()
        return binding.root
    }

    private fun cancelButtonListener() {
        binding.cancelButton.setOnClickListener {
            FragmentActions.closeFragment(requireActivity().supportFragmentManager, this)
        }
    }

    private fun doneButtonListener() {
        binding.doneButton.setOnClickListener {
            FragmentActions.closeFragment(requireActivity().supportFragmentManager, this)
        }
    }



    companion object {
        const val TAG = "registration-fragment"

        @JvmStatic
        fun newInstance() = RegistrationFragment()
    }
}