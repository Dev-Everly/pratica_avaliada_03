package atividade_01;

public class Administrador extends Usuario{
	
	private String nivelAcesso;

	public Administrador(String nome, String email, String nivelAcesso) {
		super(nome, email);
		this.nivelAcesso = nivelAcesso;
		Validacao.administradorValido(nivelAcesso); 
	}

	public String getNivelAcesso() {
		return nivelAcesso;
	}

	public void setNivelAcesso(String nivelAcesso) {
		Validacao.administradorValido(nivelAcesso);
		this.nivelAcesso = nivelAcesso;
	}
	
	
	 @Override
	 public void visualizar() {
		 super.visualizar();
	 }
}
