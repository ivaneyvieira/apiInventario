package br.com.pintos.coletor.model.beans

import java.time.LocalDate

data class Inventario(var id: Long? = null,
                      var numero: Int? = null,
                      var data: LocalDate? = null,
                      var observacao: String? = null,
                      var tipoinventario: String? = null,
                      var statusinventario: String? = null,
                      var loja_id: Long? = null,
                      var version: Int? = null,
                      var fornecedor_id: Long? = null,
                      var cl_id: Long? = null)