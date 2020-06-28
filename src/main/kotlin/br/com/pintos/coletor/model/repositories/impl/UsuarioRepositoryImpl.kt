package br.com.pintos.coletor.model.repositories.impl

import br.com.pintos.coletor.bos.UsuarioBo
import br.com.pintos.coletor.model.repositories.UsuarioRepository
import br.com.pintos.jooq.tables.pojos.Usuario
import org.springframework.stereotype.Repository

@Repository
class UsuarioRepositoryImpl(): UsuarioRepository {
  private val bo = UsuarioBo()
  
  override fun findUserByMatricula(matricula: Int?): Usuario? = bo.getUsuario(matricula)
}