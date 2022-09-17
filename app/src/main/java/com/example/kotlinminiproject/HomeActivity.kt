package com.example.kotlinminiproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.SearchView
import kotlinx.android.synthetic.main.activity_home.*
import kotlin.system.exitProcess

class HomeActivity : AppCompatActivity() {

    lateinit var adapter: ArrayAdapter<*>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        Toast.makeText(this, "Open HomeActivity ", Toast.LENGTH_SHORT).show()

        button.setOnClickListener {

           // val language:Array<String> =resources.getStringArray(R.array.lang_name)

          //  val arrayAdapter= ArrayAdapter <String>(this,android.R.layout.simple_list_item_1,language)


            adapter = ArrayAdapter<Any?>(this, android.R.layout.simple_list_item_1,
                resources.getStringArray(R.array.lang_name))
            list.adapter = adapter
            //list.adapter=arrayAdapter

            list.setOnItemClickListener { adapterView, view, i, l ->
                if (i==0)
                {

                    Toast.makeText(this,"C Clicked",Toast.LENGTH_SHORT).show()
                }
                if (i==1)
                {
                    Toast.makeText(this,"C++ Clicked",Toast.LENGTH_SHORT).show()
                }
                if (i==2)
                {
                    Toast.makeText(this,"Java Clicked",Toast.LENGTH_SHORT).show()
                }
                if (i==3)
                {
                    Toast.makeText(this,"Php Clicked",Toast.LENGTH_SHORT).show()
                }
                if (i==4)
                {
                    Toast.makeText(this,"Kotlin Clicked",Toast.LENGTH_SHORT).show()
                }
                if (i==5)
                {
                    Toast.makeText(this,"Android Clicked",Toast.LENGTH_SHORT).show()
                }
                if (i==6)
                {
                    Toast.makeText(this,"Angular Clicked",Toast.LENGTH_SHORT).show()
                }
                if (i==7)
                {
                    Toast.makeText(this,"Ruby Clicked",Toast.LENGTH_SHORT).show()
                }
                if (i==8)
                {
                    Toast.makeText(this,"Swift Clicked",Toast.LENGTH_SHORT).show()
                }
                if (i==9)
                {
                    Toast.makeText(this,"Dart Clicked",Toast.LENGTH_SHORT).show()
                }
                if (i==10)
                {
                    Toast.makeText(this,"Python Clicked",Toast.LENGTH_SHORT).show()
                }
                if (i==11)
                {
                    Toast.makeText(this,"JavaScript Clicked",Toast.LENGTH_SHORT).show()
                }

            }
        }
    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean
    {
        menuInflater.inflate(R.menu.menu, menu)

        val search=menu.findItem(R.id.search)
        val searchView=search.actionView as SearchView
        searchView.queryHint="Search"

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener
        {
            override fun onQueryTextSubmit(query: String?): Boolean
            {
                return false
            }
            override fun onQueryTextChange(newText: String?): Boolean
            {

                adapter.filter.filter(newText)
                return true
            }
        })
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val id = item.itemId
        if (id == R.id.logout)
        {

            val builder = AlertDialog.Builder(this)
            builder.setTitle("Alert")
            builder.setMessage("Do you want to logout... ")
            builder.setIcon(R.drawable.add_alert_24)

            builder.setPositiveButton("Yes") { dialoagInterface, which ->
                Toast.makeText(this, "You Click Yes", Toast.LENGTH_SHORT).show()
                moveTaskToBack(true);
                exitProcess(-1)

            }
            builder.setNegativeButton("No") { dialogInterface, which ->
                Toast.makeText(this, "You click No", Toast.LENGTH_SHORT).show()
            }
            val alertDialog: AlertDialog = builder.create()
            alertDialog.setCancelable(false)
            alertDialog.show()
        }

        return super.onOptionsItemSelected(item)

    }
    }