package br.com.fiap.scj35.a02.main;

import br.com.fiap.scj35.a02.model.ContaBancaria;
import br.com.fiap.scj35.a02.model.ContaCorrente;
import br.com.fiap.scj35.a02.model.ContaPoupanca;

public class TesteContas2 {
     public static void main(String[] args) {
          // Instancia uma Conta Poupan�a, define o Titular e exibe dados da conta criada:
          ContaBancaria cp1 = new ContaPoupanca("Nonato");
          // Deposita R$ 100,00
          cp1.deposita(100);
          // Saca R$ 50,00
          cp1.saque(50);
          // Exibe Saldo
          System.out.println("Saldo " + cp1.getTipo() + " [" + cp1.getNumero() + "]: " + cp1.getSaldo());

          // Instancia a Conta Corrente, define o Titular e exibe dados da conta criada:
          ContaBancaria cc1 = new ContaCorrente("Danilo");
          // Deposita R$ 1000,00
          cc1.deposita(1000);
          // Saca R$ 500,00
          cc1.saque(500);
          // Exibe Saldo
          System.out.println("Saldo " + cc1.getTipo() + " [" + cc1.getNumero() + "]: " + cc1.getSaldo());

          // Instancia uma Conta Poupan�a, define o Titular e exibe dados da conta criada:
          ContaBancaria cp2 = new ContaPoupanca(Boolean.FALSE, "Nonato");
          // Deposita R$ 100,00
          cp2.deposita(100);
          // Saca R$ 50,00
          cp2.saque(50);
          // Exibe Saldo
          System.out.println("Saldo " + cp2.getTipo() + " [" + cp2.getNumero() + "]: " + cp2.getSaldo());

          // Instancia a Conta Corrente, define o Titular e exibe dados da conta criada:
          ContaBancaria cc2 = new ContaCorrente(Boolean.FALSE, "Danilo");
          // Deposita R$ 1000,00
          cc2.deposita(1000);
          // Saca R$ 500,00
          cc2.saque(500);
          // Exibe Saldo
          System.out.println("Saldo " + cc2.getTipo() + " [" + cc2.getNumero() + "]: " + cc2.getSaldo());

          // Instancia uma Conta Poupan�a, define o Titular e exibe dados da conta criada:
          ContaBancaria cp3 = new ContaPoupanca(Boolean.TRUE, "Nonato");
          // Deposita R$ 100,00
          cp3.deposita(100);
          // Saca R$ 50,00
          cp3.saque(50);
          // Exibe Saldo
          System.out.println("Saldo " + cp3.getTipo() + " [" + cp3.getNumero() + "]: " + cp3.getSaldo());

          // Instancia a Conta Corrente, define o Titular e exibe dados da conta criada:
          ContaBancaria cc3 = new ContaCorrente(Boolean.TRUE, "Danilo");
          // Deposita R$ 1000,00
          cc3.deposita(1000);
          // Saca R$ 500,00
          cc3.saque(500);
          // Exibe Saldo
          System.out.println("Saldo " + cc3.getTipo() + " [" + cc3.getNumero() + "]: " + cc3.getSaldo());
     }
}
