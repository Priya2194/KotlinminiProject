package com.example.kotlinminiproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val intent=intent
               val email=intent.getStringExtra("Email")

        val password=intent.getStringExtra("Password")

        val result=findViewById<TextView>(R.id.result)

        result.text=" Email: " + email +  "\nPassword: "+password

        Handler().postDelayed(
            {
                startActivity(Intent(this,HomeActivity::class.java))
                finish()
            },1000

        )
    }

}