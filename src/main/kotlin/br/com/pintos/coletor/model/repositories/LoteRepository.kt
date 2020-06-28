package br.com.pintos.coletor.model.repositories

import br.com.pintos.jooq.tables.pojos.Lote
import org.springframework.data.repository.Repository

interface LoteRepository: Repository<Lote, Int> {
  fun findLote(lojaId: Long?, numLote: Int?): Lote?
}