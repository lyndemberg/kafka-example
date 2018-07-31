package com.kafkaproducer.web;

import com.kafkaproducer.domain.Encomenda;
import com.kafkaproducer.service.EncomendaService;
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

    @GetMapping
    public ResponseEntity getTeste(){
        return ResponseEntity.ok().body("teste");
    }
}
