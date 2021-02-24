package com.example.notes.database

import android.content.Context
import androidx.room.*
import androidx.sqlite.db.SupportSQLiteOpenHelper
import com.example.notes.dao.NoteDao
import com.example.notes.entities.Note

@Database(entities = [Note::class], version = 1, exportSchema = false)
abstract class NotesDatabase : RoomDatabase() {
    private lateinit var notesDatabase: NotesDatabase

    fun getDatabase(context: Context)  = Room.databaseBuilder(
        context, NotesDatabase::class.java, "notes_db").build()

    override fun createOpenHelper(config: DatabaseConfiguration?): SupportSQLiteOpenHelper {
        TODO("Not yet implemented")
    }

    override fun createInvalidationTracker(): InvalidationTracker {
        TODO("Not yet implemented")
    }

    override fun clearAllTables() {
        TODO("Not yet implemented")
    }

    abstract fun noteDao() : NoteDao
}