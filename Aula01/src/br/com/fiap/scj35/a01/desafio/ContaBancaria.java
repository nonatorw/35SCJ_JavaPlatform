package br.com.fiap.scj35.a01.desafio;

public class ContaBancaria {
     private String titular;
     private double saldo;
     private int    numero;

     public String getTitular() {
          return titular;
     }

     public void setTitular(String titular) {
          this.titular = titular;
     }

     public double getSaldo() {
          return this.saldo;
     }

     public int getNumero() {
          return numero;
     }

     public void setNumero(int numero) {
          this.numero = numero;
     }

     public void deposita(double vlDeposito) {
          this.saldo += vlDeposito;
     }

     public void saque(double vlSaque) {
          this.saldo -= vlSaque;
     }
}