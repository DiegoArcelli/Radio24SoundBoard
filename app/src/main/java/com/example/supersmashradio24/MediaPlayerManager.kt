package com.example.supersmashradio24

import android.content.Context
import android.media.MediaPlayer
import android.util.Log
import java.lang.Exception

class MediaPlayerManager {

    lateinit var mp : MediaPlayer
    lateinit var ctx : Context

    constructor(ctx: Context){
        this.ctx = ctx
        mp = MediaPlayer.create(ctx,R.raw.ladreria)
    }

    fun playTrack(ind : Int){
        if(mp.isPlaying)
            mp.release()
        mp = MediaPlayer.create(ctx,ind)
        mp.start()
    }

}