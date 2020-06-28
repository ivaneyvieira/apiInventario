package br.com.pintos.coletor.model.beans

data class Estoque(var id: Long? = null,
                   var quant: Int? = null,
                   var inventario_id: Long? = null,
                   var produto_id: Long? = null,
                   var version: Int? = null)