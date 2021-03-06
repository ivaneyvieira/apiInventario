package br.com.pintos.coletor.model.beans

import java.sql.Time

data class Leitura(var id: Long? = null,
                   var hora: Time? = null,
                   var leitura: String? = null,
                   var observacao: String? = null,
                   var quant: Int? = null,
                   var status: String? = null,
                   var coleta_id: Long? = null,
                   var produto_id: Long? = null,
                   var version: Int? = null)