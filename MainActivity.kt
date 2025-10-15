/**
 * Course Code: MAD204
 * Lab Number: 2
 * Student Name: Jennyfer Parmar
 * Student ID: A00201240
 * Date: 2025-10-14
 * Description:
 This app implements a simple Login + Greeting system.
 The user enters an email and password on the login screen.
 When they click Login, the app passes the username to the second screen,
 which displays “Welcome, [Name]!” and provides a Logout button.
 */

package com.example.lab2loginapp

import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    //declare UI elements
    private lateinit var editEmail: EditText
    private lateinit var editPassword: EditText
    private lateinit var btnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        //link kotlin variables with XML widgets using their IDs
        setContentView(R.layout.activity_main)
        val editEmail= findViewById<EditText>(R.id.editEmail)
        val  editPassword=findViewById <EditText>(R.id.editPassword)
        val  btnLogin=findViewById<Button>(R.id.btnlogin)

        //Handle login button click
        btnLogin.setOnClickListener{
            val  email=editEmail.text.toString()
            val password=editPassword.toString()
        //extract the name from email before '@' , otherwise use 'Guest'
            val name= if (email.contains("@")) email.substringBefore("@") else "Guest"
//create an intent to move from MainActivity to Second activity
           val intent= Intent(this, SecondActivity::class.java)
          //pass the user's name to the next screen
            intent.putExtra("USERNAME",name)
           //start the greeting screen
            startActivity(intent)

        }

        }
    }
