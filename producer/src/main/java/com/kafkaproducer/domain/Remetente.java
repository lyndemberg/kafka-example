package com.kafkaproducer.domain;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Remetente {
    private String nome;
    private String cpf;

    public Remetente() {
    }

    public Remetente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Remetente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}

