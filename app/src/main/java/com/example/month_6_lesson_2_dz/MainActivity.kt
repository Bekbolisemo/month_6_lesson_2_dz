package com.example.month_6_lesson_2_dz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.URLUtil

import com.example.month_6_lesson_2_dz.databinding.ActivityMainBinding
import com.example.month_6_lesson_2_dz.extanhion.glide
import com.example.month_6_lesson_2_dz.extanhion.toast

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val arrayUri = mutableListOf(
        "https://i.imgur.com/S05ousl.jpeg",
        "https://i.imgur.com/wJ17Wby.png",
        "https://i.imgur.com/lq1w8yC.jpeg",
        "https://i.imgur.com/lW5jpx1.jpeg"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener {
            if (isItUri()) {
                arrayUri.add(binding.editText.text.toString())
            }
        }

        binding.btnRandom.setOnClickListener {
            toast(getString(R.string.random1))
            binding.image.glide(arrayUri.random().toString())
        }
    }

    private fun isItUri(): Boolean {
        return if (binding.editText.text.toString().isEmpty()) {
            toast(getString(R.string.edit_empty))
            false
        } else {
            if (URLUtil.isValidUrl(binding.editText.text.toString())) {
                toast(getString(R.string.save))
                true
            } else {
                toast("this not url")
                false
            }
        }
    }


}
