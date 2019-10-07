package br.com.fiap.scj35.a01.ex01;

public class TestaPessoa {
     public static void main(String[] args) {
          Pessoa p1 = new Pessoa();
          p1.caminha(); // Demonstra que nome n�o foi informado at� ent�o
          p1.setNome("Danilo");
          p1.caminha(); // Nome j� foi informado
          System.out.println(p1.getNome());

          Pessoa p2 = new Pessoa("Nonato", 34, 114);
          System.out.println(p2.getNome());

          Pessoa p3 = new Pessoa("Daniel");
          p3.caminha(); // Nome j� foi informado
          System.out.println(p3.getNome());

          // System.out.println(p1.getIdentificador());
     }
}
