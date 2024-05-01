package edu.guilherme.modulos.operadores;

public class OperadoresLogicos {
     public static void main (String[] args){
          boolean condicao = true;

          boolean condicao2 = false;

          if(condicao && (7 > 4)){
               System.out.println("As duas condições vão verdadeiras");
          }
          else{
               System.out.println("FIM");
          }

          if (condicao || condicao2) {
               System.out.println("Umas das condições vão verdadeiras");
          }
     }
}
