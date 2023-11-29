package com.cep.api.controllers

import com.cep.api.entities.CepData
import com.cep.api.services.CepService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/cep")
class CepController {
    @Autowired
    lateinit var CepService: CepService

    @GetMapping("/{cep}")
    fun get(@PathVariable("cep") cep: String): CepData?   {
        return CepService.getCep(cep)
    }

    @GetMapping("/")
    fun get(): String {
        return "Running"
    }

}