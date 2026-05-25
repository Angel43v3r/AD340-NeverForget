package com.example.ad340_neverforget

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class NoteViewModel (application: Application) : AndroidViewModel(application){

    private val dao = NoteDatabase.getDatabase(application).noteDao()

    val allNotes = dao.getAllNotes().stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000),
        initialValue = emptyList()
    )

    fun insert(title: String) {
        if (title.isBlank()) {
            return
        }
        viewModelScope.launch {
            dao.insert(Note(title=title.trim()))
        }
    }

    fun delete(note: Note) {
        viewModelScope.launch {
            dao.delete(note)
        }
    }
}