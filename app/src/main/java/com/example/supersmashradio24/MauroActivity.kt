package com.example.supersmashradio24

import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MauroActivity : AppCompatActivity() {

    lateinit var mpm : MediaPlayerManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mauro)
        this.supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        mpm = MediaPlayerManager(applicationContext)
        val eebreoButton = findViewById(R.id.seiunpeso) as ImageButton
        val ebreifrocettiButton = findViewById(R.id.ruolodonna) as ImageButton

        eebreoButton.setOnTouchListener(View.OnTouchListener { view, motionEvent ->
            when (motionEvent.action){
                MotionEvent.ACTION_DOWN -> {
                    eebreoButton.setImageResource(R.drawable.pressed)
                }
                MotionEvent.ACTION_UP -> {
                    eebreoButton.setImageResource(R.drawable.unpressed)
                    mpm.playTrack(R.raw.eebreo)
                }
            }
            return@OnTouchListener true
        })

        ebreifrocettiButton.setOnTouchListener(View.OnTouchListener { view, motionEvent ->
            when (motionEvent.action){
                MotionEvent.ACTION_DOWN -> {
                    ebreifrocettiButton.setImageResource(R.drawable.pressed)
                }
                MotionEvent.ACTION_UP -> {
                    ebreifrocettiButton.setImageResource(R.drawable.unpressed)
                    mpm.playTrack(R.raw.ebreifrocetti)
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