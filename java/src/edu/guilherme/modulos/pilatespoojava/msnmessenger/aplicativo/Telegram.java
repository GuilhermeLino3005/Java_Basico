package edu.guilherme.modulos.pilatespoojava.msnmessenger.aplicativo;

public class Telegram extends ServicoMensagemInstantanea{
    public void enviarMensagem(){
            validarConectador();
            System.out.println("Mensagem enviada pelo Telegram");
            salvarHistoricoMensagem();

    }

    public void receberMensagem(){
          System.out.println("Mensagem recebendo pelo Telegram");
          salvarHistoricoMensagem();
     }
    public void salvarHistoricoMensagem(){
          System.out.println("Historico do Telegram salvo");
}
}
