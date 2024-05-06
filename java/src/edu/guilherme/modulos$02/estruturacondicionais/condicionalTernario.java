package edu.guilherme.modulos$02.estruturacondicionais;
import java.util.Scanner;;
public class condicionalTernario {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          int media = 7;
          System.out.println("Digite a nota do aluno");
          int nota = scanner.nextInt();
          
          String resultado = nota >= media ? "Aprovado": "Reprovado"; //condiconal simples

          System.out.println(resultado);

          resultado = nota >= media ? "Aprovado": nota >= 5 && nota < media ? "Recuperação": "Reprovado"; // condicional encadeado 
          System.out.println(resultado);


          
     
     }
}

