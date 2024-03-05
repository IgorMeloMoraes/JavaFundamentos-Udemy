package fundamentos;

public class DesafioVariavelConstantes {
	
	public static void main(String[] args) {
		
		final double AJUSTE = 32;
		final double FATOR = 5.0 / 9.0;
	
		double fahrenhait = 86;
		
		
		// Calcular temperatura
		double celsius = (fahrenhait - AJUSTE) * FATOR;
		System.out.println(celsius);
		
		
		
	}

}
