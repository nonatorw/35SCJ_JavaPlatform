package br.com.fiap.scj35.a01.ex03;

public class Loop2 {
     public static void main(String[] args) {
          int total = 0;

          for (int i = 0; i <= 1000; i++) {
               total += i;
               if (total == 2) {
                    System.out.println("Caiu na regra");
                    continue;
               }
          }

          System.out.println(total);
     }
}
