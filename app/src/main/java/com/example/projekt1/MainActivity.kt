package com.example.projekt1

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.projekt1.ui.theme.Projekt1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainContent()

        }
    }
}

@Composable
fun MainContent(){
    val mContext = LocalContext.current
    Projekt1Theme {
        Surface(modifier = Modifier.fillMaxSize()) {
            Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                Image(
                    painter = painterResource(id = R.drawable.img) ,
                    contentDescription = "cos",
                    contentScale = ContentScale.FillBounds, modifier = Modifier.fillMaxSize()
                )
                Column(modifier = Modifier.padding(innerPadding)
                                      .fillMaxSize()
                                      .background(color = Color.Transparent),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) { Greeting(
                name = "Android",
                modifier = Modifier.padding(innerPadding)
            )
                Button(onClick = {mContext.startActivity(Intent(mContext, MainActivity2::class.java)) },
                    modifier = Modifier.padding(innerPadding),
                    ) {
                    Text( text = "Naciśnij żeby przejść dalej")
                } }
        } }

    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "To ekran numer 1",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Projekt1Theme {
        Greeting("Android")
    }
}