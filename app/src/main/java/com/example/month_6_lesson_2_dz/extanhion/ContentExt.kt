package com.example.month_6_lesson_2_dz.extanhion

import android.content.Context
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide

fun ImageView.glide(image: String){
    Glide.with(this).load(image).circleCrop().into(this)
}
fun Context.toast(massage: String){
    Toast.makeText(this,massage,Toast.LENGTH_SHORT).show()
}