package com.kafkaexemplo.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Endereco {
    private String rua;
    private String bairro;
    private String cidade;
    private Integer numero;

    public Endereco() {
    }

    public Endereco(String rua, String bairro, String cidade, Integer numero) {
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "rua='" + rua + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", numero=" + numero +
                '}';
    }
}
