package edu.guilherme.modulos$02.estruturacondicionais;
import java.util.Scanner;

public class condicionalEncadeada {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          int media = 7;
          System.out.println("Digite a nota do aluno");
          int nota = scanner.nextInt();

          if (nota >= media) {
               System.out.println("Aprovado");
          }
          else if(nota >= 5 && nota < 7){
               System.out.println("Prova Recuperação");
          }
          else{
               System.out.println("Reprovado");
          }

     }
}