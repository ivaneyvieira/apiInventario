package br.com.pintos.coletor.model.repositories.impl

import br.com.pintos.coletor.bos.InventarioBO
import br.com.pintos.coletor.model.repositories.InventarioRepository
import br.com.pintos.framework.dados.Bloco
import br.com.pintos.jooq.tables.pojos.Inventario
import br.com.pintos.jooq.tables.pojos.Loja
import br.com.pintos.jooq.tables.pojos.Produto
import org.springframework.stereotype.Repository
import java.util.*

@Repository
class InventarioRepositoryImpl: InventarioRepository {
  private val bo = InventarioBO()
  
  override fun dataIncial(): Date? = bo.dataIncial()
  
  override fun filtro(dtInicial: Date?, dtFinal: Date?, loja: Loja?): List<Inventario?>? =
    bo.filtro(dtInicial, dtFinal, loja)
  
  override fun findAberto(): List<Inventario?>? = bo.findAberto()
  
  override fun findByNumero(num: Int?): Inventario? = bo.findById(num?.toLong())
  
  override fun geraEstoque(): List<Bloco<*>> = bo.geraEstoque()
    .toList()
    .orEmpty()
    .filterNotNull()
  
  override fun inventarioAtual(): Inventario? = bo.inventarioAtual()
  
  override fun proximoNumero(): Int? = bo.proximoNumero()
  
  override fun validaCl(inventarioId: Long, produto: Produto): Boolean = bo.validaCl(inventarioId, produto)
  
  override fun validaFornecedor(inventarioId: Long, produto: Produto): Boolean =
    bo.validaFornecedor(inventarioId, produto)
  
  override fun validaInsert(pojo: Inventario) = bo.validaInsert(pojo)
  
  override fun validaUpdate(pojo: Inventario) = bo.validaUpdate(pojo)
}