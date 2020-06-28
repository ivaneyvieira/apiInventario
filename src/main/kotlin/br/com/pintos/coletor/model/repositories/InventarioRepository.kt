package br.com.pintos.coletor.model.repositories

import br.com.pintos.framework.dados.Bloco
import br.com.pintos.jooq.tables.pojos.Inventario
import br.com.pintos.jooq.tables.pojos.Loja
import br.com.pintos.jooq.tables.pojos.Produto
import org.springframework.data.repository.Repository
import java.util.*

interface InventarioRepository: Repository<Inventario, Int> {
  fun dataIncial(): Date?
  
  fun filtro(dtInicial: Date?, dtFinal: Date?, loja: Loja?): List<Inventario?>?
  
  fun findAberto(): List<Inventario?>?
  
  fun findByNumero(num: Int?): Inventario?
  
  fun geraEstoque(): List<Bloco<*>>
  
  fun inventarioAtual(): Inventario?
  
  fun proximoNumero(): Int?
  
  fun validaCl(inventarioId: Long, produto: Produto): Boolean
  
  fun validaFornecedor(inventarioId: Long, produto: Produto): Boolean
  
  fun validaInsert(pojo: Inventario)
  
  fun validaUpdate(pojo: Inventario)
}