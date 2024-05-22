package edu.guilherme.modulos.pilatespoojava.conseitosinterfaces.equipamentos.multifuncional;

import edu.guilherme.modulos.pilatespoojava.conseitosinterfaces.equipamentos.copiadora.Copiadora;
import edu.guilherme.modulos.pilatespoojava.conseitosinterfaces.equipamentos.digitalizadora.Digitalizadora;
import edu.guilherme.modulos.pilatespoojava.conseitosinterfaces.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora{
          public void copiar(){
               System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
          
          }

          public void digitalizar(){
               System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
          }

          public void imprimir(){
               System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL");
          }
}
