package br.comunidadeVarejo.cvapi.repositories

import br.comunidadeVarejo.cvapi.models.Produto
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate
import org.springframework.stereotype.Repository

@Repository
class ProdutosRepository( private val jdbcTemplate: JdbcTemplate) {

    fun getProdutos(): List<Produto> {
        val sql = """
            SELECT * from produtos
        """.trimIndent()

        return jdbcTemplate.query(sql) { rs, _ ->
            Produto(
                id = rs.getLong("id"),
                descricao = rs.getString("descricao"),
                cst = rs.getString("cst"),
                ncm_codigo = rs.getString("ncm_codigo"),
                ncm = rs.getString("ncm"),
                cest = rs.getString("cest"),
            )
        }
    }
}