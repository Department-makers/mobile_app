package com.example.kafedra.data.models.discipline

import com.example.kafedra.data.models.discipline.forms.DisciplineRequestResponseBodies.*
import retrofit2.http.Body
import retrofit2.http.POST
import javax.net.ssl.*


interface DisciplineApi {
    @POST("group_subjects")
    suspend fun groupSubjects(@Body body: DisciplineByTeacherRequest): DisciplineResponse

    @POST("teacher_subjects")
    suspend fun teacherSubjects(@Body body: DisciplineByGroupRequest): DisciplineResponse
}