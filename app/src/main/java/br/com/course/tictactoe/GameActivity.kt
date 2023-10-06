package br.com.course.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import br.com.course.tictactoe.databinding.ActivityGameBinding
import br.com.course.tictactoe.databinding.ActivityMainBinding

class GameActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var binding: ActivityGameBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btn0.setOnClickListener(this)
        binding.btn1.setOnClickListener(this)
        binding.btn2.setOnClickListener(this)
        binding.btn3.setOnClickListener(this)
        binding.btn4.setOnClickListener(this)
        binding.btn5.setOnClickListener(this)
        binding.btn6.setOnClickListener(this)
        binding.btn7.setOnClickListener(this)
        binding.btn8.setOnClickListener(this)


        binding.startGameBtn.setOnClickListener{
            startGame()
        }

    }

    private fun startGame() {
        TODO("Not yet implemented")
    }

    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }
}