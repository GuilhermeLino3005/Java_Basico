package edu.guilherme.modulo_01;

public class BoletimEstudantil {
     public static void main(String[] args) {
          int nota = 6;

          if (nota < 6) {
               System.out.println("Aluno Reprovado");
          }
          else if (nota == 6) {
               System.out.println("Prova Final");
          }
          else{
               System.err.println("Aluno Aprovado");
          }
     }
}
