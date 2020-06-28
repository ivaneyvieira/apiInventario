package br.com.pintos.coletor.model.responce

data class Response<T>(val erros: List<String> = emptyList(), var data: T? = null)