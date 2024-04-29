package edu.guilherme.modulo_01;
public class MinhaClasse {
    
     /*declarando metodos 
     *   Sintaxe: 
     *        TipoRetorno NomeObjetivoNoInfinitivo parametro(s)    
     */

     public static String nomeCompleto(String primeiroNome, String segundoNome){
          return "Resuldado do metodo: "+ primeiroNome.concat(" ").concat(segundoNome);
     }

     public static void main(String[] args){
          //declarando variaveis 
          String meuNome = "Guilherme";
          String sobrenome = "Lino";
          String nomeCompleto = nomeCompleto(meuNome, sobrenome); //chamada de um metodo.

          System.err.println(nomeCompleto);

          int dataNascimento = 2005;

          boolean verdadeira = true;

          dataNascimento = 2004;   
     }     
     
           
}
