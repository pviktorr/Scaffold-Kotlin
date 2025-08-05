package com.example.clienteapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.clienteapp.model.Cliente
import com.example.clienteapp.service.Conexao
import com.example.clienteapp.ui.theme.ClienteAppTheme
import kotlinx.coroutines.Dispatchers
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.await

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ClienteAppTheme {


                val cliente = Cliente(
                    id = null,
                    nome = "Cadastro do Pedro VIC ",
                    email = "pedro@email.com"
                )


                val conexao = Conexao().getClienteService()
                LaunchedEffect(Dispatchers.IO) {
                    conexao.cadastrarCliente(cliente).await()
                }

//                val requisicao = conexao.cadastrarCliente(cliente)
//
//                requisicao.enqueue(object : Callback<Cliente>{
//                    override fun onResponse(call: Call<Cliente>, response: Response<Cliente>) {
//                        println("Http Code ${response.code()}")
//                    }
//
//                    override fun onFailure(call: Call<Cliente>, t: Throwable) {
//                        TODO("Not yet implemented")
//                    }
//
//                })

                }
            }
        }
    }


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ClienteAppTheme {
        Greeting("Android")
    }
}