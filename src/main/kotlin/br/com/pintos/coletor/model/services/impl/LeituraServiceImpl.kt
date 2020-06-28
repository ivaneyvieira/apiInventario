package br.com.pintos.coletor.model.services.impl

import br.com.pintos.coletor.model.repositories.LeituraRepository
import br.com.pintos.coletor.model.services.LeituraService
import org.springframework.stereotype.Service

@Service
class LeituraServiceImpl(val leituraRepository: LeituraRepository): LeituraService