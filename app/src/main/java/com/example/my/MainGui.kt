package com.example.my

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue


@Composable
fun MainGui (meuViewModel: MainGuiViewModel){

    val N : Int by meuViewModel.contador.observeAsState(0)
    var txtCampo by remember { mutableStateOf("") }

    Column {
        Text(text = "Algo 01")
        Text(text = "Algo 02")
        Text(text = "Algo 03")

        TextField(value = N.toString(), onValueChange = {})

        Button(onClick = { meuViewModel.incrementaContador()
        }) {
            Text(text = "clicks: "+ N.toString())
        }

    }

}



