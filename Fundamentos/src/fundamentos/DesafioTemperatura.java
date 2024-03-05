package fundamentos;

public class DesafioTemperatura {
	
	public static void main(String[] args) {
		
		// Calculo de Celsius para Kelvin
			// TK = TC + 273,15
		double tempCelsius = 15;
		double tempKelvin = tempCelsius + 273.15;
		System.out.println(tempCelsius + " ºC " + "é igual a " + tempKelvin + " K");
		
		// Calculo de Celsius para Fahrenhait
			// TF = (TC * 9/5) + 32
		tempCelsius = 25;
		double tempFahrenhait = (tempCelsius * 9.0 / 5.0) + 32;
		System.out.println(tempCelsius + " ºC " + "é igual a " + tempFahrenhait + " ºF");
		
		// Calculo de Kelvin para Celsius 
			// TC = TK - 273,15
		tempKelvin = 500;
		tempCelsius = tempKelvin - 273.15;
		System.out.println(tempKelvin + " K " + "é igual a " + tempCelsius + " ºC");
		
		// Calculo de Kelvin para Fahrenhait 
			// TF = (TK - 273,15) * 9/5 + 32
		tempKelvin = 400;
		tempFahrenhait = (tempKelvin - 273.15) * 9.0 / 5.0 + 32;
		System.out.println(tempKelvin + " K " + "é igual a " + tempFahrenhait + " ºF");
		
		// Calculo Fahrenhait para Celsius 
			// TC = (TF - 32) * 5,0 / 9,0
		tempFahrenhait = 0;
		tempCelsius = (tempFahrenhait - 32) * 5.0 / 9.0;
		System.out.println(tempFahrenhait + " ºF " + "é igual a " + tempCelsius + " ºC");
		
		// Calculo Fahrenhait para Kelvin 
			// TK = (TF - 32) * 5,0/9,0 + 273,15
		tempFahrenhait = 15;
		tempKelvin = (tempFahrenhait - 32) * 5.0 / 9.0 + 273.15;
		System.out.println(tempFahrenhait + " ºF " + "é igual a " + tempKelvin + " K");
		
		
	}

}
