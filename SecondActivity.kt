/**
 * SecondActivity:
 * This activity displays a greeting using the username passed from MainActivity.
 * It also provides a Logout button to return to the login screen.
 */
package com.example.lab2loginapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
/**
 * onCreate:
 * Initializes the layout, retrieves the username from the Intent,
 * and sets up the Logout button listener.*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // IDs match the XML above
        val txtGreeting = findViewById<TextView>(R.id.greetingText)
        val btnLogout = findViewById<Button>(R.id.btnLogout)

        // Get name from MainActivity (or use "Guest")
        val name = intent.getStringExtra("USERNAME") ?: "Guest"
        txtGreeting.text = "Welcome, $name!"

        // Logout button listener- returns to MainActivity
        btnLogout.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}
