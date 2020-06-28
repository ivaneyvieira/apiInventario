package br.com.pintos.coletor.model.services.impl

import br.com.pintos.coletor.bos.Facade
import br.com.pintos.coletor.model.repositories.ColetaRepository
import br.com.pintos.coletor.model.services.ColetaService
import br.com.pintos.jooq.tables.pojos.Coleta
import org.springframework.stereotype.Service

@Service
class ColetaServiceImpl(val coletaRepository: ColetaRepository): ColetaService {
  override fun fechaColeta(coletaId: Int) {
    val coleta = coletaRepository.findById(coletaId)
    coletaRepository.fechaColeta(coleta)
  }
  
  override fun findColetaAberta(inventarioId: Int, usuarioId: Int): Coleta? {
    val inventario = Facade.inventario.findById(inventarioId.toLong()) ?: return null
    val usuario = Facade.usuario.findById(usuarioId.toLong()) ?: return null
    return coletaRepository.findColeta(inventario, usuario)
  }
  
  override fun mudaLote(coletaId: Int, loteId: Int, inventarioId: Int, usuarioId: Int, coletorNum: Int) {
    val coleta = Facade.coleta.findById(coletaId.toLong()) ?: return
    val lote = Facade.lote.findById(loteId.toLong()) ?: return
    val inventario = Facade.inventario.findById(inventarioId.toLong()) ?: return
    val usuario = Facade.usuario.findById(usuarioId.toLong()) ?: return

    coletaRepository.mudaLote(coleta, lote, inventario, usuario, coletorNum)
  }
}