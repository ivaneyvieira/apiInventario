package br.com.pintos.coletor.model.responce

data class Response<T>(val erros: MutableList<String> = mutableListOf(), var data: T? = null)