package com.example.notes.activities

import android.icu.text.SimpleDateFormat
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import com.example.notes.R
import java.util.*

class CreateNoteActivity : AppCompatActivity() {

    private lateinit var inputNoteTitle: EditText
    private lateinit var inputNoteSubtitle: EditText
    private lateinit var inputNoteText: EditText
    private lateinit var textDateTime: TextView

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_note)

        val imageBack = findViewById<ImageView>(R.id.imageBack)
        imageBack.setOnClickListener {
            onBackPressed()
        }

        inputNoteTitle = findViewById(R.id.inputNoteTitle)
        inputNoteSubtitle = findViewById(R.id.inputNoteSubtitle)
        inputNoteText = findViewById(R.id.inputNote)
        textDateTime = findViewById(R.id.textDateTime)

        val date = Calendar.getInstance().time
        val formatter = SimpleDateFormat.getDateTimeInstance() //or use getDateInstance()
        val formattedDate = formatter.format(date)
        textDateTime.text = formattedDate.toString()

    }
}