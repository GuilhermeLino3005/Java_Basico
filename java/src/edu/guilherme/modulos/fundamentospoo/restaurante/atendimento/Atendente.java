package edu.guilherme.modulos.fundamentospoo.restaurante.atendimento;

public class Atendente {
     public void servindoMesa(){
          pegarLancheCozinha();
          System.out.println("SERVINDO MENSA");
     }
          
     private void pegarLancheCozinha(){
          System.out.println("PEGANDO O LACHE NA COZINHA");
     }
     
     public void receberPagamento(){
          System.out.println("RECEBENDO PAGAMENTO");
     }

     private void pegarPedidoBalcao(){
          System.out.println("PEGANDO O PEDIDO NO BALCAO");
     }
     
     
}
