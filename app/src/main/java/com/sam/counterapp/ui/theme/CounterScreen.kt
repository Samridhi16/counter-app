package com.sam.counterapp.ui.theme

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun CounterScreen(modifier: Modifier,counter: Int , onDecrement: ()-> Unit, onIncrement: ()-> Unit, onReset: ()-> Unit){
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = counter.toString(),
                fontSize = 25.sp,
                modifier = Modifier
                    .border(2.dp, Color.Black, RectangleShape)
                    .padding(32.dp, 16.dp)
                    )
            Spacer(modifier = Modifier.height(16.dp))
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ){
                Button(onClick = onDecrement) {
                    Text(text = "Decrement",
                        fontSize = 25.sp
                        )
                }
                Spacer(modifier = Modifier.width(8.dp))
                Button(onClick = onIncrement) {
                    Text(text = "Increment",
                        fontSize = 25.sp)
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = onReset) {
                Text(text = "Reset",
                    fontSize = 25.sp)
            }
        }
    }
}