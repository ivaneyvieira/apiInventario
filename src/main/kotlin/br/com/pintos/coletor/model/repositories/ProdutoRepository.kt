package br.com.pintos.coletor.model.repositories

import br.com.pintos.jooq.tables.pojos.Produto
import org.springframework.data.repository.Repository

interface ProdutoRepository: Repository<Produto, Int> {
  fun getProduto(barcode: String?): Produto?
}