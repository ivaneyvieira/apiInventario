package br.com.pintos.coletor.model.services

import br.com.pintos.jooq.tables.pojos.Inventario

interface InventarioService {
  fun findByNum(num : Int) : Inventario?
}