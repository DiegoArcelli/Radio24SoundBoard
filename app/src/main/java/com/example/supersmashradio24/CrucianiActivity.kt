package com.example.supersmashradio24

import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class CrucianiActivity : AppCompatActivity() {

    lateinit var mpm : MediaPlayerManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cruciani)
        this.supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        mpm = MediaPlayerManager(applicationContext)
        val cittaButton = findViewById(R.id.inqualecitta) as ImageButton

        cittaButton.setOnTouchListener(View.OnTouchListener { view, motionEvent ->
            when (motionEvent.action){
                MotionEvent.ACTION_DOWN -> {
                    cittaButton.setImageResource(R.drawable.pressed)
                }
                MotionEvent.ACTION_UP -> {
                    cittaButton.setImageResource(R.drawable.unpressed)
                    mpm.playTrack(R.raw.inqualecitta)
                }
            }
            return@OnTouchListener true
        })

    }

    override fun onDestroy() {
        super.onDestroy()
        mpm.stop()
    }
}