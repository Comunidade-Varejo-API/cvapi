package br.comunidadeVarejo.cvapi.controllers

import br.comunidadeVarejo.cvapi.models.Produto
import br.comunidadeVarejo.cvapi.services.ProdutosService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/produtos")
@CrossOrigin(origins = ["http://localhost:4200"])
class ProdutosController(
    private val service: ProdutosService
) {

    @GetMapping
    fun getProdutos(): List<Produto> {
        return service.getProdutos()
    }
}
@RestController
@RequestMapping("/produto")
@CrossOrigin(origins = ["http://localhost:4200"])
class ProdutoController(
    private val service: ProdutosService
) {


    @GetMapping("/id")
fun getProdutosId(): List<Long> {
    return service.getProdutosId()
}
@GetMapping("/{id}")
fun getProdutoPorId(@PathVariable id: Long): List<Produto>? {
    return service.getProdutoPorId(id)
}

}