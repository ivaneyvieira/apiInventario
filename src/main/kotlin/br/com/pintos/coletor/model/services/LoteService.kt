package br.com.pintos.coletor.model.services

import br.com.pintos.jooq.tables.pojos.Lote

interface LoteService {
  fun findById(id : Int) : Lote?
  
  fun findLote(lojaId : Int, numLote : Int) : Lote?
}