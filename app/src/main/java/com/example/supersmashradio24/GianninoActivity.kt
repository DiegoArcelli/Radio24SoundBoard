package com.example.supersmashradio24

import androidx.appcompat.app.AppCompatActivity
import android.annotation.SuppressLint
import android.media.MediaPlayer
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.ImageButton


class GianninoActivity : AppCompatActivity() {

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_giannino)
        this.supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        val tacimiserabileButton = findViewById(R.id.tacimiserabile) as ImageButton
        val statoladroButton = findViewById(R.id.statoladro) as ImageButton
        tacimiserabileButton.setOnTouchListener(View.OnTouchListener { view, motionEvent ->
            when (motionEvent.action){
                MotionEvent.ACTION_DOWN -> {
                    tacimiserabileButton.setImageResource(R.drawable.pressed)
                }
                MotionEvent.ACTION_UP -> {
                    tacimiserabileButton.setImageResource(R.drawable.unpressed)
                    val mp : MediaPlayer = MediaPlayer.create(applicationContext,R.raw.tacimiserabile)
                    mp.start()
                }
            }
            return@OnTouchListener true
        })
        statoladroButton.setOnTouchListener(View.OnTouchListener { view, motionEvent ->
            when (motionEvent.action){
                MotionEvent.ACTION_DOWN -> {
                    statoladroButton.setImageResource(R.drawable.pressed)
                }
                MotionEvent.ACTION_UP -> {
                    statoladroButton.setImageResource(R.drawable.unpressed)
                    val mp : MediaPlayer = MediaPlayer.create(applicationContext,R.raw.statoladro)
                    mp.start()
                }
            }
            return@OnTouchListener true
        })
    }
}