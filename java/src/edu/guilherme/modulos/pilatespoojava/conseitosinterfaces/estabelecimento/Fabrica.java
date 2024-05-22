package edu.guilherme.modulos.pilatespoojava.conseitosinterfaces.estabelecimento;
import edu.guilherme.modulos.pilatespoojava.conseitosinterfaces.equipamentos.impressora.Impressora;
import edu.guilherme.modulos.pilatespoojava.conseitosinterfaces.equipamentos.impressora.Deskjet;
import edu.guilherme.modulos.pilatespoojava.conseitosinterfaces.equipamentos.impressora.Laserjet;
import edu.guilherme.modulos.pilatespoojava.conseitosinterfaces.equipamentos.multifuncional.EquipamentoMultifuncional;
import edu.guilherme.modulos.pilatespoojava.conseitosinterfaces.equipamentos.digitalizadora.Digitalizadora;
import edu.guilherme.modulos.pilatespoojava.conseitosinterfaces.equipamentos.digitalizadora.Scanner;
import edu.guilherme.modulos.pilatespoojava.conseitosinterfaces.equipamentos.copiadora.Copiadora;

public class Fabrica{
     public static void main(String[] args) {
          EquipamentoMultifuncional em = new EquipamentoMultifuncional();
          Deskjet deskjet = new Deskjet();
          Scanner scanner = new Scanner();


          Impressora impressora = deskjet;
          Digitalizadora digitalizadora = scanner;
          Copiadora copiadora = em;
          
          impressora.imprimir();
          digitalizadora.digitalizar();
          copiadora.copiar();



     }
}
