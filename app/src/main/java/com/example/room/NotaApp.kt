package com.example.room

import android.app.Application
import androidx.room.Room

class NotaApp:Application() {

    lateinit var baseDeDatos:NotasDB

    override fun onCreate() {
        super.onCreate()
        baseDeDatos = Room
                .databaseBuilder(this,NotasDB::class.java,"notas_db")
                .build()

    }

}