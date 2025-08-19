package com.example.clienteapp.screens

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import com.example.clienteapp.ui.theme.ClienteAppTheme

@Composable
fun BarraInferior(modifier: Modifier = Modifier){
    NavigationBar (
        containerColor = MaterialTheme
            .colorScheme.primaryContainer
    ){
        NavigationBarItem(
            onClick = {},
            selected = false,
            icon = {
                Icon(
                    imageVector =  Icons.Default.Person,
                    contentDescription = "sla"
                )
            }
        )
    }
}

@Preview
@Composable
private fun BarraInferiorPreview() {
    ClienteAppTheme {
        BarraInferior()
    }
}