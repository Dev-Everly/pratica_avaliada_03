package atividade_02;

public class TestaCarros {

	public static void main(String[] args) {
		criarCarroEletrico();
		aceleracaoInvalida();
		bateriaInsuficiente();
		nivelDeBateriaNegativo();

	}
 
	static void criarCarroEletrico() {
	 System.out.println("Teste - criar carro elétrico");
	
	 try {
		 
		        CarroEletrico carro1 =
		            new CarroEletrico("Tesla Model 3", 0, 50);
		        carro1.acelerar(20);

		       
		        		        
		 System.out.println("""
		            Modelo: %s
		            Velocidade Inicial: %d
		            Velocidade Atual: %d
		            Bateria Restante: %d%%
		            """.formatted(
		                carro1.getModelo(),
		                0,
		                carro1.getVelocidade(),
		                carro1.getNivelBateria()
		        ));
	 }catch(IllegalArgumentException e) {
	 System.out.println("Erro : " + e.getMessage());
	 }
 }
	
	static void aceleracaoInvalida() {
		 System.out.println("\nTeste - valor de aceleração inválido");
		
		 try {
			 
			        CarroEletrico carro1 =
			            new CarroEletrico("Tesla Model 3", 0, 50);
			        carro1.acelerar(-10);

			       
		 }catch(IllegalArgumentException e) {
		 System.out.println("Erro : " + e.getMessage());
		 }
	 }
	
	static void bateriaInsuficiente() {
		 System.out.println("\nTeste - Bateria Insuficiente");
		
		 try {
			 
			        CarroEletrico carro1 =
			            new CarroEletrico("Tesla Model 3", 0, 0);
			        carro1.acelerar(10);

			       
			        		        	 }catch(IllegalArgumentException e) {
		 System.out.println("Erro : " + e.getMessage());
		 }
	 }
	
	static void nivelDeBateriaNegativo() {
		 System.out.println("\nTeste - Bateria negativa");
		
		 try {
			 
			        CarroEletrico carro1 =
			            new CarroEletrico("Tesla Model 3", 0,-5);
			        	carro1.acelerar(10);

			       
			        		        	 }catch(IllegalArgumentException e) {
		 System.out.println("Erro : " + e.getMessage());
		 }
	 }
}
