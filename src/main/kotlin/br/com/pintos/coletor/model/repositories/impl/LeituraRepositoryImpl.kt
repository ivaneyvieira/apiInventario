package br.com.pintos.coletor.model.repositories.impl

import br.com.pintos.coletor.bos.LeituraBo
import br.com.pintos.coletor.model.repositories.LeituraRepository
import br.com.pintos.jooq.tables.pojos.Coleta
import br.com.pintos.jooq.tables.pojos.Leitura
import org.springframework.stereotype.Repository

@Repository
class LeituraRepositoryImpl: LeituraRepository {
  private val bo = LeituraBo()
  
  override fun adicionaErro(leitura: String, coleta: Coleta, message: String): Leitura? =
    bo.adicionaErro(leitura, coleta, message)
  
  override fun adicionaEstorno(leitura: String, coleta: Coleta, message: String): Leitura? =
    bo.adicionaEstorno(leitura, coleta, message)
  
  override fun adicionaLeitura(leitura: String, coleta: Coleta): Leitura? = bo.adicionaLeitura(leitura, coleta)
  
  override fun apagaTodos(coleta: Coleta) = bo.apagaTodos(coleta)
  
  override fun apagaUltimo(coleta: Coleta) = bo.apagaUltimo(coleta)
  
  override fun ultimaLeitura(coleta: Coleta): Leitura? = bo.ultimaLeitura(coleta)
  
  override fun validaLeitura(leitura: String?, coleta: Coleta) = bo.validaLeitura(leitura, coleta)
}