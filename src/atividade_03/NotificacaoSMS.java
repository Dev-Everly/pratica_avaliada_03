package atividade_03;

public class NotificacaoSMS extends Notificacao {

	public NotificacaoSMS(String destinatario) {
		super(destinatario);
 	}
	
	@Override
	 public void enviarMensagem(String mensagem) {
		
		 System.out.println("Enviando SMS para " + getDestinatario() +
		            " \n Mensagem: " + mensagem);
	    
   }

}
