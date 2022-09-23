package com.example.desafio_dio_banco_digital;

import lombok.Data;

@Data
public class Cliente {

    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }
}
