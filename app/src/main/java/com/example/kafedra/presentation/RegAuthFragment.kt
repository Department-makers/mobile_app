package com.example.kafedra.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kafedra.R
import com.example.kafedra.databinding.FragmentRegAuthBinding

class RegAuthFragment : Fragment() {
    private lateinit var binding: FragmentRegAuthBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRegAuthBinding.inflate(inflater)
        return binding.root
    }

    companion object {
        const val TAG = "reg-auth-fragment"
        @JvmStatic
        fun newInstance() = RegAuthFragment()
    }
}