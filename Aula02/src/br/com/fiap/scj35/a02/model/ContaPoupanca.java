package br.com.fiap.scj35.a02.model;

public class ContaPoupanca extends ContaBancaria {

     public ContaPoupanca() {
          super();
          System.out.println(this.getTipo() + " [" + this.getNumero() + "] criada!");
     }

     public ContaPoupanca(String inNome) {
          super(inNome);
          System.out.println(this.getTipo() + " [" + this.getNumero() + "] -> Titular: " + this.getTitular());
     }

     public ContaPoupanca(boolean inCriarConta) {
          super(inCriarConta);
          System.out.println(this.getTipo() + " [" + this.getNumero() + "] criada!");
     }

     public ContaPoupanca(boolean inCriarConta, String inNome) {
          super(inCriarConta, inNome);
          System.out.println(this.getTipo() + " [" + this.getNumero() + "] -> Titular: " + this.getTitular());
     }

     public String getTipo() {
          return "Conta Poupan�a";
     }
}
