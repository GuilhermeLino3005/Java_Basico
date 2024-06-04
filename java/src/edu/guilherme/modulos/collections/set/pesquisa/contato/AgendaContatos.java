package edu.guilherme.modulos.collections.set.pesquisa.contato;

import java.util.HashSet;
import java.util.Set;

import javax.management.RuntimeErrorException;

public class AgendaContatos {
     private Set<Contato> contatoSet;

     public AgendaContatos(){
          this.contatoSet = new HashSet<>();
     }

     public void adicionarContato(String nome, int numero){
          contatoSet.add(new Contato(nome, numero));
     }

     public void exibirContato(){
          System.out.println(contatoSet);
     }

     public Set<Contato> pesquisarPorNome(String nome) {
          Set<Contato> contatosPorNome = new HashSet<>();
          if (!contatoSet.isEmpty()) {
            for (Contato c : contatoSet) {
              if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
              }
            }
            return contatosPorNome;
          } else {
            throw new RuntimeException("O conjunto está vazio!");
          }
        }

        public Contato atualizarNumeroContato(String nome, int novoNumero) {
          Contato contatoAtualizado = null;
          if (!contatoSet.isEmpty()) {
            for (Contato c : contatoSet) {
              if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
              }
            }
            return contatoAtualizado;
          } else {
            throw new RuntimeException("O conjunto está vazio!");
          }
        }
      
     public static void main(String[] args) {
          AgendaContatos agendaContatos = new AgendaContatos();

          agendaContatos.exibirContato();

          agendaContatos.adicionarContato("Graziely", 40028922);
          agendaContatos.adicionarContato("Graziely", 48454562);
          agendaContatos.adicionarContato("Gabi", 54484612);
          agendaContatos.adicionarContato("Mãe", 5487854);
          
          agendaContatos.exibirContato();
          System.out.println(agendaContatos.pesquisarPorNome("Gabi"));
          System.out.println("Contato atualizado: "+ agendaContatos.atualizarNumeroContato("Mãe", 40028922));
          agendaContatos.exibirContato();
     }


}
