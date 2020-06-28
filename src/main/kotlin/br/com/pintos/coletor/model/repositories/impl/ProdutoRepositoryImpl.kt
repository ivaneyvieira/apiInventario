package br.com.pintos.coletor.model.repositories.impl

import br.com.pintos.coletor.bos.ProdutoBo
import br.com.pintos.coletor.model.repositories.ProdutoRepository
import br.com.pintos.jooq.tables.pojos.Produto
import org.springframework.stereotype.Repository

@Repository
class ProdutoRepositoryImpl: ProdutoRepository {
  private val bo = ProdutoBo()
  
  override fun getProduto(barcode: String?): Produto? = bo.getProduto(barcode)
}