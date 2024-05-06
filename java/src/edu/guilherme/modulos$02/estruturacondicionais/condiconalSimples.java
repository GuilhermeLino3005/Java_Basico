package edu.guilherme.modulos$02.estruturacondicionais;
import java.util.Scanner;

public class condiconalSimples {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          double saldo = 25.0;

          System.out.println("Digite o valor debitado: ");
          
          double valorSolicitado = scanner.nextDouble();

          if(valorSolicitado < saldo){
               saldo = saldo - valorSolicitado;
          }

          System.out.println(saldo);
     }
}
