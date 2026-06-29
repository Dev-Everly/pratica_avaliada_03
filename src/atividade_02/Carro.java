package atividade_02;

public class Carro {

	private String modelo;
	private int velocidade = 0;
	
	
	
	public Carro(String modelo, int velocidade) {
 		this.modelo = modelo;
		this.velocidade = velocidade;
	}
	
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	public void acelerar(int valor) {
		 
		velocidade  += valor;
		System.out.println("Acelerar " +  valor +" km/h");
	}
	
	public void visualizar() {
		System.out.println("""
				Modelo : 
				Velocidade Inicial : 
				""".formatted(modelo, velocidade));
	}
}
