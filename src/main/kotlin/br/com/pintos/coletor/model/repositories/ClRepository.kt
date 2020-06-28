package br.com.pintos.coletor.model.repositories

import br.com.pintos.jooq.tables.pojos.Cl
import br.com.pintos.jooq.tables.pojos.Usuario
import org.springframework.data.repository.Repository

interface ClRepository: Repository<Usuario, Int> {
  fun findCentroLucro(centro: String): Cl?
  fun findClCompativel(cl: Cl): List<Cl>
}