package com.example.mytiptime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mytiptime.databinding.ActivityMainBinding
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buCalculate.setOnClickListener {
            calculateTip()
        }
    }

    fun calculateTip() {
        val stringInTextField = binding.etCostOfService.text.toString()
        val cost = stringInTextField.toDoubleOrNull()
        val selectedId = binding.rgTipOptions.checkedRadioButtonId
        val tipPercentage = when (selectedId) {
            R.id.rbOptionTwentyPercent -> 0.20
            R.id.rbOptionEighteenPercent -> 0.18
            else -> 0.15
        }
        var tip = tipPercentage * cost!!
        val roundUp = binding.swRoundUpSwitch.isChecked
        if (roundUp) {
            tip = kotlin.math.ceil(tip)
        }
        val formattedTip = NumberFormat.getCurrencyInstance().format(tip)
        binding.tvTipResult.text = getString(R.string.tip_amount, formattedTip)
    }
}