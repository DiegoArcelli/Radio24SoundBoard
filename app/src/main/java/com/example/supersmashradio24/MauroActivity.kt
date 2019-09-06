package com.example.supersmashradio24

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MauroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_barisoni)
        this.supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }

}