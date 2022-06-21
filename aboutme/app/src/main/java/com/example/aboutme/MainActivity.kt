package com.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.aboutme.databinding.ActivityMainBinding
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val myName:MyName=MyName("Ankar Kumar Saha")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.myName=myName
        //val button:Button=findViewById(R.id.doneButton)
        binding.doneButton.setOnClickListener{
            addNickname(it)
        }
    }
    private fun addNickname(view: View){
       binding.apply {
           myName?.nickname=nickNameEdit.text.toString()
           invalidateAll()//for to refresh the UI
//           nickNameText.text=binding.nickName.text
           nickNameEdit.visibility=View.GONE

           nickNameText.visibility=View.VISIBLE
           doneButton.visibility=View.GONE
       }
    }
}