package com.example.criminal_intent_sav_kompfour

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*
import kotlin.properties.Delegates

@Entity
data class Crime(@PrimaryKey val id: UUID =
                     UUID.randomUUID(),
                 var title: String = "",
                 var date: Date = Date(),
                 var isSolved: Boolean = false)

/*
data class Crime (val id: UUID = UUID.randomUUID()){
    var isSolved by Delegates.notNull<Boolean>()
    lateinit var date: Any
    lateinit var title: String
}
*/
