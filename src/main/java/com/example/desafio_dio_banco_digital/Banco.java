package com.example.desafio_dio_banco_digital;

import lombok.Data;

import java.util.List;

@Data
public class Banco {
    private String nome;
    private List<Conta> contaList;
}
