package atividade_03;

public class Notificacao {
	
	private String destinatario;
	
	

	public Notificacao(String destinatario) {
		 Validacao.validarDestinatario(destinatario);
		this.destinatario = destinatario;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		Validacao.validarDestinatario(destinatario);
		this.destinatario = destinatario;
	}
	
	 public void enviarMensagem(String mensagem) {
		   
	    }
	
}
