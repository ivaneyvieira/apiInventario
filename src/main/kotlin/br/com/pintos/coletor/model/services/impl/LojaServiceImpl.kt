package br.com.pintos.coletor.model.services.impl

import br.com.pintos.coletor.model.repositories.LojaRepository
import br.com.pintos.coletor.model.services.LojaService
import org.springframework.stereotype.Service

@Service
class LojaServiceImpl(val lojaRepository: LojaRepository): LojaService