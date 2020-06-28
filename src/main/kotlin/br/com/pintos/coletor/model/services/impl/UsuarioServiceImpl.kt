package br.com.pintos.coletor.model.services.impl

import br.com.pintos.coletor.model.repositories.UsuarioRepository
import br.com.pintos.coletor.model.services.UsuarioService
import br.com.pintos.jooq.tables.pojos.Usuario
import org.springframework.stereotype.Service

@Service
class UsuarioServiceImpl(val usuarioRepository: UsuarioRepository): UsuarioService {
  override fun buscaPorLogin(username: String): Usuario? {
    return usuarioRepository.findUserByMatricula(username.toIntOrNull())
  }
}