package com.cep.api.services

import com.cep.api.entities.CepData
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class CepService {
    @Autowired
    lateinit var template: RestTemplate;

    fun getCep(cep: String):CepData?{
        val url = "https://viacep.com.br/ws/$cep/json/"
        return template.getForObject(url, CepData::class.java)
    }
}