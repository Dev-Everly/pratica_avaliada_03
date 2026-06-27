package atividade_01;

public class Validacao {

	public static void validarNome(String nome) {
		if(nome == null || nome.trim().isEmpty()) 
		throw new IllegalArgumentException("Nome não pode ser vazio!");
	}
	
	public static void validarEmail(String email) {
		if(email == null || email.isBlank())
			throw new IllegalArgumentException("Email não pode ser vazio!");
		if(!email.matches("^[a-zA-Z0-9._%+\\-]+@[a-zA-Z0-9\\-]+(?:\\.[a-zA-Z0-9\\-]+)*\\.[a-zA-Z]{2,}$"))
		throw new IllegalArgumentException("Digite um e-mail válido!");
	}
	
	public static void administradorValido() {
		
	}
}
