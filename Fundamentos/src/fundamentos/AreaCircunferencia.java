package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
		
		/*
		 * Variaveis - Definimos uma variavel informando o tipo de dado + o nome da variavel + atribuimos um valor para ela
		 * 
		 * 
		 * Constantes - Constantes vem de valor que nao mudam 
		 * . Para defini uma variavel informamos o valor FINAL na frente, informando que esse valor nao pode ser alterado
		 * . Por convenção, contantes sao ssempre em letras maiusculas
		 *  */
		
		// Variavel
		// double - tipo de dado 
		// radio - nome da variavel 
		// = Atribuição da variavel 
		// 3 - valor da variavel
		double raio = 3;
		
		// Contante 
		// Final - Definimos final para declarar que esse é um valor final que nao pode ser alterado em outro lugar 
		// double - tipo de dado 
		// Nome da variavel + atribuição + valor atribuido
		final double PI = 3.14159;
		
		double area = PI * raio * raio;
		
		// Aqui podemos concatenar uma string com uma variavel
		System.out.println("Area total = " + area);
		
		// As variaveis podem ser alteradas a qualquer momento no codigo, por exemplo, podemos chamar a variavel area, que mudou por algum motivo, e definir novamente o tamanaho da area de acordo com o novo valor recebidi 
		raio = 5.5;
		area = PI * raio * raio;
		System.out.println("Area total = " + area);
		
	}

}
