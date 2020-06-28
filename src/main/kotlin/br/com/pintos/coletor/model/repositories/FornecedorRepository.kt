package br.com.pintos.coletor.model.repositories

import br.com.pintos.jooq.tables.pojos.Fornecedor
import org.springframework.data.repository.Repository

interface FornecedorRepository: Repository<Fornecedor, Int> {
  fun findByCodigo(codigo: Int?): Fornecedor?
}

