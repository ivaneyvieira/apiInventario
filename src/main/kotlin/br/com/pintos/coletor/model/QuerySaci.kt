package br.com.pintos.coletor.model

import br.com.pintos.framework.model.DBProperties
import br.com.pintos.framework.model.QueryDB

class QuerySaci: QueryDB(driver, url, username, password) {
  companion object {
    private val db = DBProperties("saci")
    internal val driver = db.driver
    internal val url = db.url
    internal val username = db.username
    internal val password = db.password
    internal val test = db.test
    val ipServer =
      url.split("/")
        .getOrNull(2)
  }
}

val saci = QuerySaci()