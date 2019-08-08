package com.example.supersmashradio24

import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class ParenzoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parenzo)
        this.supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        var staizittoButton = findViewById(R.id.staizitto) as ImageButton
        staizittoButton.setOnClickListener {
            val mp : MediaPlayer = MediaPlayer.create(applicationContext,R.raw.staizitto)
            mp.start()
        }

    }
}