package br.com.pintos.coletor.model.services.impl

import br.com.pintos.coletor.bos.Facade
import br.com.pintos.coletor.model.repositories.LeituraRepository
import br.com.pintos.coletor.model.services.LeituraService
import br.com.pintos.jooq.tables.pojos.Leitura
import org.springframework.stereotype.Service

@Service
class LeituraServiceImpl(val leituraRepository: LeituraRepository): LeituraService {
  override fun ultimaLeitura(coletaId: Int): Leitura? {
    val coleta = Facade.coleta.findById(coletaId.toLong()) ?: return null
    return leituraRepository.ultimaLeitura(coleta)
  }
  
  override fun validaLeitura(leitura: String, coletaId: Int) {
    val coleta = Facade.coleta.findById(coletaId.toLong()) ?: return
    leituraRepository.validaLeitura(leitura, coleta)
  }
  
  override fun adicionaLeitura(leitura: String, coletaId: Int): Leitura? {
    val coleta = Facade.coleta.findById(coletaId.toLong()) ?: return null
    return leituraRepository.adicionaLeitura(leitura, coleta)
  }
  
  override fun adicionaErro(leitura: String, coletaId: Int, message: String): Leitura? {
    val coleta = Facade.coleta.findById(coletaId.toLong()) ?: return null
    return leituraRepository.adicionaErro(leitura, coleta, message)
  }
  
  override fun apagaTodos(coletaId: Int) {
    val coleta = Facade.coleta.findById(coletaId.toLong()) ?: return
    leituraRepository.apagaTodos(coleta)
  }
  
  override fun apagaUltimo(coletaId: Int) {
    val coleta = Facade.coleta.findById(coletaId.toLong()) ?: return
    leituraRepository.apagaUltimo(coleta)
  }
}