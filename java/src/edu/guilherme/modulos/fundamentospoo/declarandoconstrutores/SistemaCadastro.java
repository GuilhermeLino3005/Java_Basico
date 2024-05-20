package edu.guilherme.modulos.fundamentospoo.declarandoconstrutores;

public class SistemaCadastro {
     public static void main(String[] args) {
          Pessoa marcos = new Pessoa("123", "GUILHERME");

          marcos.setEndereco("RUA DOS ALFINETES");

          System.out.println(marcos.getNome() + " - "+marcos.getCpf()+" - "+marcos.getEndereco());
     }
}
