package br.com.pintos.coletor.model.services.impl

import br.com.pintos.coletor.bos.Facade
import br.com.pintos.coletor.model.repositories.ProdutoRepository
import br.com.pintos.coletor.model.services.ProdutoService
import br.com.pintos.jooq.tables.pojos.Produto
import org.springframework.stereotype.Service

@Service
class ProdutoServiceImpl(val produtoRepository: ProdutoRepository): ProdutoService {
  override fun findById(id: Int): Produto? {
    return Facade.produto.findById(id.toLong())
  }
}