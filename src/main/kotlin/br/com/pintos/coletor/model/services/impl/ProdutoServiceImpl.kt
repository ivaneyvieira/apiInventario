package br.com.pintos.coletor.model.services.impl

import br.com.pintos.coletor.model.repositories.ProdutoRepository
import br.com.pintos.coletor.model.services.ProdutoService
import org.springframework.stereotype.Service

@Service
class ProdutoServiceImpl(val produtoRepository: ProdutoRepository): ProdutoService