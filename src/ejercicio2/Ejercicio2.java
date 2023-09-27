package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		//Variable que recoje el número a intdoucir
		int numero;
		
		//Variable donde recojo el valor para que sea multiplo de 7
		int multiplo7;
		
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Le pido que introduzca un número
		System.out.println("Introduce un número: ");
		
		//Hago que lea el numero del teclado
		numero = sc.nextInt();
		
		/* Creo un ternario con el que compruebo que si el numero introducido es un multiplo de 7
		 * me devuelva 0 y sino me devuelve la cantidad a sumar para que lo sea */
		multiplo7 = (numero%7 == 0) ? 0 : 7-numero%7;
		
		//Le digo que numero necesita sumarle para que sea multiplo de 7
		System.out.println("Para que el número sea múltiplo de 7 tienes que sumarle " + multiplo7);
		
		//Cierro el Scanner
		sc.close();
	}

}
