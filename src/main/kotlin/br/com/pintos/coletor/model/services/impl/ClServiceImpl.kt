package br.com.pintos.coletor.model.services.impl

import br.com.pintos.coletor.model.repositories.ClRepository
import br.com.pintos.coletor.model.services.ClService
import org.springframework.stereotype.Service

@Service
class ClServiceImpl(val clRepository: ClRepository): ClService