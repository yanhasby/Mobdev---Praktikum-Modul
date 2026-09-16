package com.example.praktik2.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
//Sesuaikan package anda
//import library yg dibutuhkan
import androidx.compose.material3.Icon
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun ProfilMahasiswa() {
    Row(verticalAlignment =
        Alignment.CenterVertically) {
        Box(contentAlignment = Alignment.TopEnd) {
            Icon(
                imageVector = Icons.Default.Person,
                contentDescription = "Ikon Profil",
                modifier = Modifier
                    .size(50.dp)
                    .clip(CircleShape) // 1. Potong area menjadi lingkaran berlaku setelahnya
                        .background(Color.Cyan), // 2. Warnai  area yang tersisa dengan Cyan
            )
            Icon(
                imageVector = Icons.Default.Person,
                contentDescription = "Ikon Profil",
                modifier = Modifier.size(48.dp)
            )
            Icon(
                imageVector = Icons.Default.Edit,
                contentDescription = "Ikon Profil",
                modifier = Modifier.size(15.dp)
            )
        }
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text(text = "Nama: Mohammad Yan Hasby", fontWeight = FontWeight.Bold)
            Text(text = "NIM: 245150601111011")
            Text(text = "Asal kota: Blitar")
        }

    }
}
@Preview(showBackground = true)
@Composable
fun PreviewProfilMahasiswa() {
    ProfilMahasiswa()
}
