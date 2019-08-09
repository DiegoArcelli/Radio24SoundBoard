package com.example.supersmashradio24

import android.annotation.SuppressLint
import android.media.MediaPlayer
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class ParenzoActivity : AppCompatActivity() {

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parenzo)
        this.supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        val staizittoButton = findViewById(R.id.staizitto) as ImageButton
        val bastaButton = findViewById(R.id.basta) as ImageButton
        val coglioneButton = findViewById(R.id.coglione) as ImageButton
        val pagatodaassadButton = findViewById(R.id.pagatodaassad) as ImageButton

        staizittoButton.setOnTouchListener(View.OnTouchListener { view, motionEvent ->
            when (motionEvent.action){
                MotionEvent.ACTION_DOWN -> {
                    staizittoButton.setImageResource(R.drawable.pressed)
                }
                MotionEvent.ACTION_UP -> {
                    staizittoButton.setImageResource(R.drawable.unpressed)
                    val mp : MediaPlayer = MediaPlayer.create(applicationContext,R.raw.staizitto)
                    mp.start()
                }
            }
            return@OnTouchListener true
        })

        bastaButton.setOnTouchListener(View.OnTouchListener { view, motionEvent ->
            when (motionEvent.action){
                MotionEvent.ACTION_DOWN -> {
                    bastaButton.setImageResource(R.drawable.pressed)
                }
                MotionEvent.ACTION_UP -> {
                    bastaButton.setImageResource(R.drawable.unpressed)
                    val mp : MediaPlayer = MediaPlayer.create(applicationContext,R.raw.basta)
                    mp.start()
                }
            }
            return@OnTouchListener true
        })

        pagatodaassadButton.setOnTouchListener(View.OnTouchListener { view, motionEvent ->
            when (motionEvent.action){
                MotionEvent.ACTION_DOWN -> {
                    pagatodaassadButton.setImageResource(R.drawable.pressed)
                }
                MotionEvent.ACTION_UP -> {
                    pagatodaassadButton.setImageResource(R.drawable.unpressed)
                    val mp : MediaPlayer = MediaPlayer.create(applicationContext,R.raw.pagatodaassad)
                    mp.start()
                }
            }
            return@OnTouchListener true
        })

        coglioneButton.setOnTouchListener(View.OnTouchListener { view, motionEvent ->
            when (motionEvent.action){
                MotionEvent.ACTION_DOWN -> {
                    coglioneButton.setImageResource(R.drawable.pressed)
                }
                MotionEvent.ACTION_UP -> {
                    coglioneButton.setImageResource(R.drawable.unpressed)
                    val mp : MediaPlayer = MediaPlayer.create(applicationContext,R.raw.leieuncoglione)
                    mp.start()
                }
            }
            return@OnTouchListener true
        })


    }

}