package atividade_02;

public class CarroEletrico extends Carro{

	private int nivelBateria;
	private static final int CONSUMO_POR_ACELERACAO = 2;

	public CarroEletrico(String modelo, int velocidade, int nivelBateria) {
		super(modelo, velocidade);
		this.nivelBateria = nivelBateria;
	}
	
	public int getNivelBateria() {
		return nivelBateria;
	}


	public void setNivelBateria(int nivelBateria) {
		this.nivelBateria = nivelBateria;
	}


	@Override 
	public void visualizar() {
		super.visualizar();
		System.out.println("Bateria restante " + nivelBateria + " %");
	}

	@Override
	public void acelerar(int valor) {
		 super.acelerar(valor);
		 
		int consulmoBateria = valor * CONSUMO_POR_ACELERACAO;
		nivelBateria -= consulmoBateria;
		 
	}
}
