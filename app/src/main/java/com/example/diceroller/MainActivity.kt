package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollbutton: Button = findViewById(R.id.button3)
        rollbutton.setOnClickListener {
            val toast = Toast.makeText(this, "Dice rolled! hurray", Toast.LENGTH_SHORT).show()
            /*Toast shows a small pop up for few seconds and then vanishes*/
            class dice(val sides: Int) {
                fun roll(): Int {
                    return (1..sides).random()
                }
            }

            //create objects of class dice.
            val dice2=dice(6)
            val dice1 = dice(6)
            val dice_image:ImageView=findViewById(R.id.diceimg)
            val dice_img2:ImageView=findViewById(R.id.diceimg2)

            //random number between 1-6 gets stored in num.
            val num = dice1.roll()
            //set image of dice1 according to number appeared on it's top.
            when(num){
                1->dice_image.setImageResource(R.drawable.dice_1)
                2->dice_image.setImageResource(R.drawable.dice_2)
                3->dice_image.setImageResource(R.drawable.dice_3)
                4->dice_image.setImageResource(R.drawable.dice_4)
                5->dice_image.setImageResource(R.drawable.dice_5)
                6->dice_image.setImageResource(R.drawable.dice_6)
            }

            //random number between 1-6 gets stored in num1
            val num1=dice2.roll()
            //set image of dice2 according to number appeared on it's top.
            when(num1){
                1->dice_img2.setImageResource(R.drawable.dice_1)
                2->dice_img2.setImageResource(R.drawable.dice_2)
                3->dice_img2.setImageResource(R.drawable.dice_3)
                4->dice_img2.setImageResource(R.drawable.dice_4)
                5->dice_img2.setImageResource(R.drawable.dice_5)
                6->dice_img2.setImageResource(R.drawable.dice_6)
            }

        }
    }
}