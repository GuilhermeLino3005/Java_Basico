package edu.guilherme.modulos.operadores;

public class Operadores {
     public static void main(String[] args){
          String nomeCompleto = "LINGUAGEM" + "JAVA";
          System.out.println(nomeCompleto);
          
          String concatenacaoo = "?";

          concatenacaoo = 1 + 1 + 1 + "1";
          
          System.out.println(concatenacaoo);
          
          concatenacaoo = 1 + "1" + 1 + 1;
          
          System.out.println(concatenacaoo);
          
          concatenacaoo = "1" + 1 + 1 + 1;
          
          System.out.println(concatenacaoo);

          concatenacaoo = "1" +(1+1+1);
          
          System.out.println(concatenacaoo);
     }
}
