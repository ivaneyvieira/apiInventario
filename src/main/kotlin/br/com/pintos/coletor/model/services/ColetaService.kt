package br.com.pintos.coletor.model.services

import br.com.pintos.jooq.tables.pojos.Coleta

interface ColetaService {
  fun fechaColeta(coletaId : Int)
  
  fun findColetaAberta(inventarioId : Int, usuarioId : Int) : Coleta?
  
  fun mudaLote(coletaId : Int, loteId : Int, inventarioId : Int, usuarioId : Int, coletorNum : Int)
}