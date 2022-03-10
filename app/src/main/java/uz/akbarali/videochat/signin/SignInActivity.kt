package uz.akbarali.videochat.signin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.akbarali.videochat.databinding.ActivitySignInBinding

class SignInActivity : AppCompatActivity() {
    lateinit var binding: ActivitySignInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}