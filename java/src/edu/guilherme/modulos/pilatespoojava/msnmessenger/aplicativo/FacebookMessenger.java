package edu.guilherme.modulos.pilatespoojava.msnmessenger.aplicativo;

public class FacebookMessenger extends ServicoMensagemInstantanea {
     public void enviarMensagem(){
          validarConectador();
          System.out.println("Mensagem enviada pelo Facebook");
          salvarHistoricoMensagem();
     }

     public void receberMensagem(){
          System.out.println("Mensagem recebendo pelo Facebook");
          salvarHistoricoMensagem();

     }
     public void salvarHistoricoMensagem(){
          System.out.println("Historico do Facebook salvo");
     }
     
}
