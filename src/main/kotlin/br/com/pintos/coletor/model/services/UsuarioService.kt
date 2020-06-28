package br.com.pintos.coletor.model.services

import br.com.pintos.jooq.tables.pojos.Usuario

interface UsuarioService {
  fun buscaPorLogin(username: String): Usuario?
}