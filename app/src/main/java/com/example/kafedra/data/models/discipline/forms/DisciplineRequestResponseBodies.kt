package com.example.kafedra.data.models.discipline.forms

import com.example.kafedra.data.models.discipline.Discipline

class DisciplineRequestResponseBodies {
    data class DisciplineByTeacherRequest(
        val user_id: Long
    )

    data class DisciplineByGroupRequest(
        val group_id: Long
    )

    data class DisciplineResponse(
        val code: Int,
        val subjects: List<Discipline>
    )
}