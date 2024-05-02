package br.comunidadeVarejo.cvapi.models

data class Produto (
    val id: Long,
    val descricao: String,
    val cst: String,
    val ncm_codigo: String,
    val ncm: String,
    val cest: String
)