package ru.skillbranch.avatarimageview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.skillbranch.avatarimageview.databinding.ActivityMainBinding
import ru.skillbranch.avatarimageview.ui.AvatarImageView

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnBorder.setOnClickListener {
            binding.aiv.setBorderWidth((2..10).random())
        }

        binding.btnColor.setOnClickListener {
            binding.aiv.setBorderColor((AvatarImageView.bgColors).random())
        }
    }
}