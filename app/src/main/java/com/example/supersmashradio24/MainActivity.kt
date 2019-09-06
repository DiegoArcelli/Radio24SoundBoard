package com.example.supersmashradio24

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val parenzoButton = findViewById(R.id.parenzo) as ImageButton
        val gianninoButton = findViewById(R.id.giannnino) as ImageButton
        val crucianiButton = findViewById(R.id.cruciani) as ImageButton
        val barisoniButton = findViewById(R.id.barisoni) as ImageButton
        val mauroButton = findViewById(R.id.mauro_da_mantova) as ImageButton
        val zanzaraButton = findViewById(R.id.zanzara) as ImageButton

        gianninoButton.setOnClickListener {
            val oscar = Intent(applicationContext,GianninoActivity::class.java)
            startActivity(oscar)
        }
        parenzoButton.setOnClickListener {
            val david = Intent(applicationContext,ParenzoActivity::class.java)
            startActivity(david)
        }

        crucianiButton.setOnClickListener {
            val giuseppe = Intent(applicationContext,CrucianiActivity::class.java)
            startActivity(giuseppe)
        }

        barisoniButton.setOnClickListener {
            val sebastiano = Intent(applicationContext,BarisoniActivity::class.java)
            startActivity(sebastiano)
        }

        mauroButton.setOnClickListener {
            val mauro = Intent(applicationContext,MauroActivity::class.java)
            startActivity(mauro)
        }

        zanzaraButton.setOnClickListener {
            val zanzara = Intent(applicationContext,ZanzaraActivity::class.java)
            startActivity(zanzara)
        }

    }
}
