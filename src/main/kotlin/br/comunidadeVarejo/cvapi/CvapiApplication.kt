package br.comunidadeVarejo.cvapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CvapiApplication

fun main(args: Array<String>) {
	runApplication<CvapiApplication>(*args)
}
