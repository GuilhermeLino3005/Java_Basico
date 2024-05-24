package edu.guilherme.modulos.collections.listatarefa;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
     //Atributo
     private List<Tarefa> tarefalist;

     public ListaTarefa(){
          this.tarefalist = new ArrayList<>();
     }

     public void adicionarTarefa(String descricao){
          tarefalist.add(new Tarefa(descricao));
     }

     public void removerTarefa(String descricao){
          List<Tarefa> tarefasParaRemover = new ArrayList<>();
          for(Tarefa t : tarefalist){
               if(t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefasParaRemover.add(t);
               }
          }
          tarefalist.removeAll(tarefasParaRemover);
     }

     public int obterNumeroTotalTarefa(){
          return tarefalist.size();
     }

     public void obterDescricoesTarefas(){
          System.out.println(tarefalist);
     }

     public static void main(String[] args) {
          ListaTarefa listatarefa = new ListaTarefa();

          System.out.println("O número total de elementos na lista é: " +listatarefa.obterNumeroTotalTarefa());

          listatarefa.adicionarTarefa("Tarefa 1");
          listatarefa.adicionarTarefa("Tarefa 1");
          listatarefa.adicionarTarefa("Tarefa 2");

          System.out.println("O número total de elementos na lista é: " +listatarefa.obterNumeroTotalTarefa());

          listatarefa.removerTarefa("Tarefa 1");
          System.out.println("O número total de elementos na lista é: " +listatarefa.obterNumeroTotalTarefa());

          listatarefa.obterDescricoesTarefas();
     }

}