package edu.guilherme.modulos.metodos;

public class SistemaTv {


     public static void main(String [] args){
          ConfigurancaoTv configurancaoTv = new ConfigurancaoTv();

          configurancaoTv.diminuirVolume();
          configurancaoTv.diminuirVolume();
          configurancaoTv.diminuirVolume();

          System.out.println("Canal atual: " +configurancaoTv.canal);
          
          configurancaoTv.mudarCanal(13);

          System.out.println("TV ligada: "+ configurancaoTv.ligada);
          System.out.println("Canal atual: " +configurancaoTv.canal);
          System.out.println("Volume da TV: " +configurancaoTv.volume);

          configurancaoTv.ligar();
          System.out.println("Novo status -> TV ligada: "+ configurancaoTv.ligada);

          configurancaoTv.desligar();
          System.out.println("Novo status -> Tv ligada: " + configurancaoTv.ligada);

          
     }
}
