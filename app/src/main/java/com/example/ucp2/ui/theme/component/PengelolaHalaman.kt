package com.example.ucp2.ui.theme.component

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

enum class PengelolaHalaman {
    Home
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SkripsiApp(
    viewModel: SkripsiViewModel = viewModel(),
    navController :NavHostController = rememberNavController()
) {}