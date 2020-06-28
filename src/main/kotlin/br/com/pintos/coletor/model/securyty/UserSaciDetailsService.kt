package br.com.pintos.coletor.model.securyty

import br.com.pintos.coletor.model.services.UsuarioService
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service

@Service
class UserSaciDetailsService(val userSaciService: UsuarioService): UserDetailsService {
  override fun loadUserByUsername(username: String?): UserDetails {
    username ?: throw UsernameNotFoundException(username)
    val user = userSaciService.buscaPorLogin(username) ?: throw UsernameNotFoundException(username)
    val userAdapter = UserAdapter(user)
    return UserSaciPrincipal(userAdapter)
  }
}