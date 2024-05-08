package edu.guilherme.modulos.estruturarepeticao;

public class EstruturaBreaakContinue {
     public static void main(String[] args) {
          
          System.out.println("Estrutura de repetição usando o comando BREAK ");
          for(int numero = 1; numero <= 5; numero++){
               if(numero == 3){
                    break;
               }
               System.out.println(numero);
          }

          System.out.println("Estrutura de repetição usando o comando CONTINUE ");
          for(int numero = 1; numero <= 5; numero++){
               if (numero == 3) {
                    continue;
               }
               System.out.println(numero);
          }
     }
}
