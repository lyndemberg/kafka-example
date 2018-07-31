package com.kafkaconsumer.domain;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Remetente {
    private String nome;
    private String cpf;
    private Endereco origem;

    public Remetente() {
    }

    public Remetente(String nome, String cpf, Endereco origem) {
        this.nome = nome;
        this.cpf = cpf;
        this.origem = origem;
    }

    @Override
    public String toString() {
        return "Remetente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", origem=" + origem +
                '}';
    }
}

