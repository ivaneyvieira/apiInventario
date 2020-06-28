package br.com.pintos.coletor.model.services

import br.com.pintos.jooq.tables.pojos.Leitura

interface LeituraService {
  fun ultimaLeitura(coletaId : Int) : Leitura?
  
  fun validaLeitura(leitura : String, coletaId : Int)
  
  fun adicionaLeitura(leitura : String, coletaId : Int) : Leitura?
  
  fun adicionaErro(leitura : String, coletaId: Int, message: String): Leitura?
  
  fun apagaTodos(coletaId : Int)
  
  fun apagaUltimo(coletaId : Int)
}