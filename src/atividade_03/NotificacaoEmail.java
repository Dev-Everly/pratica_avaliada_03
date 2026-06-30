package atividade_03;

public class NotificacaoEmail extends Notificacao {

	public NotificacaoEmail(String destinatario) {
		super(destinatario);
 	}

	@Override
	 public void enviarMensagem(String mensagem) {
		super.enviarMensagem(mensagem);
		  

		    System.out.println("Enviando Email para " + getDestinatario() +
		            " \n Mensagem: " + mensagem);
	    
    }
}
