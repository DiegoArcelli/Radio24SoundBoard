package com.example.supersmashradio24

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //this.supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        var parenzoButton = findViewById(R.id.parenzo) as ImageButton
        parenzoButton.setOnClickListener {
            val david = Intent(applicationContext,ParenzoActivity::class.java)
            startActivity(david)
        }
    }
}
