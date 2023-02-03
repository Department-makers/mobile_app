package com.example.kafedra.presentation.main

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kafedra.databinding.FragmentDisciplineListBinding
import com.example.kafedra.presentation.KafedraViewModel

class DisciplineListFragment : Fragment() {
    private lateinit var binding: FragmentDisciplineListBinding
    private val viewModel: KafedraViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDisciplineListBinding.inflate(inflater)
        viewModel.getDisciplines()
        binding.disciplineList.layoutManager = LinearLayoutManager(context)
        Log.d("MyLog", viewModel.disciplines.value.toString())
        binding.disciplineList.adapter = DisciplineseRecyclerViewAdapter(viewModel.disciplines.value!!)
        return binding.root
    }


    companion object {
        const val TAG = "discipline-list-fragment"
        @JvmStatic
        fun newInstance() = DisciplineListFragment()
    }
}