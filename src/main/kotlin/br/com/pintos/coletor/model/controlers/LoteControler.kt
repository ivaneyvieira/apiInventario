package br.com.pintos.coletor.model.controlers

import br.com.pintos.coletor.model.services.LoteService
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/lote")
class LoteControler(val loteService: LoteService): AbstractControler() {
  @GetMapping("/findById/{id}")
  fun findById(@PathVariable("id")
               id: Int) = execService {
    loteService.findById(id)
  }
  
  @GetMapping("/findLote/{lojaId}/{numLote}")
  fun findLote(@PathVariable("lojaId")
               lojaId: Int,
               @PathVariable("numLote")
               numLote: Int) = execService {
    loteService.findLote(lojaId, numLote)
  }
}