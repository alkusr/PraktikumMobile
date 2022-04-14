package com.example.gantiduit

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.view.inputmethod.InputMethodManager
import com.example.gantiduit.databinding.ActivityMainBinding
import java.text.NumberFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tombolKonversi.setOnClickListener{ hitungKonversi() }

        binding.inputEditText.setOnKeyListener{ view, keyCode, _ ->
            handleKeyEvent(
                view,
                keyCode
            )}
    }

    override fun onSaveInstanceState(savedInstanceState: Bundle) {
        super.onSaveInstanceState(savedInstanceState)

        savedInstanceState.putString("hasil", binding.teksHasil.text.toString())
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        binding.teksHasil.setText(savedInstanceState.getString("hasil"))
    }


    private fun  hitungKonversi(){
        val stringInput = binding.inputEditText.text.toString()
        val uangInput = stringInput.toDoubleOrNull()

        if (uangInput == null){
            binding.teksHasil.text = ""
            return
        }

        val pilihanUser = when (binding.pilihanMataUang.checkedRadioButtonId){
            R.id.euro -> 1500
            R.id.USD -> 14000
            R.id.JPY -> 110
            else -> 3800
        }

        var cetakHasil =  uangInput * pilihanUser

        val indonesianLocale = Locale("in", "ID")
        val hasil_format =
            NumberFormat.getCurrencyInstance(indonesianLocale).format(cetakHasil)

        binding.teksHasil.text = getString(R.string.hasil, hasil_format)
    }


    private fun handleKeyEvent(view: View, keyCode: Int): Boolean {
        if (keyCode == KeyEvent.KEYCODE_ENTER) {

            val inputMethodManager =
                getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
            return true
        }
        return false
    }
}