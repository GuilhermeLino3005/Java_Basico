package edu.guilherme.modulos.collections.list.listatarefa;

public class Tarefa {
     //Atribuito 
     private String descricao;

     public Tarefa(String descricao){
          this.descricao = descricao;
     }

     public String getDescricao() {
          return descricao;
     }

     public String toString(){
          return "Tarefa {"+
               "descrição"+ descricao+'\''+
               '}';
     }
     
}

