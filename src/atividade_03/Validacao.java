package atividade_03;

public class Validacao {
	
	public static void validarMensagem(String mensagem) {

	    if (mensagem == null || mensagem.isBlank()) {
	        throw new IllegalArgumentException("Mensagem não pode ser nula ou vazia!");
	    }
	}
	
	public static void validarDestinatario(String destinatario) {

	    if (destinatario == null || destinatario.isBlank()) {
	        throw new IllegalArgumentException("Destinatário não pode ser nulo ou vazio!");
	    }

	    String regexEmail = "^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
	    String regexTelefone = "^[0-9]{10,11}$";

	    if (destinatario.matches(regexEmail) || destinatario.matches(regexTelefone)) {
	        return;
	    }

	    throw new IllegalArgumentException("Destinatário deve ser email ou telefone válido!");
	}
}
