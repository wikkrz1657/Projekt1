package com.example.projekt1

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.projekt1.ui.theme.Projekt1Theme

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent { MainContent2()



        }
    }
}

@Composable
fun MainContent2(){
    val mContext = LocalContext.current
    Projekt1Theme {
        Surface(modifier = Modifier.fillMaxSize()) {
            Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                Column(modifier = Modifier.padding(innerPadding)
                    .fillMaxSize()
                    .background(color = Color.DarkGray),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally) { Greeting2(
                    name = "Android",
                    modifier = Modifier.padding(innerPadding)
                )
                    Button(onClick = {mContext.startActivity(Intent(mContext, MainActivity3::class.java)) },
                        modifier = Modifier.padding(innerPadding),
                    ) {
                        Text( text = "Naciśnij żeby przejść dalej")
                    } }
            } }

    }
}

@Composable
fun Greeting2(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "To jest ekran muner 2",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    Projekt1Theme {
        Greeting2("Android")
    }
}