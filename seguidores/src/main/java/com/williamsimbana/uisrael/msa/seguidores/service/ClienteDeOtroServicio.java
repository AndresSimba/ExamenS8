package com.williamsimbana.uisrael.msa.seguidores.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ClienteDeOtroServicio {

    @Autowired
    private RestTemplate restTemplate;

    public String llamarOtroServicio() {
        // Nombre lógico "otro-servicio" tal como aparece en Eureka
        return restTemplate.getForObject("http://otro-servicio/api/williamsimbana/followers", String.class);
    }
}