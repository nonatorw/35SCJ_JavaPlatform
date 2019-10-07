package br.com.fiap.scj35.a02.model;

public class ContaCorrente extends ContaBancaria {

     public ContaCorrente() {
          super();
          System.out.println(this.getTipo() + " [" + this.getNumero() + "] criada!");
     }

     public ContaCorrente(boolean criarConta) {
          super(criarConta);
          System.out.println(this.getTipo() + " [" + this.getNumero() + "] criada!");
     }

     public ContaCorrente(String inNome) {
          super(inNome);
          System.out.println(this.getTipo() + " [" + this.getNumero() + "] -> Titular: " + this.getTitular());
     }

     public ContaCorrente(boolean criarConta, String inNome) {
          super(criarConta, inNome);
          System.out.println(this.getTipo() + " [" + this.getNumero() + "] -> Titular: " + this.getTitular());
     }

     @Override
     public void saque(double valor) {
          super.saque(valor + 0.10);
     }

     public String getTipo() {
          return "Conta Corrente";
     }
}
