package com.example.gamingstibproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import kotlinx.android.synthetic.main.activity_signin.*


class SignIn : AppCompatActivity() {



    var mAuth: FirebaseAuth? = null
    var mUser: FirebaseUser? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        val signin = findViewById<Button>(R.id.btnsgn)
        val signup = findViewById<TextView>(R.id.TextSignUp)

        TextSignUp.setOnClickListener {
            startActivity(intent)
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)
        }

        val Button = findViewById<Button>(R.id.btnsgn)
        btnsgn.setOnClickListener {
            val intent = Intent(this, MenuUtama::class.java)
            startActivity(intent)
        }
    }
}