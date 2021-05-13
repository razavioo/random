package com.example.random.ui.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.random.model.data.repository.HomeDataRepository
import com.example.random.model.domain.Animal
import com.example.random.model.domain.Elephant
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {
    val text = MutableLiveData<String>().apply {
        value = HomeDataRepository.getHomeData()
    }

    val animals: MutableLiveData<List<Animal>> = MutableLiveData<List<Animal>>().apply {
        value = HomeDataRepository.getAnimals()
    }

    val elephants: MutableLiveData<List<Elephant>> = MutableLiveData<List<Elephant>>()

    fun loadData() {
        viewModelScope.launch {
            val data = HomeDataRepository.getElephants()
            elephants.postValue(data)
        }
    }
}