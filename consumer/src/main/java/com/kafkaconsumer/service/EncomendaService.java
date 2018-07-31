package com.kafkaconsumer.service;

import com.kafkaconsumer.domain.Encomenda;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class EncomendaService {
    private Logger log = LoggerFactory.getLogger(Encomenda.class);

    @KafkaListener(topics = "notificar")
    public void receberMensagem(Encomenda encomenda) {
        log.info("Nova encomenda -> {}", encomenda);
    }
}
