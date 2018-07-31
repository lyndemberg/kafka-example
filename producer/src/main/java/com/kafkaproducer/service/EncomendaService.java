package com.kafkaproducer.service;

import com.kafkaproducer.domain.Encomenda;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class EncomendaService {

    private final KafkaTemplate kafkaTemplate;

    public EncomendaService(KafkaTemplate kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void enviar(Encomenda encomenda){
        kafkaTemplate.send("notificar",encomenda);
    }
}
