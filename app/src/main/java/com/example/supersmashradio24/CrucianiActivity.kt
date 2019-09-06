package com.example.supersmashradio24

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class CrucianiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cruciani)
        this.supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }
}