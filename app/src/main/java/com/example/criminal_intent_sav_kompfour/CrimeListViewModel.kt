package com.example.criminal_intent_sav_kompfour

import androidx.lifecycle.ViewModel

class CrimeListViewModel : ViewModel() {

    private val crimeRepository = CrimeRepository.get()
    val crimeListLiveData = crimeRepository.getCrimes()
}