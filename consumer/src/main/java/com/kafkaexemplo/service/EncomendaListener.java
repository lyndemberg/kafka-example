package com.kafkaexemplo.service;


import com.kafkaexemplo.domain.Encomenda;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class EncomendaListener {
    private Logger log = LoggerFactory.getLogger(EncomendaListener.class);

    @KafkaListener(topics = "notify")
    public void receberMensagem(Encomenda encomenda) {
        log.info("Nova encomenda {}", encomenda);
    }
}
