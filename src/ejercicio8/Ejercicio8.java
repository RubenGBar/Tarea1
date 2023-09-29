package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		
		//Declaro la constante del valor de las entradas de adulto
		final double ENTRADA_ADULTO = 20;
		
		//Declaro la constante del valor de las entradas de niños
		final double ENTRADA_INFANTIL = 15.50;
		
		//Declaro las variables
		double entradasAdultos, entradasInfantil, valorAdultos, valorInfantil, valorTotal, descuento, 
		descuento2;
		
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Le pido las entradas de adulto
		System.out.println("Entradas de adultos compradas: ");
		
		//Leo el valor de las entradas de adulto por teclado
		entradasAdultos = sc.nextDouble();
		
		//Le pido las entradas infantiles
		System.out.println("Entradas infantiles compradas: ");
				
		//Leo el valor de las entradas infantiles por teclado
		entradasInfantil = sc.nextDouble();
				
		//Calculo el valor de las entradas de adulto
		valorAdultos = entradasAdultos*ENTRADA_ADULTO;
		
		//Calculo el valor de las entradas infnatiles
		valorInfantil = entradasInfantil*ENTRADA_INFANTIL;
		
		//Calculo el valor total
		valorTotal = valorInfantil+valorAdultos;
		
		//Uso un ternario para saber si tengo que aplicar el descuento
		descuento = valorTotal > 100 ? (valorTotal*5)/100 : 0;
		
		//Uso un segundo ternario para restarle el descuento al valor final
		descuento2 = valorTotal > 100 ? valorTotal-descuento : valorTotal;
		
		//Muestro el resultado final por pantalla
		System.out.println("El valor total de las entradas es: " + descuento2 + "€");
		
		//Cierro el Scanner
		sc.close();
	}

}
