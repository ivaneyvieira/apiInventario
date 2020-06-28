package br.com.pintos.coletor.model.repositories.impl

import br.com.pintos.coletor.bos.ClBo
import br.com.pintos.coletor.model.repositories.ClRepository
import br.com.pintos.jooq.tables.pojos.Cl
import org.springframework.stereotype.Repository

@Repository
class ClRepositoryImpl: ClRepository {
  private val bo = ClBo()
  
  override fun findCentroLucro(centro: String): Cl? {
    return bo.findCl(centro)
  }
  
  override fun findClCompativel(cl: Cl): List<Cl> {
    return bo.findClCompativeis(cl)
      .orEmpty()
      .filterNotNull()
  }
}