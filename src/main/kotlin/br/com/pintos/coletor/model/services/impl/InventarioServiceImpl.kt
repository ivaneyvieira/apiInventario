package br.com.pintos.coletor.model.services.impl

import br.com.pintos.coletor.model.repositories.InventarioRepository
import br.com.pintos.coletor.model.services.InventarioService
import br.com.pintos.jooq.tables.pojos.Inventario
import org.springframework.stereotype.Service

@Service
class InventarioServiceImpl(val inventarioRepository: InventarioRepository): InventarioService {
  override fun findByNum(num: Int): Inventario? {
    return inventarioRepository.findByNumero(num)
  }
}