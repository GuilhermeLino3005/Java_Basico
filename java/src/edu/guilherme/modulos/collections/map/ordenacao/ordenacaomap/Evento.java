package edu.guilherme.modulos.collections.map.ordenacao.ordenacaomap;

public class Evento{
     private String nome;

     private String atracao;

     public Evento(String nome, String atracao){
          this.nome = nome;
          this.atracao = atracao;
     }
     public String getNome() {
          return nome;
     }

     public String getAtracao() {
          return atracao;
     }

     public String toString(){
          return "Evento{" +
               "Nome = " + nome+ '\''+
               ", atracao = " +atracao+ 
               "}";
     }

}
