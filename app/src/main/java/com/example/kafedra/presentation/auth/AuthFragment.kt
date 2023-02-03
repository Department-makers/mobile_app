package com.example.kafedra.presentation.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kafedra.R
import com.example.kafedra.databinding.FragmentAuthBinding
import com.example.kafedra.presentation.FragmentActions

class AuthFragment : Fragment() {
    private lateinit var binding: FragmentAuthBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAuthBinding.inflate(inflater)
        goBackButtonListener()
        authButtonListener()
        return binding.root
    }

    private fun goBackButtonListener() {
        binding.goBackButton.setOnClickListener {
            FragmentActions.closeFragment(requireActivity().supportFragmentManager, this)
        }
    }

    private fun authButtonListener() {
        binding.authButton.setOnClickListener {
            FragmentActions.closeFragment(requireActivity().supportFragmentManager, this)
        }
    }

    companion object {
        const val TAG = "auth-fragment"
        @JvmStatic
        fun newInstance() = AuthFragment()
    }
}