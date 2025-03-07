package com.example.contador

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.expandHorizontally
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.contador.ui.theme.ContadorTheme
import com.google.android.material.button.MaterialButton

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val navController = rememberNavController()

        setContent {
            ContadorTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box (modifier = Modifier.fillMaxSize().padding(innerPadding), contentAlignment = Alignment.Center){
                        TextButtonExample(
                        )
                    }

                }
            }
        }
    }
}

@Composable
fun TextButtonExample() {
    var counter by rememberSaveable { mutableStateOf(0) }

    TextButton(onClick = { counter++ }) {
        Text("CLICS: $counter")
    }
}




@Preview(showBackground = true)
@Composable
fun ButtonPreview() {
    ContadorTheme {
        TextButtonExample()
    }
}

