package edu.guilherme.modulos.pilatespoojava.pilarespoo;

public class Autodromo {
     public static void main(String[] args) {
          Carro jeep = new Carro();
          jeep.setChassi("896454");
          //jeep.ligar();

          Moto z400 = new Moto();
          z400.setChassi("145254");
          //z400.ligar();

          Veiculo coringa = z400;
          coringa.ligar(); 

     }
}
