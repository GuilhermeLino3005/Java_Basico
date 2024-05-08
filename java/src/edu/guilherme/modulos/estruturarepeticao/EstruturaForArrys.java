package edu.guilherme.modulos.estruturarepeticao;

public class EstruturaForArrys {
     public static void main(String[] args) {
          String alunos [] = {"FELIPE", "GUILHERME", "JÚLIA", "JONAS", "GRAZIELY"};

          for(int x = 0; x < alunos.length; x++){
               System.out.println("O aluno no indice x = " +x+ " é " +alunos[x]);
          }

          //Forma abreviada 
          for(String aluno : alunos){
               System.out.println("Nome do aluno é:  " +aluno); 
          }
          

     }
}
