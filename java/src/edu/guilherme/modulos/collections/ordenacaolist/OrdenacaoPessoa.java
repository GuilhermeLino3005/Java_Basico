package edu.guilherme.modulos.collections.ordenacaolist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
     private List<Pessoa> pessoaList;

     public OrdenacaoPessoa(){
          this.pessoaList = new ArrayList<>();
     }

     public void adicionarPessoa(String nome, int idade, double altura){
          pessoaList.add(new Pessoa(nome, idade, altura));     
     }

     public List<Pessoa> ordenacaoPorIdade(){
          List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
          Collections.sort(pessoasPorIdade);
          return pessoasPorIdade;
     }

     public List<Pessoa> ordenarPorAltura(){
               List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
               Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
               return pessoasPorAltura;
     }

     public static void main(String[] args) {
          OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

          ordenacaoPessoa.adicionarPessoa("Gaby", 16, 1.60);
          ordenacaoPessoa.adicionarPessoa("José Pedro", 8, 1.30);
          ordenacaoPessoa.adicionarPessoa("Guilherme", 19, 1.72);
          ordenacaoPessoa.adicionarPessoa("Graziely", 18, 1.70);
          ordenacaoPessoa.adicionarPessoa("Elida", 37, 1.54);
          System.out.println(ordenacaoPessoa.pessoaList);
          
          
          System.out.println(ordenacaoPessoa.ordenacaoPorIdade());
          System.out.println(ordenacaoPessoa.ordenarPorAltura());
          

     }


}
