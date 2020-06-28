package br.com.pintos.coletor.model.services

import br.com.pintos.jooq.tables.pojos.Produto

interface ProdutoService {
  fun findById(id : Int) : Produto?
}