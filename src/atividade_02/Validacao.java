package atividade_02;

public class Validacao {
	
	public static void validarAceleracao(int valor) {
		if(valor < 0)
			throw new IllegalArgumentException("Aceleração deve ser maior que 0 !");
			
	}
	
	public static void validarNivelBateria(int nivelBateria, int consulmoBateria) {
		if(nivelBateria < 0 || nivelBateria > 100)
			throw new IllegalArgumentException(" Nível de bateria deve ser entre 0 e 100 ! ");
		
	}
	
	public static void validarConsumo(int consulmoBateria, int nivelBateria) {
		if(consulmoBateria > nivelBateria)
			throw new IllegalArgumentException(" Nível de bateria Insulficiente !");

	}

}
