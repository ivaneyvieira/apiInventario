package br.com.pintos.coletor.model.repositories

import br.com.pintos.jooq.tables.pojos.Coleta
import br.com.pintos.jooq.tables.pojos.Leitura
import org.springframework.data.repository.Repository

interface LeituraRepository: Repository<Leitura, Int> {
  fun adicionaErro(leitura: String, coleta: Coleta, message: String): Leitura?
  
  fun adicionaEstorno(leitura: String, coleta: Coleta, message: String): Leitura?
  
  fun adicionaLeitura(leitura: String, coleta: Coleta): Leitura?
  
  fun apagaTodos(coleta: Coleta)
  
  fun apagaUltimo(coleta: Coleta)
  
  fun ultimaLeitura(coleta: Coleta): Leitura?
  
  fun validaLeitura(leitura: String?, coleta: Coleta)
}