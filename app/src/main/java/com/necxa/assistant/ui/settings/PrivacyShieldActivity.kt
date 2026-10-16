package com.necxa.assistant.ui.settings

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.necxa.assistant.databinding.ActivityPrivacyShieldBinding
import com.necxa.assistant.util.ThemeManager

class PrivacyShieldActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPrivacyShieldBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        ThemeManager.applyTheme(this)
        super.onCreate(savedInstanceState)
        binding = ActivityPrivacyShieldBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ThemeManager.applyDynamicBackground(binding.root)

        binding.btnBack.setOnClickListener {
            finish()
        }

        binding.btnJoinOfficialTelegram.setOnClickListener {
            openUrl("https://t.me/necxydeveloper")
        }

        binding.btnJoinTelegram.setOnClickListener {
            openUrl("https://t.me/i_necxy")
        }

        binding.btnJoinInstagram.setOnClickListener {
            openUrl("https://www.instagram.com/i_necxy")
        }

        binding.btnJoinYoutube.setOnClickListener {
            openUrl("https://youtube.com/@voidnecx")
        }
    }

    private fun openUrl(url: String) {
        try {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        } catch (_: Exception) {
        }
    }
}
