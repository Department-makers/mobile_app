package com.example.kafedra.presentation.main

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kafedra.data.models.discipline.Discipline
import com.example.kafedra.databinding.DisciplineItemBinding


class DisciplineseRecyclerViewAdapter (
    private val values: List<Discipline>,
) : RecyclerView.Adapter<DisciplineseRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            DisciplineItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]
        holder.discipline.text = item.name
    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(binding: DisciplineItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val discipline: TextView = binding.disciplineTitle
        val teacher: TextView = binding.teacherFullName

        override fun toString(): String {
            return super.toString() + " '" + discipline.text + "'"
        }
    }
}