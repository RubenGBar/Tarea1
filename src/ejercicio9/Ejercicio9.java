package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		
		//Declaro las variables
		double num1, num2;
		boolean comparar;
		
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Le pido que introduzca el primer número
		System.out.println("Introduzca un número: ");
		
		//Leo el valor del número del teclado
		num1 = sc.nextDouble();
		
		//Le pido que introduzca el segundo número
		System.out.println("Introduzca un número: ");
		
		//Leo el valor del número del teclado
		num2 = sc.nextDouble();
		
		//Uso un ternario para ver si los números son iguales
		comparar = num1 == num2;
		
		//Muestro el resultado por pantalla
		System.out.println("¿Son los números iguales? " + comparar);
		
		//Cierro el Scanner
		sc.close();
	}

}
