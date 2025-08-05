package com.example.clienteapp.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Conexao {

    private val  BASE_URL = "https://app1.celso.dev.br/clientes-app/api/"

    private val conexao = Retrofit
        .Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun getClienteService(): ClienteService{
        return conexao.create(ClienteService::class.java)
    }
}