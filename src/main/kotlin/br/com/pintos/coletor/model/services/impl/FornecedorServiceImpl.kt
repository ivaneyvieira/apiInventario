package br.com.pintos.coletor.model.services.impl

import br.com.pintos.coletor.model.repositories.FornecedorRepository
import br.com.pintos.coletor.model.services.FornecedorService
import org.springframework.stereotype.Service

@Service
class FornecedorServiceImpl(val fornecedorRepository: FornecedorRepository): FornecedorService