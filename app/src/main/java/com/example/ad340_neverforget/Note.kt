// Task class
package com.example.ad340_neverforget

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="notes")
data class Note(
    //An auto-generated id (Primary Key)
    @PrimaryKey(true)
    val id: Int = 0,
    //A title (String)
    val title: String,
    //A isCompleted status (Boolean)
    val isCompleted: Boolean = false
)