package br.com.pintos.coletor.model.beans

data class Produto(var id: Long? = null,
                   var barcode: String? = null,
                   var codigo: String? = null,
                   var descricao: String? = null,
                   var duplicado: Byte? = null,
                   var foralinha: Byte? = null,
                   var grade: String? = null,
                   var usoconsumo: Byte? = null,
                   var cl_id: Long? = null,
                   var fornecedor_id: Long? = null,
                   var version: Int? = null)