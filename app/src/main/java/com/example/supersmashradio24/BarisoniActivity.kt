package com.example.supersmashradio24

import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class BarisoniActivity : AppCompatActivity()  {

    lateinit var mpm : MediaPlayerManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_barisoni)
        this.supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        mpm = MediaPlayerManager(applicationContext)
        val seminerioButton = findViewById(R.id.seiunpeso) as ImageButton
        val furettoButton = findViewById(R.id.ruolodonna) as ImageButton
        val ebreosconsolatoButton = findViewById(R.id.ebreosconsolato) as ImageButton
        val abitocostosoButton = findViewById(R.id.abitocostoso) as ImageButton

        seminerioButton.setOnTouchListener(View.OnTouchListener { view, motionEvent ->
            when (motionEvent.action){
                MotionEvent.ACTION_DOWN -> {
                    seminerioButton.setImageResource(R.drawable.pressed)
                }
                MotionEvent.ACTION_UP -> {
                    seminerioButton.setImageResource(R.drawable.unpressed)
                    mpm.playTrack(R.raw.seminerio)
                }
            }
            return@OnTouchListener true
        })

        furettoButton.setOnTouchListener(View.OnTouchListener { view, motionEvent ->
            when (motionEvent.action){
                MotionEvent.ACTION_DOWN -> {
                    furettoButton.setImageResource(R.drawable.pressed)
                }
                MotionEvent.ACTION_UP -> {
                    furettoButton.setImageResource(R.drawable.unpressed)
                    mpm.playTrack(R.raw.unfuretto)
                }
            }
            return@OnTouchListener true
        })

        ebreosconsolatoButton.setOnTouchListener(View.OnTouchListener { view, motionEvent ->
            when (motionEvent.action){
                MotionEvent.ACTION_DOWN -> {
                    ebreosconsolatoButton.setImageResource(R.drawable.pressed)
                }
                MotionEvent.ACTION_UP -> {
                    ebreosconsolatoButton.setImageResource(R.drawable.unpressed)
                    mpm.playTrack(R.raw.ebreosconsolato)
                }
            }
            return@OnTouchListener true
        })

        abitocostosoButton.setOnTouchListener(View.OnTouchListener { view, motionEvent ->
            when (motionEvent.action){
                MotionEvent.ACTION_DOWN -> {
                    abitocostosoButton.setImageResource(R.drawable.pressed)
                }
                MotionEvent.ACTION_UP -> {
                    abitocostosoButton.setImageResource(R.drawable.unpressed)
                    mpm.playTrack(R.raw.abitocostoso)
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