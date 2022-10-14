package com.example.kabir


import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.kabir.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding=DataBindingUtil. setContentView(this,R.layout.activity_main)

        with(binding){

            Ajay.setOnClickListener {
                Toast.makeText(this@MainActivity, "click on Ajay", Toast.LENGTH_SHORT).show()
                val intent=Intent(this@MainActivity,DetailActivity::class.java)
                intent.putExtra("ajay","ajay")

                intent.putExtra("image",R.drawable.img)

                startActivity(intent)
            }
            Akshay.setOnClickListener {
                Toast.makeText(this@MainActivity, "click on Akshy", Toast.LENGTH_SHORT).show()
                val intent=Intent(this@MainActivity,DetailActivity::class.java)
                startActivity(intent)
            }
            Salman.setOnClickListener {
                Toast.makeText(this@MainActivity, "click on Salman ", Toast.LENGTH_SHORT).show()
                val intent=Intent(this@MainActivity,DetailActivity::class.java)
                startActivity(intent)
            }
            Sahurakh.setOnClickListener {
                Toast.makeText(this@MainActivity, "click on Sahrukh", Toast.LENGTH_SHORT).show()
                val intent=Intent(this@MainActivity,DetailActivity::class.java)
                startActivity(intent)
            }

        }

    }
}