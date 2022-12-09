package com.example.teste_imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.teste_imc.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    @SuppressWarnings("WrongViewCast", "MissingInflateId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.hide();


        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.button.setOnClickListener {
            calculo()
        }
    }

    fun calculo() {
        val altura = binding.editTextaltura.text.toString().toDouble()
        val peso = binding.editTextpeso.text.toString().toDouble()

        val resultado = peso / (altura * altura)

        if(resultado <= 18.5) {
        }
        else if (resultado <= 18.5){
            binding.textViewresultado.setText("Resultado: %.2f".format(resultado) + "Você está na magreza")
        }
        else if (resultado >= 18.5 && resultado <= 24.9){
            binding.textViewresultado.setText("Resultado: %.2f".format(resultado) + "Você está normal")
        }
        else if (resultado >= 25.0 && resultado <= 29.9){
            binding.textViewresultado.setText("Resultado: %.2f".format(resultado) + "Você está com sobrepeso")
            }
        else if (resultado >= 30.0 && resultado <= 39.9){
            binding.textViewresultado.setText("Resultado: %.2f".format(resultado) + "Você está com obesidade")
        }
        else if (resultado >= 40.0){
            binding.textViewresultado.setText("Resultado: %.2f".format(resultado) + "Você está obeso" )
        }



        binding.textViewresultado.setText("Resultado %.2f".format(resultado))


    }

}