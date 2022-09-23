package com.example.desafio_dio_banco_digital;

public interface InterfaceConta {
    void sacar(double valor);
    void depositar(double valor);
    void transferir(Conta contaDestino, double valor);
    void imprimirExtrato();
}
