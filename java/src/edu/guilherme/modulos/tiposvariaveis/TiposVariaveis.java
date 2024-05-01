package edu.guilherme.modulos.tiposvariaveis;

public class TiposVariaveis {
     public static void main(String[] args) {
         //Tipos primitivos
          byte idade = 123;
          short ano = 2021;
          int cep = 21070333;
          long cpf = 1234567889;
          double salario = 1275.33;

          short numeroCurto = 1;
          int numeroNormal = numeroCurto;
          short numeroCurto2 = (short) numeroCurto;

          int numero = 5;

          numero = 10;

          System.err.println(numero);
         
          final double VALOR_DE_PI = 3.14; //declrando uma constante 

     }
}
