package com.example.displaynimnama

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.displaynimnama.ui.theme.DisplayNIMNamaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DisplayNIMNamaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    NIMNamaDisplay(
                        nim = "225150401111018",
                        nama = "Alifa Suci Parameswati",
                        modifier = Modifier
                            .padding(innerPadding)
                            .fillMaxSize() // Ensures the Column takes the entire screen size
                    )
                }
            }
        }
    }
}

@Composable
fun NIMNamaDisplay(nim: String, nama: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally, // Aligns content to the center horizontally
        verticalArrangement = androidx.compose.foundation.layout.Arrangement.Center // Aligns content to the center vertically
    ) {
        Text(text = nama)
        Text(text = nim)
    }
}

@Preview(showBackground = true)
@Composable
fun NIMNamaDisplayPreview() {
    DisplayNIMNamaTheme {
        NIMNamaDisplay(nim = "225150401111018", nama = "Alifa Suci Parameswati")
    }
}
