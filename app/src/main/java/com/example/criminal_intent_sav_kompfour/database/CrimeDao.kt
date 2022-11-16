package com.example.criminal_intent_sav_kompfour.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.example.criminal_intent_sav_kompfour.Crime
import java.util.*

@Dao
interface CrimeDao {
    @Query("SELECT * FROM crime")
    fun getCrimes(): LiveData<List<Crime>>
    @Query("SELECT * FROM crime WHERE id=(:id)")
    fun getCrime(id: UUID): LiveData<Crime?>
}