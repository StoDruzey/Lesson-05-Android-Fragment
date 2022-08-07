package com.example.lesson05androidfragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson05androidfragment.databinding.ItemNoteBinding

class NotesAdapter(
    private val items: List<String>,
    private val itemClick: (String) -> Unit
) : RecyclerView.Adapter<NoteViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return NoteViewHolder(
            binding = ItemNoteBinding.inflate(layoutInflater, parent, false),
            itemClick = itemClick
        )
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }
}

class NoteViewHolder(
    private val binding: ItemNoteBinding,
    private val itemClick: (String) -> Unit
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(item: String) {
        binding.textNote.text = item
        binding.root.setOnClickListener {
            itemClick(item)
        }
    }
}