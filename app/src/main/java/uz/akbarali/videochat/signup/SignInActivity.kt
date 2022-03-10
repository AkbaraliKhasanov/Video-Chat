package uz.akbarali.videochat.signup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.akbarali.videochat.databinding.ActivitySignBinding

class SignInActivity : AppCompatActivity() {
    lateinit var binding: ActivitySignBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySignBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}