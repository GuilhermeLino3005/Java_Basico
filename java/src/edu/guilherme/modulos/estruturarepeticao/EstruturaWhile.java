package edu.guilherme.modulos.estruturarepeticao;

import java.util.concurrent.ThreadLocalRandom; // Bibibloteca que fornece valores aleatorios.

public class EstruturaWhile {

     public static void main(String[] args) {
          double valor = 50;
          while (valor > 0) {
               double valorProduto = valorAleatorio();
               if (valorProduto > valor){
                    valorProduto = valor; 
               }

               System.out.println("Valor no carrinho: " +valorProduto+ "");
               valor = valor - valorProduto;
          }

          System.out.println("Valor atual: " +valor);
          System.out.println("Saldo insuficiente");
     }

     private static double valorAleatorio(){
          return ThreadLocalRandom.current().nextDouble(2, 20);
     }
     
}
