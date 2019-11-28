package com.example.exercise2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCalculate.setOnClickListener()
        {
            val height:Double = editHeight.text.toString().toDouble();
            val weight:Double = editWeight.text.toString().toDouble();
;
            val heightm:Double = height/100
            val bmi = weight / (heightm*heightm);
            val status:String;

            if(bmi<18.5){
                imageViewProfile.setImageResource(R.drawable.under)
            status = "Under"}
            else if(bmi >= 18.5 && bmi <= 24.9){
                imageViewProfile.setImageResource(R.drawable.normal)
                status = "Normal"}
            else{
                imageViewProfile.setImageResource(R.drawable.over)
            status = "Over"}

            textViewBMI.text = "bmi: %.2f (%s)".format(bmi,status);
        }

        buttonReset.setOnClickListener()
        {
            editHeight.text = null;
            editWeight.text = null;
            textViewBMI.text = null;
            imageViewProfile.setImageResource(R.drawable.empty);

        }

    }

}
