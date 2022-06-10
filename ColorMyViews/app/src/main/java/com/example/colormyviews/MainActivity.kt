package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListners()
    }
    private fun setListners(){
        var box_one_id:TextView=findViewById(R.id.box_one_id)
        var box_two_id:TextView=findViewById(R.id.box_two_id)
        var box_three_id:TextView=findViewById(R.id.box_three_id)
        var box_four_id:TextView=findViewById(R.id.box_four_id)
        var box_five_id:TextView=findViewById(R.id.box_five_id)
        var constraint_layout:ConstraintLayout=findViewById(R.id.constraint_layout)
        var green_button: Button =findViewById(R.id.green_button)
        var red_button: Button =findViewById(R.id.red_button)
        var yellow_button: Button =findViewById(R.id.yellow_button)
        val clickView:List<View> =
                     listOf(box_one_id,box_two_id,box_three_id
                         ,box_four_id,box_five_id,constraint_layout,green_button,red_button,yellow_button)
        for (item in clickView){
            item.setOnClickListener{makeColored(it)}
        }
    }
    private fun makeColored(view:View){
        var box_three_id:TextView=findViewById(R.id.box_three_id)
        var box_four_id:TextView=findViewById(R.id.box_four_id)
        var box_five_id:TextView=findViewById(R.id.box_five_id)
        when(view.id){
            R.id.box_one_id->view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_id->view.setBackgroundColor(Color.GRAY)

            R.id.box_three_id->view.setBackgroundResource(android.R.color.holo_blue_bright)
            R.id.box_four_id->view.setBackgroundResource(android.R.color.holo_blue_dark)
            R.id.box_five_id->view.setBackgroundResource(android.R.color.holo_blue_light)


            R.id.red_button -> box_three_id.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> box_four_id.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> box_five_id.setBackgroundResource(R.color.my_green)
            else ->view.setBackgroundColor(Color.LTGRAY)
        }
    }
}