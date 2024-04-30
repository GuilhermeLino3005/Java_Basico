package edu.guilherme.modulos.anatomiaclasses;

public class BotimEstudantil {
     public static void main(String[] args){
          int mediaFinal = 5;
          if (mediaFinal < 6) {
               System.err.println("Aluno Reprovado");
          }
          else if (mediaFinal == 6) {
               System.err.println("Prova Final");
          }
          else{
               System.out.println("Aluno Aprovado");
          }
     }
}
