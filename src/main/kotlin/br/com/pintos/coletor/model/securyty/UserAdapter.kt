package br.com.pintos.coletor.model.securyty

import br.com.pintos.jooq.tables.pojos.Usuario

class UserAdapter(private val usuario: Usuario) {
  val senha: String?
    get() = usuario.senha?.trim()
  val login: String?
    get() = usuario.matricula?.toString()
  val perfil: String? = "ADMIN"
}