package com.example.praktik2.screens

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

@Composable
fun HalamanUtama() {
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Menampilkan profil mahasiswa
        ProfilMahasiswa()

        // Memberikan jarak antara profil dan tombol
        Spacer(modifier = Modifier.height(24.dp))

        // Tombol untuk menghubungi melalui WhatsApp
        Button(
            onClick = {
                val url = "https://wa.me/6281234567890"
                val intent = Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse(url)
                )
                context.startActivity(intent)
            }
        ) {
            Text("Pendidikan Teknologi Informasi Angkatan 2024")
        }
        Button(
            onClick = {
                val url = "https://wa.me/6281234567890"
                val intent = Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse(url)
                )
                context.startActivity(intent)
            }
        ) {
            Text("Whatsapp")
        }
    }
}