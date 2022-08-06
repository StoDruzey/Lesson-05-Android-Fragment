package com.example.lesson05androidfragment

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson05androidfragment.databinding.ItemNoteBinding

class NotesAdapter(private val items: String) : RecyclerView.Adapter<NoteViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}

class NoteViewHolder(private val binding: ItemNoteBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(item: String) {
        binding.textNote.text = item
    }
}