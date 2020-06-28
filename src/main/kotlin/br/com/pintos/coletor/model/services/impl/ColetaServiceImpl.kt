package br.com.pintos.coletor.model.services.impl

import br.com.pintos.coletor.model.repositories.ColetaRepository
import br.com.pintos.coletor.model.services.ColetaService
import org.springframework.stereotype.Service

@Service
class ColetaServiceImpl(val coletaRepository: ColetaRepository): ColetaService