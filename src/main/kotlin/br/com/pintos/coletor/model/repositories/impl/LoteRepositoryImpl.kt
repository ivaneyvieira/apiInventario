package br.com.pintos.coletor.model.repositories.impl

import br.com.pintos.coletor.bos.LoteBo
import br.com.pintos.coletor.model.repositories.LoteRepository
import br.com.pintos.jooq.tables.pojos.Lote
import org.springframework.stereotype.Repository

@Repository
class LoteRepositoryImpl: LoteRepository {
  private val bo = LoteBo()
  
  override fun findLote(lojaId: Long?, numLote: Int?): Lote? = bo.findLote(lojaId, numLote)
}