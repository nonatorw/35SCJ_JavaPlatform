package br.com.fiap.scj35.a01.ex03;

public class Controles {
     public static void main(String[] args) {
          int x = 0;

          while (x <= 10) {
               System.out.println(x++);
          }

          if (x == 0) {
               System.out.println("x � igual a " + x);
          } else {
               System.out.println("x � igual a " + x);
          }

          switch (x) {
               case 0:
                    System.out.println("X � igual a zero: " + x);
                    break;
               default:
                    System.out.println("X � diferente de zero: " + x);
                    break;
          }
     }
}
