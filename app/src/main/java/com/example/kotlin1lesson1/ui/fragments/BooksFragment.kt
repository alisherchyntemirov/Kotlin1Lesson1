package com.example.kotlin1lesson1.ui.fragments


import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kotlin1lesson1.R
import com.example.kotlin1lesson1.databinding.FragmentBooksBinding
import com.example.kotlin1lesson1.base.BaseFragment
import com.example.kotlin1lesson1.interfaces.OnItemClickListener
import com.example.kotlin1lesson1.models.BookModel
import com.example.kotlin1lesson1.ui.adapters.BooksAdapter


class BooksFragment : BaseFragment<FragmentBooksBinding>(
    R.layout.fragment_books
), OnItemClickListener<BookModel> {
    override val binding: FragmentBooksBinding by viewBinding(FragmentBooksBinding::bind)
    private val viewModel: BooksViewModel by activityViewModels()
    private val adapter = BooksAdapter(this)

    override fun initAdapter() {
        adapter.setList(viewModel.getBooks())
        binding.recyclerview.adapter = adapter

    }

    override fun onClick(model: BookModel, position: Int) {
        findNavController().navigate(
            BooksFragmentDirections.actionBooksFragmentToBooksDetailsFragment(
                model.description, model.title
            )
        )

    }


}