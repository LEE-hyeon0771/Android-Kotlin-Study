package org.techtown.inflater

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            layoutInflater.inflate(R.layout.part1, container, true)
        //part1.xml을 activity_main.xml의 id : container인 곳에 붙여줘 - layoutInflater
        }
    }
}