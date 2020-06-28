package br.com.pintos.coletor.model.repositories.impl

import br.com.pintos.coletor.bos.FornecedorBo
import br.com.pintos.coletor.model.repositories.FornecedorRepository
import br.com.pintos.jooq.tables.pojos.Fornecedor
import org.springframework.stereotype.Repository

@Repository
class FornecedorRepositoryImpl: FornecedorRepository {
  private val bo = FornecedorBo()
  
  override fun findByCodigo(codigo: Int?): Fornecedor? = bo.getFornecedor(codigo)
}