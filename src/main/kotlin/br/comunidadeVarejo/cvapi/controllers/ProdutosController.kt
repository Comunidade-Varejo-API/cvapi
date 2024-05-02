package br.comunidadeVarejo.cvapi.controllers

import br.comunidadeVarejo.cvapi.models.Produto
import br.comunidadeVarejo.cvapi.services.ProdutosService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController()
@RequestMapping("/produtos")
class ProdutosController(
    private val service: ProdutosService
) {

    @GetMapping
    fun getProdutos(): List<Produto> {
        return service.getProdutos()
    }
}