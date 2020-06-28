package br.com.pintos.coletor.model.controlers

import br.com.pintos.coletor.model.responce.Response
import br.com.pintos.coletor.model.services.UsuarioService
import br.com.pintos.jooq.tables.pojos.Usuario
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/usuario")
class UserSaciControler(val service: UsuarioService) {
  @GetMapping("/matricula/{codigo}")
  fun buscaPorCodigo(@PathVariable("codigo")
                     codigo: String): ResponseEntity<Response<Usuario>> {
    val response = Response<Usuario>()
    val ficha = service.buscaPorLogin(codigo)
    return if(ficha == null) {
      response.erros.add("Usuario não encontrado")
      ResponseEntity.ok(response)
    }
    else {
      response.data = ficha
      ResponseEntity.ok(response)
    }
  }
}