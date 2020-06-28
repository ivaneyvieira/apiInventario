package br.com.pintos.coletor.model.controlers

import br.com.pintos.coletor.model.responce.Response
import br.com.pintos.framework.dados.exception.BOException
import org.springframework.http.ResponseEntity

abstract class AbstractControler{
  protected fun <T> execService(block : () -> T) :  ResponseEntity<Response<T>>{
    return try {
      ResponseEntity.ok().body(Response(data = block()))
    }catch(e : BOException){
      ResponseEntity.ok().body(Response(listOf(e.message ?: "")))
    }catch(e : Throwable){
      e.printStackTrace()
      ResponseEntity.ok().body(Response(listOf("Erro não identificado")))
    }
  }
}