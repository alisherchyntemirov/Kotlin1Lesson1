package com.example.kotlin1lesson1.ui.fragments

import androidx.lifecycle.ViewModel
import com.example.kotlin1lesson1.data.client.BookClient
import com.example.kotlin1lesson1.models.BookModel

class BooksViewModel : ViewModel() {
    fun getBooks() : List <BookModel>{
        return BookClient().getBooks()
    }
}