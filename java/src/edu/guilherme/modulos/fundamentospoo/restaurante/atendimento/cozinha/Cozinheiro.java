package edu.guilherme.modulos.fundamentospoo.restaurante.atendimento.cozinha;

import edu.guilherme.modulos.fundamentospoo.restaurante.atendimento.Atendente;

public class Cozinheiro {
     public void adicionarLancheNoBalcao(){
          System.out.println("ADICIONANDO LANCHE NATURAL HAMBURGER NO BALCAO");
     }
     
     public void adicionarSucoNoBalcao(){
          System.out.println("ADICIONAR SUCO NO BALCAO");
     }

     public void adicionarComboNoBalcao(){
          adicionarLancheNoBalcao();
          adicionarSucoNoBalcao();
     }

     private void prepararLanche(){
          System.out.println("PPREPARANDO LANCHE TIPO HAMBURGUER");
     }

     private void prepararVitamina(){
          System.out.println("PREPARANDO SUCO");
     }

     public void prepararCombo(){
          prepararLanche();
          prepararVitamina();
     }

     public void selecionarIngredientesLanche(){
          System.out.println("SELECIONAR O PÃO, SALADA, OVO E CARNE");
     }

     private void selecionarIngredientesVitamina(){
          System.out.println("SELECIONAR FRUTA, LEITE E SUCO");
     }

     private void lavarIngredientes(){
          System.out.println("LAVANDO INGREDIENTES");
     }

     private void baterVitaminaLiquidificador(){
          System.out.println("BATENDO VITAMINA LIQUIDIFICADOR");
     }

     public void fritarIngredientesLanches(){
          System.out.println("FRITANDO A CARNE E OVO PARA O HAMBURGER");
     }
     public void pedirParaTrocarGas(Almoxarife alxoxarife){
          alxoxarife.trocarGas();
     }
     
     public void pedirIngredientes(Almoxarife alxoxarife){
          alxoxarife.entregarIngredientes();
     }
}
