package com.example.kotlin1lesson1.ui.fragments

import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kotlin1lesson1.R
import com.example.kotlin1lesson1.databinding.FragmentBooksDetailsBinding
import com.example.kotlin1lesson1.base.BaseFragment

class BooksDetailsFragment : BaseFragment<FragmentBooksDetailsBinding>(
    R.layout.fragment_books_details
) {
    override val binding: FragmentBooksDetailsBinding by viewBinding(FragmentBooksDetailsBinding::bind)
    private val args: BooksDetailsFragmentArgs by navArgs()



    override fun getArgs() {
        binding.tvTitle.text = args.titleFromBooksFragmentToDetails
        binding.tvDescription.text = args.descriptionlFromBooksFragment

    }


}