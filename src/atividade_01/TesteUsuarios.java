package atividade_01;

public class TesteUsuarios {

	public static void main(String[] args) {
		usuarioValido();
		administradorValido();
		nomeInvalido();
		emailInvalido();
	}

	static void usuarioValido() {
		System.out.println("Teste - Usuário válido");
		
		try {
			Usuario usuario = new Usuario("Everly", "gene@gmail.com");
			System.out.println("Usuário: "  + usuario.getNome() + " criado com sucesso!");
		}catch(IllegalArgumentException e ){
			System.out.println("Erro: " + e.getMessage());
		}
	}
	
	static void administradorValido() {
		System.out.println("\nTeste - Administrador válido");
		
		try {
			Administrador adm = new Administrador("Everly", "gene@gmail.com", "ADM123@");
			System.out.println("Administrador: "  + adm.getNome() + " criado com sucesso!");
		}catch(IllegalArgumentException e ){
			System.out.println("Erro: " + e.getMessage());
		}
	}
	
	static void nomeInvalido() {
		System.out.println("\nTeste - Usuário nome inválido");
		
		try {
			Usuario usuario = new Usuario("", "gene@gmail.com");
			System.out.println("Usuário: "  + usuario.getNome() + " criado com sucesso!");
		}catch(IllegalArgumentException e ){
			System.out.println("Erro: " + e.getMessage());
		}
	}
	
	static void emailInvalido() {
		System.out.println("\nTeste - Usuário email inválido");
		
		try {
			Usuario usuario = new Usuario("Manu", "gene@gmail");
			System.out.println("Usuário: "  + usuario.getEmail() + " criado com sucesso!");
		}catch(IllegalArgumentException e ){
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
