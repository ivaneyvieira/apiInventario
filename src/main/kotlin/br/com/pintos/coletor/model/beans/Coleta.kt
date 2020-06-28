package br.com.pintos.coletor.model.beans

data class Coleta(var id: Long? = null,
                  var numleitura: Int? = null,
                  var inventario_id: Long? = null,
                  var lote_id: Long? = null,
                  var usuario_id: Long? = null,
                  var coletor: Int? = null,
                  var status: String? = null,
                  var version: Int? = null)