package br.com.pintos.coletor.model.repositories

import br.com.pintos.jooq.tables.pojos.Coleta
import br.com.pintos.jooq.tables.pojos.Inventario
import br.com.pintos.jooq.tables.pojos.Lote
import br.com.pintos.jooq.tables.pojos.Usuario
import org.springframework.data.repository.Repository

interface ColetaRepository: Repository<Coleta, Int> {
  fun contaColeta(coleta: Coleta): Int
  
  fun createColeta(inv: Inventario?, usuario: Usuario?, lote: Lote?, coletor: Int): Coleta?
  
  fun fechaColeta(coleta: Coleta?)
  
  fun findColeta(inv: Inventario?, usuario: Usuario?): Coleta?
  
  fun findColeta(inv: Inventario?, usuario: Usuario?, lote: Lote): Coleta?
  
  fun findColetaAberta(inv: Inventario?, usuario: Usuario?, lote: Lote?): Coleta?
  
  fun mudaLote(coleta: Coleta?, lote: Lote?, inventario: Inventario?, usuario: Usuario?, coletor: Int): Coleta
 
  fun findById(coletaId: Int): Coleta
}



