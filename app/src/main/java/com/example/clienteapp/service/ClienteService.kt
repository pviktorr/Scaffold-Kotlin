package com.example.clienteapp.service

import com.example.clienteapp.model.Cliente
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface  ClienteService {
    @POST("clientes")
    fun cadastrarCliente(@Body cliente: Cliente):Call<Cliente>

    @GET("clientes")
    fun listarTodos(): Call<List<Cliente>>
    @GET
    fun buscarporId(@Path("id") id: Long ): Call<Cliente>
}