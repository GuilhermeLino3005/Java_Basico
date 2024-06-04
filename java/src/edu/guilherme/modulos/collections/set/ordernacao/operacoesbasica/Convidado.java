package edu.guilherme.modulos.collections.set.ordernacao.operacoesbasica;
import java.util.Objects;
public class Convidado{
     private String nome;

     private int codigoConvite;
     
     public Convidado(String nome, int codigoConvite){
          this.nome = nome;
          this.codigoConvite = codigoConvite;

     }

     public String getnome(){
          return nome;
     }

     public int getcodigoConvite(){
          return codigoConvite;

     }

     public boolean equals(Object o){
          if(this == o){
               return true;
          }
          if(!(o instanceof Convidado convidado)){
               return false;
          }

          return getcodigoConvite() == convidado.getcodigoConvite();
     }

     public int hashCode() {
          return Objects.hash(getcodigoConvite());
        }

     @Override
     public String toString() {

          return "Convidado {" +
               "nome " + nome + '\'' +
               "coddigoConvite " +codigoConvite+ " }";
     }
}
