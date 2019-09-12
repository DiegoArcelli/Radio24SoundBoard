package com.example.supersmashradio24

import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class ZanzaraActivity : AppCompatActivity() {

    lateinit var mpm : MediaPlayerManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zanzara)
        this.supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        mpm = MediaPlayerManager(applicationContext)
        val seiunpesoButton = findViewById(R.id.seiunpeso) as ImageButton
        val ruolodonnaButton = findViewById(R.id.ruolodonna) as ImageButton
        val smettiladiparlareButton = findViewById(R.id.smettiladiparlare) as ImageButton
        val tiarrapanoinegriButton = findViewById(R.id.tiarrapanoinegri) as ImageButton

        seiunpesoButton.setOnTouchListener(View.OnTouchListener { view, motionEvent ->
            when (motionEvent.action){
                MotionEvent.ACTION_DOWN -> {
                    seiunpesoButton.setImageResource(R.drawable.pressed)
                }
                MotionEvent.ACTION_UP -> {
                    seiunpesoButton.setImageResource(R.drawable.unpressed)
                    mpm.playTrack(R.raw.seiunpeso)
                }
            }
            return@OnTouchListener true
        })

        ruolodonnaButton.setOnTouchListener(View.OnTouchListener { view, motionEvent ->
            when (motionEvent.action){
                MotionEvent.ACTION_DOWN -> {
                    ruolodonnaButton.setImageResource(R.drawable.pressed)
                }
                MotionEvent.ACTION_UP -> {
                    ruolodonnaButton.setImageResource(R.drawable.unpressed)
                    mpm.playTrack(R.raw.ruolodonna)
                }
            }
            return@OnTouchListener true
        })

        smettiladiparlareButton.setOnTouchListener(View.OnTouchListener { view, motionEvent ->
            when (motionEvent.action){
                MotionEvent.ACTION_DOWN -> {
                    smettiladiparlareButton.setImageResource(R.drawable.pressed)
                }
                MotionEvent.ACTION_UP -> {
                    smettiladiparlareButton.setImageResource(R.drawable.unpressed)
                    mpm.playTrack(R.raw.smettiladiparlare)
                }
            }
            return@OnTouchListener true
        })

        tiarrapanoinegriButton.setOnTouchListener(View.OnTouchListener { view, motionEvent ->
            when (motionEvent.action){
                MotionEvent.ACTION_DOWN -> {
                    tiarrapanoinegriButton.setImageResource(R.drawable.pressed)
                }
                MotionEvent.ACTION_UP -> {
                    tiarrapanoinegriButton.setImageResource(R.drawable.unpressed)
                    mpm.playTrack(R.raw.tiarrapanoinegri)
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