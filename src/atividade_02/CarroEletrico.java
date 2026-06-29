package atividade_02;

public class CarroEletrico extends Carro{

	private int nivelBateria;
	private static final int CONSUMO_POR_ACELERACAO = 2;

	public CarroEletrico(String modelo, int velocidade, int nivelBateria) {
		Validacao.validarNivelBateria(nivelBateria);
		
 		super(modelo, velocidade);
		this.nivelBateria = nivelBateria;
	}
	
	public int getNivelBateria() {
		return nivelBateria;
	}


	public void setNivelBateria(int nivelBateria) {
		Validacao.validarNivelBateria(nivelBateria);
		this.nivelBateria = nivelBateria;
	}


	@Override 
	public void visualizar() {
		super.visualizar();
		System.out.println("Bateria restante " + nivelBateria + " %");
	}

	@Override
	public void acelerar(int valor) {
	    Validacao.validarAceleracao(valor);

	    super.acelerar(valor);

	    int consumoBateria = valor * CONSUMO_POR_ACELERACAO;

	    Validacao.validarConsumo(consumoBateria, nivelBateria);

	    nivelBateria -= consumoBateria;
	}
}
