    package com.example.converter
    
    import androidx.appcompat.app.AppCompatActivity
    import android.os.Bundle
    import android.view.View
    import android.widget.Button
    import android.widget.EditText
    import android.widget.TextView
    import android.widget.Toast

    
    class MainActivity : AppCompatActivity() {
        private val kg = 0.45f
        private lateinit var libras: EditText
        private lateinit var quilos: TextView
        private lateinit var btCalculo: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        libras = findViewById(R.id.edt_lbs)
        quilos = findViewById(R.id.txt_kg)
        btCalculo = findViewById(R.id.bt_calculate)

        btCalculo.setOnClickListener { calculate() }

    }

        private fun calculate(){
           val lbs = libras.text.toString().toFloat()
           if (lbs != 0f){

               val lbsToKg = lbs * kg

               quilos.text = "Kg ${"%.2f".format(lbsToKg)}"
           }

        }




}

