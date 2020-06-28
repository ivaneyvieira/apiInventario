package br.com.pintos.coletor.model.repositories.impl

import br.com.pintos.coletor.bos.LojaBo
import br.com.pintos.coletor.model.repositories.LojaRepository
import br.com.pintos.jooq.tables.pojos.Loja
import org.springframework.stereotype.Repository

@Repository
class LojaRepositoryImpl: LojaRepository {
  private val bo = LojaBo()
  
  override fun getLoja(storeno: Int?): Loja? = bo.getLoja(storeno)
}