package com.example.supersmashradio24

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ZanzaraActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zanzara)
        this.supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }

}