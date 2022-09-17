package com.example.kotlinminiproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        supportActionBar!!.hide()
        setContentView(R.layout.activity_main)

        val emailEt=findViewById<EditText>(R.id.email);
        val passEt=findViewById<EditText>(R.id.password);

        login.setOnClickListener {




            if (email.text.isNullOrBlank()&&password.text.isNullOrBlank())
            {
                Toast.makeText(this,"Please fill the required fields",Toast.LENGTH_SHORT).show()
            }
            else
            {
                Toast.makeText(this,"${email.text} is logged in!!",Toast.LENGTH_SHORT).show()
            }
            startActivity(Intent(this,HomeActivity::class.java))


            val emailt=emailEt.text.toString()
            val passt=passEt.text.toString()

            val intent=Intent(this,DetailActivity::class.java)

            intent.putExtra("Email",emailt)
            intent.putExtra("Password",passt)

            startActivity(intent)

        }
    }
}