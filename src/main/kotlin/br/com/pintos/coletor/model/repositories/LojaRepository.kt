package br.com.pintos.coletor.model.repositories

import br.com.pintos.jooq.tables.pojos.Loja
import org.springframework.data.repository.Repository

interface LojaRepository: Repository<Loja, Int> {
  fun getLoja(storeno: Int?): Loja?
}