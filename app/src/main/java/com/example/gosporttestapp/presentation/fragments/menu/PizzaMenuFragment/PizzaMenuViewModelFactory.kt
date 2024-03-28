package com.example.gosporttestapp.presentation.fragments.menu.PizzaMenuFragment

import androidx.lifecycle.LifecycleCoroutineScope
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.gosporttestapp.data.repository.PizzaListRepositoryImpl
import java.lang.IllegalArgumentException

//@Suppress("UNCHECKED_CAST")
class PizzaMenuViewModelFactory(
    private val repository: PizzaListRepositoryImpl
): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(PizzaMenuViewModel::class.java)) {
            return PizzaMenuViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}