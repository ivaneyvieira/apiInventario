package br.com.pintos.coletor.model.repositories.impl

import br.com.pintos.coletor.bos.ColetaBo
import br.com.pintos.coletor.model.repositories.ColetaRepository
import br.com.pintos.jooq.tables.pojos.Coleta
import br.com.pintos.jooq.tables.pojos.Inventario
import br.com.pintos.jooq.tables.pojos.Lote
import br.com.pintos.jooq.tables.pojos.Usuario
import org.springframework.stereotype.Repository

@Repository
class ColetaRepositoryImpl: ColetaRepository {
  private val bo = ColetaBo()
  
  override fun contaColeta(coleta: Coleta): Int = bo.contaColeta(coleta)
  
  override fun createColeta(inv: Inventario?, usuario: Usuario?, lote: Lote?, coletor: Int): Coleta? =
    bo.createColeta(inv, usuario, lote, coletor)
  
  override fun fechaColeta(coleta: Coleta?) = bo.fechaColeta(coleta)
  
  override fun findColeta(inv: Inventario?, usuario: Usuario?): Coleta? = bo.findColeta(inv, usuario)
  
  override fun findColeta(inv: Inventario?, usuario: Usuario?, lote: Lote): Coleta? = bo.findColeta(inv, usuario, lote)
  
  override fun findColetaAberta(inv: Inventario?, usuario: Usuario?, lote: Lote?): Coleta? =
    bo.findColetaAberta(inv, usuario, lote)
  
  override fun mudaLote(coleta: Coleta?,
                        lote: Lote?,
                        inventario: Inventario?,
                        usuario: Usuario?,
                        coletor: Int): Coleta = bo.mudaLote(coleta, lote, inventario, usuario, coletor)
  
  override fun findById(coletaId: Int): Coleta = bo.findById(coletaId.toLong())
}