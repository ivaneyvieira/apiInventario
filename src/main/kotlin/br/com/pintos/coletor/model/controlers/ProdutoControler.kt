package br.com.pintos.coletor.model.controlers

import br.com.pintos.coletor.model.services.ProdutoService
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/produto")
class ProdutoControler(val produtoService: ProdutoService): AbstractControler() {
  @GetMapping("/findById/{id}")
  fun findById(@PathVariable("id")
               id: Int) = execService {
    produtoService.findById(id)
  }
}