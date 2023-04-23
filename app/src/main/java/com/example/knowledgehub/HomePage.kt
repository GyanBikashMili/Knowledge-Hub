package com.example.knowledgehub

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import androidx.cardview.widget.CardView

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        val btnIntent1 = findViewById<CardView>(R.id.androidcard)
        val btnIntent2 = findViewById<CardView>(R.id.Webcard)
        val btnIntent3 = findViewById<CardView>(R.id.IOScard)
        val btnIntent4 = findViewById<CardView>(R.id.MLcard)
        val btnIntent5 = findViewById<CardView>(R.id.blockchaincard)
        val btnIntent6 = findViewById<CardView>(R.id.CyberSecuritycard)
        val btncall = findViewById<Button>(R.id.button_call_us)

        btnIntent1.setOnClickListener {
            // open a new activity
            intent = Intent(applicationContext, Android::class.java)
            startActivity(intent)
        }
        btnIntent2.setOnClickListener {
            // open a new activity
            intent = Intent(applicationContext, WebDev::class.java)
            startActivity(intent)
        }
        btnIntent3.setOnClickListener {
            // open a new activity
            intent = Intent(applicationContext, IOSdev::class.java)
            startActivity(intent)
        }
        btnIntent4.setOnClickListener {
            // open a new activity
            intent = Intent(applicationContext, MachineL::class.java)
            startActivity(intent)
        }
        btnIntent5.setOnClickListener {
            // open a new activity
            intent = Intent(applicationContext, BlockChain::class.java)
            startActivity(intent)
        }
        btnIntent6.setOnClickListener {
            // open a new activity
            intent = Intent(applicationContext, Cyber::class.java)
            startActivity(intent)
        }
        btncall.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:9957931")
            startActivity(intent)
        }

    }
}