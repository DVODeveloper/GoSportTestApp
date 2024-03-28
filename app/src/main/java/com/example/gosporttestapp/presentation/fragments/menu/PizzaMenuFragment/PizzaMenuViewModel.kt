package com.example.gosporttestapp.presentation.fragments.menu.PizzaMenuFragment

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.gosporttestapp.data.repository.PizzaListRepositoryImpl
import com.example.gosporttestapp.domain.entity.PizzaCardEntity
import com.example.gosporttestapp.domain.repository.PizzaListRepository
import com.example.gosporttestapp.domain.usecases.GetPizzaListUseCase
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

class PizzaMenuViewModel(
    private val repository: PizzaListRepositoryImpl
) : ViewModel() {

    private val _pizzaList = MutableLiveData<List<PizzaCardEntity>>()
    val pizzaList: LiveData<List<PizzaCardEntity>>
        get() = _pizzaList

     fun getPizzaList() {
        viewModelScope.launch {
            try {
                val pizzaList =  repository.getPizzaList()
                _pizzaList.value = pizzaList.products
            } catch (e: Exception) {
                Log.d("PizzaMenuViewModel", e.toString())
            }
        }
    }

}