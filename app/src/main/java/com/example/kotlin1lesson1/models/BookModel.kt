package com.example.kotlin1lesson1.models
import java.io.Serializable

class BookModel (
    val title: String,
    val description: String ,
    val image: Int
        ) : Serializable