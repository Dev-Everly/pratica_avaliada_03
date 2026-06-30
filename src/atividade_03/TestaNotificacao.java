package atividade_03;

public class TestaNotificacao {
	public static Notificacao criarNotificacao(String tipo, String destinatario, String mensagem) {

        switch (tipo.toUpperCase()) {

            case "EMAIL":
                return new NotificacaoEmail(destinatario);

            case "SMS":
                return new NotificacaoSMS(destinatario);

            default:
                throw new IllegalArgumentException("Tipo inválido: " + tipo);
        }
    }

	public static void main(String[] args) {

	    // Email válido
	    try {
	        Notificacao email = criarNotificacao("EMAIL", "ana@email.com", "Bem-vindo ao sistema");
	        email.enviarMensagem("Bem-vindo ao sistema");
	    } catch (IllegalArgumentException e) {
	        System.out.println("Erro: " + e.getMessage());
	    }

	    // SMS válido
	    try {
	        Notificacao sms = criarNotificacao("SMS", "11988887777", "Seu código é 1234");
	        sms.enviarMensagem("Seu código é 1234");
	    } catch (IllegalArgumentException e) {
	        System.out.println("Erro: " + e.getMessage());
	    }

	    // Mensagem vazia
	    try {
	        Notificacao email2 = criarNotificacao("EMAIL", "ana@email.com", "");
	        email2.enviarMensagem("");
	    } catch (IllegalArgumentException e) {
	        System.out.println("Erro: " + e.getMessage());
	    }

	    // Destinatário vazio
	    try {
	        Notificacao sms2 = criarNotificacao("SMS", "", "Teste");
	        sms2.enviarMensagem("Teste");
	    } catch (IllegalArgumentException e) {
	        System.out.println("Erro: " + e.getMessage());
	    }

	    // Tipo inexistente
	    try {
	        Notificacao n = criarNotificacao("WHATSAPP", "teste", "mensagem");
	        n.enviarMensagem("mensagem");
	    } catch (IllegalArgumentException e) {
	        System.out.println("Erro: " + e.getMessage());
	    }
	
}
}