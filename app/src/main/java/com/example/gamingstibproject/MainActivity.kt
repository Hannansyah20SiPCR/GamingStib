package com.example.gamingstibproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.ScaleGestureDetector
import android.widget.Button
import kotlinx.android.synthetic.main.activity_getstarted.*

class MainActivity : AppCompatActivity() {

    private lateinit var scaleGestureDetector: ScaleGestureDetector
    private var scaleFactor = 1.0f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_getstarted)
        scaleGestureDetector = ScaleGestureDetector(this, ScaleListener())

        val loginbtn = findViewById<Button>(R.id.loginbtn)

        loginbtn.setOnClickListener {

        }

        val Button = findViewById<Button>(R.id.loginbtn)
        loginbtn.setOnClickListener {
            val intent = Intent ( this, SignIn::class.java)
            startActivity(intent)
        }
    }

    override fun onTouchEvent(motionEvent: MotionEvent): Boolean {
        scaleGestureDetector.onTouchEvent(motionEvent)
        return true
    }

    private inner class ScaleListener : ScaleGestureDetector.SimpleOnScaleGestureListener(),
        ScaleGestureDetector.OnScaleGestureListener {
        override fun onScale(scaleGestureDetector: ScaleGestureDetector): Boolean {
            scaleFactor *= scaleGestureDetector.scaleFactor
            scaleFactor = Math.max(0.1f, Math.min(scaleFactor, 10.0f))
            gamelogo.scaleX = scaleFactor
            gamelogo.scaleY = scaleFactor
            return true
        }
    }
}