package com.example.gasto_viagem

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.gasto_viagem.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //
        binding.editCalculate.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        if (view.id == R.id.edit_calculate) {
            calculate()
        }
    }

    private fun isValid(): Boolean {
        return (binding.editDistance.text.toString() != "" &&
                binding.editPrice.text.toString() != "" &&
                binding.editAutonomy.text.toString() != "" &&
                binding.editAutonomy.text.toString().toFloat() != 0f
                )
    }

    private fun clearAllFields() {
        binding.editDistance.setText("")
        binding.editPrice.setText("")
        binding.editAutonomy.setText("")
    }

    private fun calculate() {
        if (!isValid()) {
            Toast.makeText(
                applicationContext,
                R.string.validation_fill_all_fields,
                Toast.LENGTH_SHORT
            ).show()
            return
        }

        val distance = binding.editDistance.text.toString().toFloat()
        val price_per_litro = binding.editPrice.text.toString().toFloat()
        val autonomy = binding.editAutonomy.text.toString().toFloat()
        val total_value = (distance * price_per_litro) / autonomy

        clearAllFields()

        binding.editTotalPrice.text = "R$ ${"%.2f".format(total_value)}"
    }

}