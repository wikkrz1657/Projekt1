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

class MainActivity3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent { MainContent3()



        }
    }
}
@Composable
fun MainContent3(){
    val mContext = LocalContext.current
    Projekt1Theme {
        Surface(modifier = Modifier.fillMaxSize()) {
            Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                Column(modifier = Modifier.padding(innerPadding)
                    .fillMaxSize()
                    .background(color = Color.DarkGray),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally) { Greeting3(
                    name = "Android",
                    modifier = Modifier.padding(innerPadding)
                )
                    Button(onClick = {mContext.startActivity(Intent(mContext, MainActivity::class.java)) },
                        modifier = Modifier.padding(innerPadding),
                    ) {
                        Text( text = "Powrót do ekranu pierwszego")
                    } }
            } }

    }
}

@Composable
fun Greeting3(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Ekran numer 3",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview3() {
    Projekt1Theme {
        Greeting2("Android")
    }
}