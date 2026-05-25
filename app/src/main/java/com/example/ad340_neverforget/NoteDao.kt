// DAO
package com.example.ad340_neverforget

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao{
    //insert(task: Task) - Add a new task.
    @Insert
    suspend fun insert(note: Note)

    //getAllTasks() - Return a Flow<List<Task>> or LiveData<List<Task>>
    @Query("SELECT * FROM notes ORDER BY id DESC")
    fun getAllNotes(): Flow<List<Note>>

    //delete(task: Task) - Remove a specific task.
    @Delete
    suspend fun delete(note: Note)
}