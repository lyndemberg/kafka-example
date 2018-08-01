package com.kafkaexemplo.web;

import com.kafkaexemplo.domain.Encomenda;
import com.kafkaexemplo.service.EncomendaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/encomenda")
public class EncomendaResource {

    private final EncomendaService service;

    public EncomendaResource(EncomendaService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Encomenda> despacharEncomenda(@RequestBody Encomenda encomenda){
        service.enviar(encomenda);
        return ResponseEntity.ok().body(null);
    }

}
