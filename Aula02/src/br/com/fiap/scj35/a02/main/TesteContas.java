package br.com.fiap.scj35.a02.main;

import br.com.fiap.scj35.a02.model.ContaBancaria;
import br.com.fiap.scj35.a02.model.ContaCorrente;

/**
 * @author dnvtrn
 */
public class TesteContas {

     /**
      * @param args
      */
     public static void main(String[] args) {
          //ContaBancaria c1 = new ContaBancaria();
          ContaBancaria c1 = new ContaCorrente();
          c1.setTitular("Dan");
          c1.deposita(100);
          System.out.println(c1.getSaldo());
          c1.saque(10);
          System.out.println(c1.getSaldo());
          System.out.println(c1.getTitular());
     }
}