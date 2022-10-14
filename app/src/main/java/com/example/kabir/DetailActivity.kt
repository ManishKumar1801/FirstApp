package com.example.kabir

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.kabir.databinding.ActivityDetailBinding


class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    private var imagevalue=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_detail)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_detail)

        with(binding){

            val name=intent.getStringExtra("name")
            if (name=="ajay"){
                Discription.text="ajay devgani s veryg ood avtor hei s nerysk fjfus kdkfkjj sgdtyrhfn jksjfjfkfk"
                val bundle = intent.extras


                if (bundle != null) {
                    imagevalue = bundle.getInt("image")
                }
                image.setImageResource(imagevalue)
            }
            if (name=="akshy"){
                Discription.text="akshy kumar is very g ood avtor hei s nerysk fjfus kdkfkjj sgdtyrhfn jksjfjfkfk"
            }
            if (name=="ajay"){
                Discription.text="ajay devgani s veryg ood avtor hei s nerysk fjfus kdkfkjj sgdtyrhfn jksjfjfkfk"
            }
            if (name=="ajay"){
                Discription.text="ajay devgani s veryg ood avtor hei s nerysk fjfus kdkfkjj sgdtyrhfn jksjfjfkfk"
            }
        }
    }
}