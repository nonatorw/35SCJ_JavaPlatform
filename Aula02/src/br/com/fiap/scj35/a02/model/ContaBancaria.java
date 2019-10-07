package br.com.fiap.scj35.a02.model;

/**
 * @author Nonato
 */
public abstract class ContaBancaria {
     private String     titular;
     private double     saldo;
     private int        numero;
     private static int qtdContas;

     public ContaBancaria() {
     }

     public ContaBancaria(boolean inCriarConta) {
          if (inCriarConta) {
               criarConta();
          }
     }

     public ContaBancaria(String inTitular) {
          this.setTitular(inTitular);
     }

     public ContaBancaria(boolean inCriarConta, String inTitular) {
          this(inCriarConta);
          this.setTitular(inTitular);
     }

     /**
      * M�todo de cria��o de contas - chamado somente nos construtores.
      */
     private void criarConta() {
          qtdContas++;
          this.numero = qtdContas;
     }

     /**
      * @param valor
      */
     public void saque(double valor) {
          saldo -= valor;
     }

     /**
      * @param valor
      */
     public void deposita(double valor) {
          saldo += valor;
     }

     /**
      * @return
      */
     public String getTitular() {
          return titular;
     }

     /**
      * @param titular
      */
     public void setTitular(String titular) {
          this.titular = titular;
     }

     /**
      * @return
      */
     public double getSaldo() {
          return saldo;
     }

     /**
      * @return
      */
     public int getNumero() {
          return numero;
     }

     /**
      * @return
      */
     public abstract String getTipo();
}
