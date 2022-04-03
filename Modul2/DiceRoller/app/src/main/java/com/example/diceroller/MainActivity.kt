package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.example.diceroller.databinding.ActivityMainBinding

//Main class
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var diceImage1 : ImageView
    private lateinit var diceImage2 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

//      Button Action
        val rollButton: Button = binding.rollButton
        diceImage1 = binding.diceImage1
        diceImage2 = binding.diceImage2
        rollButton.setOnClickListener{acakDadu()}
    }

//  Fungsi Acak Dadu
    private fun acakDadu(){
        val dice1 = rollsatu()
        diceImage1.setImageResource(dice1)
        val dice2 = rolldua()
        diceImage2.setImageResource(dice2)
        if (dice1 == dice2){
            Toast.makeText(this,"Selamat anda dapat dadu double!",
                Toast.LENGTH_SHORT).show()
        }else if (dice1 != dice2){
            Toast.makeText(this, "Anda belum beruntung!",
            Toast.LENGTH_SHORT).show()
        }
    }

//  Fungsi Random dadu1
    private fun rollsatu(): Int {
        return when((1..6).random()){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }

//  Fungsi Random dadu2
    private fun rolldua(): Int {
        return when((1..6).random()){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }
}