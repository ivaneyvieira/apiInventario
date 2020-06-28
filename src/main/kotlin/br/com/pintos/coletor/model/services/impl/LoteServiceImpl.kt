package br.com.pintos.coletor.model.services.impl

import br.com.pintos.coletor.model.repositories.LoteRepository
import br.com.pintos.coletor.model.services.LoteService
import org.springframework.stereotype.Service

@Service
class LoteServiceImpl(val loteRepository: LoteRepository): LoteService