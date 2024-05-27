package edu.guilherme.modulos.collections.pesquisalist;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivro {
     //Atribuito

     private List<Livro> livroList;

     public CatalogoLivro(){
          
          this. livroList = new ArrayList<>();

     }

     public void adicionarLivro(String titulo, String autor, int anoPublicacao){
          livroList.add(new Livro(titulo, autor, anoPublicacao));
     }

     public List<Livro> pesquisarPorAutor(String autor){
         List<Livro> livroPorAutor = new ArrayList<>();
          if (!livroList.isEmpty()) {
               for(Livro l: livroList){
                    if(l.getAutor().equalsIgnoreCase(autor)){
                         livroPorAutor.add(l);
                    }
               }     
          
         }
         return livroPorAutor; 
     }

     public List<Livro> pesquisaPorIntervaloAno(int anoInicial, int anoFinal){
          List<Livro> PorIntervaloAno = new ArrayList<>();
          if(!livroList.isEmpty()){
               for(Livro l : livroList){
                    if(l.getAnoPublicacao()>= anoInicial &&  l.getAnoPublicacao() <= anoFinal){
                         PorIntervaloAno.add(l);
                    }
               }
          }
          return PorIntervaloAno;
     }

     public Livro pesquisaPorTitulo(String titulo){
         Livro livroPorTitulo = null;
          if(!livroList.isEmpty()){
               for(Livro l : livroList){
                    if(l.getTitulo().equalsIgnoreCase(titulo)){
                         livroPorTitulo = l;
                         break;
                    }
               }
          }
          return livroPorTitulo;

     }

     public static void main(String[] args) {
          CatalogoLivro catalogoLivro = new CatalogoLivro();

          catalogoLivro.adicionarLivro("Harry Potter", "J.K.Rouling", 1997);
          catalogoLivro.adicionarLivro("Harry Potter", "J.K.Rouling", 1998);
          catalogoLivro.adicionarLivro("A gaorata do lago", "Charlie Donlea", 2017);
          catalogoLivro.adicionarLivro("Arsene Lupin", "Maurice Leblanc", 2020);
          catalogoLivro.adicionarLivro("Arsene Lupin contra Shelock Holmes", "Maurice Leblanc", 2021);

          System.out.println(catalogoLivro.pesquisarPorAutor("Charlie Donlea"));
          System.out.println(catalogoLivro.pesquisaPorIntervaloAno(2017, 2021));
          System.out.println(catalogoLivro.pesquisaPorTitulo("Harry Potter"));



     }
     
}
