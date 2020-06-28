package br.com.pintos.coletor.model.controlers

import br.com.pintos.coletor.model.services.ColetaService
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/coleta")
class ColetaControler(val coletaService: ColetaService): AbstractControler() {
  @PostMapping("/fechaColeta")
  fun fechaColeta(@RequestParam("coletaId")
                  coletaId: Int) = execService {
    coletaService.fechaColeta(coletaId)
  }
  
  @GetMapping("/findColetaAberta/{inventarioId}/{usuarioId}")
  fun findColetaAberta(@PathVariable("inventarioId")
                       inventarioId: Int,
                       @PathVariable("usuarioId")
                       usuarioId: Int) = execService {
    coletaService.findColetaAberta(inventarioId, usuarioId)
  }
  
  @PostMapping("/mudaLote")
  fun mudaLote(@RequestParam("coletaId")
               coletaId: Int,
               @RequestParam("loteId")
               loteId: Int,
               @RequestParam("inventarioId")
               inventarioId: Int,
               @RequestParam("usuarioId")
               usuarioId: Int,
               @RequestParam("coletorNum")
               coletorNum: Int) = execService {
    coletaService.mudaLote(coletaId, loteId, inventarioId, usuarioId, coletorNum)
  }
}