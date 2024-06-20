package com.sam.counterapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sam.counterapp.ui.theme.CounterAppTheme
import com.sam.counterapp.ui.theme.CounterScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CounterAppTheme {
                App()
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun App(){
    var counter by remember { mutableIntStateOf(0) }
    var modifier = Modifier
    CounterScreen(modifier,counter,
        onDecrement = {
            counter -=1
        },
        onIncrement = {
            counter +=1
        },
        onReset = {
            counter = 0
        }
    )
}


