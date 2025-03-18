package com.example.menupracticas


import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnPractica1: Button = findViewById(R.id.btnPractica1)
        val btnPractica2: Button = findViewById(R.id.btnPractica2)
        val btnPractica3: Button = findViewById(R.id.btnPractica3)
        val btnPractica4: Button = findViewById(R.id.btnPractica4)
        val btnPractica5: Button = findViewById(R.id.btnPractica5)
        val btnPractica6: Button = findViewById(R.id.btnPractica6)

        btnPractica1.setOnClickListener { abrirApp("com.example.sqliteejemplo") }
        btnPractica2.setOnClickListener { abrirApp("com.example.clickssql") }
        btnPractica3.setOnClickListener { abrirApp("com.example.scores") }
        btnPractica4.setOnClickListener { abrirApp("com.example.contadorcontiempo") }
        btnPractica5.setOnClickListener { abrirApp("com.example.contadordeclicks") }
        btnPractica6.setOnClickListener { abrirApp("com.example.HolaMundo") }
    }

    private fun abrirApp(packageName: String) {
        val pm = packageManager
        try {
            val intent = pm.getLaunchIntentForPackage(packageName)
            if (intent != null) {
                startActivity(intent)
            } else {
                Toast.makeText(this, "Aplicación no encontrada", Toast.LENGTH_SHORT).show()
            }
        } catch (e: Exception) {
            Toast.makeText(this, "Error al intentar abrir la aplicación: ${e.message}", Toast.LENGTH_LONG).show()
        }
    }
}