package com.example.converter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.converter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private val kg = 0.45f
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btCalculate.setOnClickListener(this)
    }

    override fun onClick(view: View) {
       if (view.id == R.id.bt_calculate){
          calculate()
       }
    }

    private fun calculate(){

            var lbs = binding.edtLbs.text.toString().toFloat()
            var librasToKg: Float = lbs * kg

            binding.txtKg.text = "Kg ${"%.2f".format(librasToKg)}"



    }




}

