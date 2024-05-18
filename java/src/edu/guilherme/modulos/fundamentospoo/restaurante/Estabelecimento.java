package edu.guilherme.modulos.fundamentospoo.restaurante;
import edu.guilherme.modulos.fundamentospoo.restaurante.atendimento.Atendente;
import edu.guilherme.modulos.fundamentospoo.restaurante.atendimento.cozinha.Almoxarife;
import edu.guilherme.modulos.fundamentospoo.restaurante.atendimento.cozinha.Cozinheiro;
import edu.guilherme.modulos.fundamentospoo.restaurante.area.Cliente;
public class Estabelecimento {
     public static void main(String [] args){
          Cozinheiro cozinheiro = new Cozinheiro();


          //Ações que estabelecimento precisa ter ciência
          cozinheiro.adicionarSucoNoBalcao();
          cozinheiro.adicionarLancheNoBalcao();
          cozinheiro.adicionarComboNoBalcao();




          Atendente atendente = new Atendente();
          atendente.servindoMesa();
          atendente.receberPagamento();
          


          Cliente cliente = new Cliente();

          cliente.escolherLanche();
          cliente.fazerPedido();
          cliente.pagarConta();





     }
     
}