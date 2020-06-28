package br.com.pintos.coletor.model.securyty

import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails

class UserSaciPrincipal(val user: UserAdapter): UserDetails {
  override fun getAuthorities(): MutableCollection<out GrantedAuthority> {
    val authorities = mutableListOf<GrantedAuthority>()
    authorities.add(SimpleGrantedAuthority(user.perfil))
    return authorities
  }
  
  override fun isEnabled(): Boolean = true
  
  override fun getUsername(): String = user.login ?: ""
  
  override fun isCredentialsNonExpired(): Boolean = true
  
  override fun getPassword(): String = user.senha ?: ""
  
  override fun isAccountNonExpired(): Boolean = true
  
  override fun isAccountNonLocked(): Boolean = true
}