package com.satellitestudio.mimascota

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.satellitestudio.mimascota.ui.home.PetProfileScreen
import com.satellitestudio.mimascota.ui.theme.MiMascotaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MiMascotaTheme {
                PetProfileScreen()
            }
        }
    }
}