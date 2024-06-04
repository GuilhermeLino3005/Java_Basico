package edu.guilherme.modulos.collections.set.ordernacao.operacoesbasica;

import java.util.Set;
import java.util.HashSet;

public class ConjutosConvidados {
     
     private Set<Convidado> Convidadoset;
     
     public ConjutosConvidados(){
          this.Convidadoset = new  HashSet<>();
     }

     public void adicionarConvidado(String nome, int coddigoConvite){
          Convidadoset.add(new Convidado(nome, coddigoConvite));

     }

     public void removerConvidadoPorCodigoConvite(int coddigoConvite){
          Convidado convidadoParaRemover = null;

          for(Convidado c : Convidadoset){
               if (c.getcodigoConvite() == coddigoConvite) {
                    convidadoParaRemover = c;
                    break;
               }
          }

          Convidadoset.remove(convidadoParaRemover);
     }

     public int contarConvidado(){
          return Convidadoset.size();
     }

     public void exibirConvidado(){
          System.out.println(Convidadoset);
     }


     public static void main(String[] args) {
          ConjutosConvidados conjutosConvidados = new ConjutosConvidados();
          
          conjutosConvidados.adicionarConvidado("Guilherme", 1234);
          conjutosConvidados.adicionarConvidado("Graziely", 2345);
          conjutosConvidados.adicionarConvidado("Elida", 3456);
          conjutosConvidados.adicionarConvidado("Pedro", 1234);

          System.out.println("Existem " +conjutosConvidados.contarConvidado()+ " dentro do Set de Convidados");

          conjutosConvidados.removerConvidadoPorCodigoConvite(1234);

          System.out.println("Existem " +conjutosConvidados.contarConvidado()+ " dentro do Set de Convidados");

          conjutosConvidados.exibirConvidado();
     }
}

