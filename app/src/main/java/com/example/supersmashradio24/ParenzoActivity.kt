package com.example.supersmashradio24

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class ParenzoActivity : AppCompatActivity() {

    lateinit var mpm : MediaPlayerManager

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parenzo)
        this.supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        val staizittoButton = findViewById(R.id.staizitto) as ImageButton
        val bastaButton = findViewById(R.id.basta) as ImageButton
        val coglioneButton = findViewById(R.id.coglione) as ImageButton
        val pagatodaassadButton = findViewById(R.id.pagatodaassad) as ImageButton
        val tiportoviatuttoButton = findViewById(R.id.tiportoviatutto) as ImageButton
        val perchihavotatoButton = findViewById(R.id.perchihavotato) as ImageButton
        val vaffanculoButton = findViewById(R.id.vaffanculo) as ImageButton
        val filosofoButton = findViewById(R.id.filosofodeimieicoglioni) as ImageButton
        mpm = MediaPlayerManager(applicationContext)


        staizittoButton.setOnTouchListener(View.OnTouchListener { view, motionEvent ->
            when (motionEvent.action){
                MotionEvent.ACTION_DOWN -> {
                    staizittoButton.setImageResource(R.drawable.pressed)
                }
                MotionEvent.ACTION_UP -> {
                    staizittoButton.setImageResource(R.drawable.unpressed)
                    mpm.playTrack(R.raw.staizitto)
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
                    mpm.playTrack(R.raw.basta)
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
                    mpm.playTrack(R.raw.pagatodaassad)
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
                    mpm.playTrack(R.raw.leieuncoglione)
                }
            }
            return@OnTouchListener true
        })


        tiportoviatuttoButton.setOnTouchListener(View.OnTouchListener { view, motionEvent ->
            when (motionEvent.action){
                MotionEvent.ACTION_DOWN -> {
                    tiportoviatuttoButton.setImageResource(R.drawable.pressed)
                }
                MotionEvent.ACTION_UP -> {
                    tiportoviatuttoButton.setImageResource(R.drawable.unpressed)
                    mpm.playTrack(R.raw.tiportoviatutto)
                }
            }
            return@OnTouchListener true
        })

        perchihavotatoButton.setOnTouchListener(View.OnTouchListener { view, motionEvent ->
            when (motionEvent.action){
                MotionEvent.ACTION_DOWN -> {
                    perchihavotatoButton.setImageResource(R.drawable.pressed)
                }
                MotionEvent.ACTION_UP -> {
                    perchihavotatoButton.setImageResource(R.drawable.unpressed)
                    mpm.playTrack(R.raw.perchihavotato)
                }
            }
            return@OnTouchListener true
        })

        vaffanculoButton.setOnTouchListener(View.OnTouchListener { view, motionEvent ->
            when (motionEvent.action){
                MotionEvent.ACTION_DOWN -> {
                    vaffanculoButton.setImageResource(R.drawable.pressed)
                }
                MotionEvent.ACTION_UP -> {
                    vaffanculoButton.setImageResource(R.drawable.unpressed)
                    mpm.playTrack(R.raw.vaffanculo)
                }
            }
            return@OnTouchListener true
        })

        filosofoButton.setOnTouchListener(View.OnTouchListener { view, motionEvent ->
            when (motionEvent.action){
                MotionEvent.ACTION_DOWN -> {
                    filosofoButton.setImageResource(R.drawable.pressed)
                }
                MotionEvent.ACTION_UP -> {
                    filosofoButton.setImageResource(R.drawable.unpressed)
                    mpm.playTrack(R.raw.filosofodeimieicoglioni)
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