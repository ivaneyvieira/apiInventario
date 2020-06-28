package br.com.pintos.coletor.model.services.impl

import br.com.pintos.coletor.bos.Facade
import br.com.pintos.coletor.model.repositories.LoteRepository
import br.com.pintos.coletor.model.services.LoteService
import br.com.pintos.jooq.tables.pojos.Lote
import org.springframework.stereotype.Service

@Service
class LoteServiceImpl(val loteRepository: LoteRepository): LoteService {
  override fun findById(id: Int): Lote? {
    return Facade.lote.findById(id.toLong())
  }
  
  override fun findLote(lojaId: Int, numLote: Int): Lote? {
    return loteRepository.findLote(lojaId.toLong(), numLote)
  }
}