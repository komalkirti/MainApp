package com.example.mainapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private var btnsignup: Button?=null
    private var btnlogin: Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnsignup = findViewById<View>(R.id.btnsignup) as Button
        btnlogin = findViewById<View>(R.id.btnlogin) as Button
    }

    public fun SignUp( view: View){
        val intent = Intent(this@MainActivity,RegisterActivity::class.java)
        startActivity(intent)
    }
    public fun Login( view: View){
        val intent = Intent(this@MainActivity,LoginActivity::class.java)
        startActivity(intent)
    }
}
