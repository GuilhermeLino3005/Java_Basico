package edu.guilherme.modulos.pilatespoojava.msnmessenger.aplicativo;

public abstract class ServicoMensagemInstantanea {
     public abstract void enviarMensagem();
     public abstract void receberMensagem();
     protected abstract void salvarHistoricoMensagem();

     protected void validarConectador(){
          System.out.println("Validando se está conectado a internet");
     }
}
