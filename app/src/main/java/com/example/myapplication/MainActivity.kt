package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe(view: View) {
        val toast = Toast.makeText(this, "Toast Me!!!", Toast.LENGTH_SHORT)

        toast.show()
    }

    fun countMe(view: View) {
        val countString = textView.text.toString()
        var count = countString.toInt()

        count++
        textView.setText(count.toString())
    }

    fun randomMe(view: View) {

        val randomIntent = Intent(this, SecondActivity::class.java)

        val countString = textView.text.toString()
        val count = Integer.parseInt(countString)
        randomIntent.putExtra(SecondActivity.TOTAL_COUNT, count)
        startActivity(randomIntent)

    }
}
