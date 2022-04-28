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
            /*Toast shows a small pop up for few seconds and then vanishes.
             val result_text:TextView=findViewById(R.id.textView)//creating reference of textview
            var num=(1..6).random()
            result_text.text=num.toString()//setting text in Textview*/
            class dice(val sides: Int) {
                fun roll(): Int {
                    return (1..sides).random()
                }
            }
            // val dice2=dice(6)
            val dice2=dice(6)
            val dice1 = dice(6)
            val dice_image:ImageView=findViewById(R.id.diceimg)
            val dice_img2:ImageView=findViewById(R.id.diceimg2)
            val num = dice1.roll()
            when(num){
                1->dice_image.setImageResource(R.drawable.dice_1)
                2->dice_image.setImageResource(R.drawable.dice_2)
                3->dice_image.setImageResource(R.drawable.dice_3)
                4->dice_image.setImageResource(R.drawable.dice_4)
                5->dice_image.setImageResource(R.drawable.dice_5)
                6->dice_image.setImageResource(R.drawable.dice_6)
            }
            val num1=dice2.roll()
            when(num1){
                1->dice_img2.setImageResource(R.drawable.dice_1)
                2->dice_img2.setImageResource(R.drawable.dice_2)
                3->dice_img2.setImageResource(R.drawable.dice_3)
                4->dice_img2.setImageResource(R.drawable.dice_4)
                5->dice_img2.setImageResource(R.drawable.dice_5)
                6->dice_img2.setImageResource(R.drawable.dice_6)
            }
           /* val result_text: TextView = findViewById(R.id.textView) //creating reference of textview
            val result_text1:TextView=findViewById(R.id.textView2)
            result_text1.text=num1.toString()
            result_text.text = num.toString()//setting text in Textview*/
            /*val lucky:TextView=findViewById(R.id.textView3)
            val Lucky_num=5
            val equal:TextView=findViewById(R.id.ifelse1)
            when statement is used to execute code based on matching input and output.If input provided matches
            * with ouput then code executes and we come out of when.it is like if else statements
            when(num){
                Lucky_num -> lucky.text="You won"
                1-> lucky.text="You loose"
                2-> lucky.text="You loose"
                3->lucky.text="You loose"
                4->lucky.text="You loose"
                6-> lucky.text="You loose"
            }
            if (num==num1){
                equal.text="you have same output"

            }
            else{
                equal.text=" "
            }*/
        }
    }
}