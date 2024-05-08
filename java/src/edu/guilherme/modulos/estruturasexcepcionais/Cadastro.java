package edu.guilherme.modulos.estruturasexcepcionais;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Cadastro {
     public static void main(String[] args) {
          try{
               Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
               
               System.out.println("Digite seu nome: ");
               String nome = scanner.nextLine();

               System.out.println("Digite seu sobrenome: ");
               String sobrenome = scanner.nextLine();

               System.out.println("Digite sua idade: ");
               int idade = scanner.nextInt();

               System.out.println("Digite sua altura");
               double altura = scanner.nextDouble();
               
               
               System.out.println("Olá, me chamo " + nome + " " +sobrenome);
               System.out.println("Tenho " +idade+ " anos");
               System.out.println("Minha altura é "+altura+" cm");
               scanner.close();
          } 
          catch(InputMismatchException e){
               System.err.println("O campos idade e altura precisam ser numéricos");
          }
          
     }
}