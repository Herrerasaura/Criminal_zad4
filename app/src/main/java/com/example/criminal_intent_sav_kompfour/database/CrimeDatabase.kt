package com.example.criminal_intent_sav_kompfour.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.criminal_intent_sav_kompfour.Crime

@Database(entities = [ Crime::class ],
    version=1, exportSchema = false)
@TypeConverters(CrimeTypeConverters::class)
abstract class CrimeDatabase : RoomDatabase() {
    abstract fun crimeDao(): CrimeDao
}