package br.com.fiap.scj35.a01.ex01;

public class Pessoa {
     // Atributos
     private String     nome;
     private int        idade;
     private double     peso;
     private static int identificador;

     // Construtor padr�o
     public Pessoa() {
          identificador++;
          System.out.println(getIdentificador());
     }

     public Pessoa(String iNome) {
          this();
          this.setNome(iNome);
     }

     // Construtor com par�metros
     public Pessoa(String iNome, int iIdade, double iPeso) {
          this();
          this.setNome(iNome);
          this.setIdade(iIdade);
          this.setPeso(iPeso);
     }

     // Getter's & Setter's dos atributos
     public String getNome() {
          return this.nome;
     }

     public void setNome(String nome) {
          this.nome = nome;
     }

     public int getIdade() {
          return this.idade;
     }

     public void setIdade(int idade) {
          this.idade = idade;
     }

     public double getPeso() {
          return this.peso;
     }

     public void setPeso(double peso) {
          this.peso = peso;
     }

     public int getIdentificador() {
          return identificador;
     }

     // M�todos customizados => A��es da classe
     public void caminha() {
          System.out.println(this.getNome() + " est� caminhando");
     }
}