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
        val stronzamenzognaButton = findViewById(R.id.stronzamenzogna) as ImageButton
        val paesefascistaButton = findViewById(R.id.paesefascista) as ImageButton
        val cacciatiButton = findViewById(R.id.cacciati) as ImageButton
        val ladreriaButton = findViewById(R.id.ladreria) as ImageButton
        //var mp : MediaPlayer = MediaPlayer.create(applicationContext,R.raw.statoladro)
        var mpm : MediaPlayerManager = MediaPlayerManager(applicationContext)

        tacimiserabileButton.setOnTouchListener(View.OnTouchListener { view, motionEvent ->
            when (motionEvent.action){
                MotionEvent.ACTION_DOWN -> {
                    tacimiserabileButton.setImageResource(R.drawable.pressed)
                }
                MotionEvent.ACTION_UP -> {
                    tacimiserabileButton.setImageResource(R.drawable.unpressed)
                    mpm.playTrack(R.raw.tacimiserabile)
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
                    mpm.playTrack(R.raw.statoladro)
                }
            }
            return@OnTouchListener true
        })

        stronzamenzognaButton.setOnTouchListener(View.OnTouchListener { view, motionEvent ->
            when (motionEvent.action){
                MotionEvent.ACTION_DOWN -> {
                    stronzamenzognaButton.setImageResource(R.drawable.pressed)
                }
                MotionEvent.ACTION_UP -> {
                    stronzamenzognaButton.setImageResource(R.drawable.unpressed)
                    mpm.playTrack(R.raw.stronzamenzogna)
                }
            }
            return@OnTouchListener true
        })

        paesefascistaButton.setOnTouchListener(View.OnTouchListener { view, motionEvent ->
            when (motionEvent.action){
                MotionEvent.ACTION_DOWN -> {
                    paesefascistaButton.setImageResource(R.drawable.pressed)
                }
                MotionEvent.ACTION_UP -> {
                    paesefascistaButton.setImageResource(R.drawable.unpressed)
                    mpm.playTrack(R.raw.unpaesefascista)
                }
            }
            return@OnTouchListener true
        })

        cacciatiButton.setOnTouchListener(View.OnTouchListener { view, motionEvent ->
            when (motionEvent.action){
                MotionEvent.ACTION_DOWN -> {
                    cacciatiButton.setImageResource(R.drawable.pressed)
                }
                MotionEvent.ACTION_UP -> {
                    cacciatiButton.setImageResource(R.drawable.unpressed)
                    mpm.playTrack(R.raw.cacciati)
                }
            }
            return@OnTouchListener true
        })

        ladreriaButton.setOnTouchListener(View.OnTouchListener { view, motionEvent ->
            when (motionEvent.action){
                MotionEvent.ACTION_DOWN -> {
                    ladreriaButton.setImageResource(R.drawable.pressed)
                }
                MotionEvent.ACTION_UP -> {
                    ladreriaButton.setImageResource(R.drawable.unpressed)
                    mpm.playTrack(R.raw.ladreria)
                }
            }
            return@OnTouchListener true
        })

    }
}