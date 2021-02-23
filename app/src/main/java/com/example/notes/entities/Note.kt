package com.example.notes.entities

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "notes")
class Note : Serializable {

    @PrimaryKey(autoGenerate = true)
    private var id: Int = 0

    @ColumnInfo(name = "title")
    private var title = ""

    @ColumnInfo(name = "date_time")
    private var dateTime = ""

    @ColumnInfo(name = "subtitle")
    private var subtitle = ""

    @ColumnInfo(name = "note_text")
    private var noteText = ""

    @ColumnInfo(name = "image_path")
    private var imagePath = ""

    @ColumnInfo(name = "color")
    private var color = ""

    @ColumnInfo(name = "web_link")
    private var webLink = ""

    @NonNull
    override fun toString(): String {
        return "$title : $dateTime"
    }

}