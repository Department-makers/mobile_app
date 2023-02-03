package com.example.kafedra.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.kafedra.data.models.discipline.Discipline


class KafedraViewModel : ViewModel() {
    val disciplines: MutableLiveData<List<Discipline>> by lazy {
        MutableLiveData<List<Discipline>>()
    }

    fun getDisciplines() {
        disciplines.value =
            mutableListOf(
                Discipline(1, 2, "Дискретная математика"),
                Discipline(2, 2, "Математический анализ"),
                Discipline(3, 2, "Базы данных"),
                Discipline(4, 2, "Технология разработки программного обеспечения"),
                Discipline(5, 2, "Мобильная разработка"),
            )
    }
//        disciplines = liveData {
////            listOf(
////                Discipline(1, 2, "Name"),
////                Discipline(1, 2, "Name"),
////                Discipline(1, 2, "Name"),
////                Discipline(1, 2, "Name"),
////            )
//            Discipline(1, 2, "Name")
//
//            Discipline(1, 2, "Name")
//            Discipline(1, 2, "Name")
//
//        }
//    }
}