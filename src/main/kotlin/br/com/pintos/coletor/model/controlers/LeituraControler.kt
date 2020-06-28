package br.com.pintos.coletor.model.controlers

import br.com.pintos.coletor.model.services.LeituraService
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/leitura")
class LeituraControler(val leituraService: LeituraService): AbstractControler() {
  @GetMapping("/ultimaLeitura/{coletaId}")
  fun ultimaLeitura(@PathVariable("coletaId")
                    coletaId: Int) = execService {
    leituraService.ultimaLeitura(coletaId)
  }
  
  @PostMapping("/validaLeitura")
  fun validaLeitura(@RequestParam("leitura")
                    leitura: String,
                    @RequestParam("coletaId")
                    coletaId: Int) = execService {
    leituraService.validaLeitura(leitura, coletaId)
  }
  
  @GetMapping("/adicionaLeitura/{leitura}/{coletaId}")
  fun adicionaLeitura(@PathVariable("leitura")
                      leitura: String,
                      @PathVariable("coletaId")
                      coletaId: Int) = execService {
    leituraService.adicionaLeitura(leitura, coletaId)
  }
  
  @GetMapping("/adicionaErro/{leitura}/{coletaId}/{message}")
  fun adicionaErro(@PathVariable("leitura")
                   leitura: String,
                   @PathVariable("coletaId")
                   coletaId: Int,
                   @PathVariable("message")
                   message: String) = execService {
    leituraService.adicionaErro(leitura, coletaId, message)
  }
  
  @PostMapping("/apagaTodos")
  fun apagaTodos(@RequestParam("coletaId")
                 coletaId: Int) = execService {
    leituraService.apagaTodos(coletaId)
  }
  
  @PostMapping("/apagaUltimo")
  fun apagaUltimo(@RequestParam("coletaId")
                  coletaId: Int) = execService {
    leituraService.apagaUltimo(coletaId)
  }
}