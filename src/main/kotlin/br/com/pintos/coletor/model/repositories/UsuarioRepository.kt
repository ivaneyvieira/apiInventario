package br.com.pintos.coletor.model.repositories

import br.com.pintos.jooq.tables.pojos.Usuario
import org.springframework.data.repository.Repository

interface UsuarioRepository: Repository<Usuario, Int> {
  fun findUserByMatricula(matricula: Int?): Usuario?
}