package com.satellitestudio.mimascota.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tabla_mascota")
data class Pet(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    val nombre: String,
    val raza: String,
    val edad: Int,
    val tipo: String // Ej: "Perro", "Gato"
)