package com.example.safetoyak

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.safetoyak.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Set initial warning message
        warningMessage()
    }

    //Set initial warning on startup
    fun warningMessage() {
        val warningBuilder = AlertDialog.Builder(binding.root.context)

        warningBuilder.setTitle(R.string.warning)
        warningBuilder.setMessage(R.string.main_warningMessage)
        warningBuilder.setPositiveButton(android.R.string.ok, null)
        warningBuilder.show()
    }
}