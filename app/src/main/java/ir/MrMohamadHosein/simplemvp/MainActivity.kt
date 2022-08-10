package ir.MrMohamadHosein.simplemvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import ir.MrMohamadHosein.simplemvp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView( binding.root )



    }


}