package com.example.desafio_dio_banco_digital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioDioBancoDigitalApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioDioBancoDigitalApplication.class, args);

		Cliente cliente = new Cliente("Fulano");
		Cliente cliente2 = new Cliente("Sicrano");

		Conta cc = new ContaCorrente(cliente);
		Conta cp = new ContaPoupanca(cliente2);

		cc.imprimirExtrato();
		cp.imprimirExtrato();

		cc.depositar(100);
		cp.depositar(300);

		cc.imprimirExtrato();
		cp.imprimirExtrato();

		cc.transferir(cp,50);
		cp.transferir(cc,100);

		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}

}
