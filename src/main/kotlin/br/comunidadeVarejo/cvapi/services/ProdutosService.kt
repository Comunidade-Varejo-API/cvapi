package br.comunidadeVarejo.cvapi.services

import br.comunidadeVarejo.cvapi.models.Produto
import br.comunidadeVarejo.cvapi.repositories.ProdutosRepository
import org.springframework.stereotype.Service

@Service
class ProdutosService(
    private val repository: ProdutosRepository
) {

    fun getProdutos(): List<Produto> = repository.getProdutos()
}