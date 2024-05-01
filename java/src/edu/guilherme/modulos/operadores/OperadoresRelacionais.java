package edu.guilherme.modulos.operadores;

public class OperadoresRelacionais {
     public static void main(String[] args){
          String nome01 = "Guilherme";
          String nome02 = new String("Guilherme");

          System.out.println(nome01.equals(nome02));

          int numero1 = 1;
          int numero2  = 2;

          boolean sim_nao = numero1 == numero2;

          System.out.println("Numero 01 é igual a Numero 02? " +sim_nao);

          sim_nao = numero1 != numero2;

          System.out.println("Numero 01 é diferente a Numero 02? " +sim_nao);

          sim_nao = numero1 > numero2;

          System.out.println("Numero 01 é maior a Numero 02? " +sim_nao);
     }
}
