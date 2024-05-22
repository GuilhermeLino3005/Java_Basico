package edu.guilherme.modulos.pilatespoojava.msnmessenger;
import java.util.Scanner;
import edu.guilherme.modulos.pilatespoojava.msnmessenger.aplicativo.FacebookMessenger;
import edu.guilherme.modulos.pilatespoojava.msnmessenger.aplicativo.MSNMessenger;
import edu.guilherme.modulos.pilatespoojava.msnmessenger.aplicativo.ServicoMensagemInstantanea;
import edu.guilherme.modulos.pilatespoojava.msnmessenger.aplicativo.Telegram;
public class ComputadorUsuario {
     public static void main(String[] args) {
          ServicoMensagemInstantanea smi = null;
          Scanner scanner = new Scanner(System.in);
          String appEscolhindo = scanner.nextLine();
          
         if (appEscolhindo.equals("Msn")) {
               smi = new MSNMessenger();
         }
         else if(appEscolhindo.equals("Facebook")){
               smi = new FacebookMessenger();
         }
         else if(appEscolhindo.equals("Telegram")){
               smi = new Telegram();
         }
         

         smi.enviarMensagem();
         smi.receberMensagem();
     



     }
     
}
