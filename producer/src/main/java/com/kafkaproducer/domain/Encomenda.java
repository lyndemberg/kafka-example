package com.kafkaproducer.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Encomenda {
    private String descricao;
    private Remetente remetente;
    private Endereco origem;
    private String nomeDestinatario;
    private Endereco destino;

    public Encomenda() {
    }

    public Encomenda(String descricao, Remetente remetente, Endereco origem, String nomeDestinatario, Endereco destino) {
        this.descricao = descricao;
        this.remetente = remetente;
        this.origem = origem;
        this.nomeDestinatario = nomeDestinatario;
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "Encomenda{" +
                "descricao='" + descricao + '\'' +
                ", remetente=" + remetente +
                ", origem=" + origem +
                ", nomeDestinatario='" + nomeDestinatario + '\'' +
                ", destino=" + destino +
                '}';
    }
}
