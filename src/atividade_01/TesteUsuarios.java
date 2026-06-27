package atividade_01;

public class TesteUsuarios {

	public static void main(String[] args) {
		usuarioValido();
	}

	static void usuarioValido() {
		System.out.println("Teste - usuário válido");
		
		try {
			Usuario usuario = new Usuario("Everly", "gene@gmail.com");
			System.out.println("Usuário: "  + usuario.getNome() + " criado com sucesso!");
		}catch(IllegalArgumentException e ){
			System.out.println("Erro: " + e.getMessage());
		}
	}
	
	static void administradorValido() {
		System.out.println("Teste - usuário válido");
		
		try {
			Administrador adm = new Administrador("Everly", "gene@gmail.com", null);
			System.out.println("Administrador: "  + adm.getNome() + " criado com sucesso!");
		}catch(IllegalArgumentException e ){
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
