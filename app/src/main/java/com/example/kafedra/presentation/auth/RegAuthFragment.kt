package com.example.kafedra.presentation.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.kafedra.R
import com.example.kafedra.databinding.FragmentRegAuthBinding
import com.example.kafedra.presentation.FragmentActions


class RegAuthFragment : Fragment() {
    private lateinit var binding: FragmentRegAuthBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRegAuthBinding.inflate(inflater)
        regButtonListener()
        authButtonListener()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        regButtonListener()
    }

    private fun regButtonListener() {
        binding.regButton.setOnClickListener {
            FragmentActions.openFragment(
                requireActivity().supportFragmentManager,
                RegistrationFragment(),
                RegistrationFragment.TAG
            )
        }
    }

    private fun authButtonListener() {
        binding.authButton.setOnClickListener {
            FragmentActions.openFragment(
                requireActivity().supportFragmentManager,
                AuthFragment(),
                AuthFragment.TAG
            )
        }
    }

    companion object {
        const val TAG = "reg-auth-fragment"
        @JvmStatic
        fun newInstance() = RegAuthFragment()
    }
}