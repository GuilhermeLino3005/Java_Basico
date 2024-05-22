package edu.guilherme.modulos.pilatespoojava.msnmessenger.aplicativo;

public class MSNMessenger extends ServicoMensagemInstantanea{
    public void enviarMensagem(){
            validarConectador();
            System.out.println("Mensagem enviada pelo MSN");
            salvarHistoricoMensagem();
    }

    public void receberMensagem(){
          System.out.println("Mensagem recebendo pelo MSN");
          salvarHistoricoMensagem();
    }
    public void salvarHistoricoMensagem(){
          System.out.println("Historico do MSN salvo");
     }
}
