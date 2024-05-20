package edu.guilherme.modulos.fundamentospoo.declarandoenuns;

public class SistemaIbge {
     public static void main(String[] args) {
          for(EstadoBrasileiro e: EstadoBrasileiro.values()){
               System.out.println(e.getSigla()+" - " +e.getNome());

          }

          EstadoBrasileiro eb = EstadoBrasileiro.PIAUI;

          System.err.println(eb.getNome());
          System.out.println(eb.getSigla());
          System.out.println(eb.getNomeMaiusculo());
          System.out.println(eb.getIbge());

     }
}
