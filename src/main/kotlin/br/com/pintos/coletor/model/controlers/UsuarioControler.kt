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
class UsuarioControler(val service: UsuarioService) {
  @GetMapping("/matricula/{codigo}")
  fun buscaPorCodigo(@PathVariable("codigo")
                     codigo: String): ResponseEntity<Response<Usuario>> {
    val usuario = service.buscaPorLogin(codigo)
    return if(usuario == null) ResponseEntity.ok(Response(listOf("Usuario não encontrado")))
    else ResponseEntity.ok(Response(data = usuario))
  }
}