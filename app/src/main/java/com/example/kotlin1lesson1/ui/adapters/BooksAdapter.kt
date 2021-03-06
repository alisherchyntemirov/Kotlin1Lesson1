package com.example.kotlin1lesson1.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin1lesson1.databinding.ItemBooksBinding
import com.example.kotlin1lesson1.interfaces.OnItemClickListener
import com.example.kotlin1lesson1.models.BookModel

class BooksAdapter(

    private val onItemClickListener: OnItemClickListener<BookModel>
)

    : RecyclerView.Adapter<BooksAdapter.BooksViewHolder>() {
    private var list: List<BookModel> = arrayListOf()


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BooksAdapter.BooksViewHolder {
        return BooksViewHolder(
            ItemBooksBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: BooksAdapter.BooksViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    fun setList(list: List<BookModel>) {
        this.list = list
        notifyDataSetChanged()
    }


    override fun getItemCount(): Int {
        return list.size
    }

    inner class BooksViewHolder(private val binding: ItemBooksBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(bookModel: BookModel) {
            binding.tvBooks.text = bookModel.title
            binding.imBooks.setImageResource(bookModel.image)
            binding.root.setOnClickListener {
                onItemClickListener.onClick(bookModel, absoluteAdapterPosition)
            }


        }


    }


}