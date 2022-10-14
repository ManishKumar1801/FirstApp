package com.example.kabir

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.kabir.databinding.ActivityDetailBinding
import com.example.kabir.databinding.ActivityMainBinding


class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_detail)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_detail)

        with(binding){

            val name=intent.getStringExtra("ajay")
            if (name=="ajay"){
                Discription.text="ajay devgani s veryg ood avtor hei s nerysk fjfus kdkfkjj sgdtyrhfn jksjfjfkfk"
            }
        }
    }
}