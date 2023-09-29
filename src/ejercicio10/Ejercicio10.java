package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		
		//Declaro las variables
		double lanazmientoMetros, lanzamientoCms;
		
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Le pido que introduzca su marca
		System.out.println("Introduzca su marca en metros: ");
		
		//Leo el valor del lanzamiento del teclado
		lanazmientoMetros = sc.nextDouble();
		
		//Convierto los metros en centimetros
		lanzamientoCms = lanazmientoMetros*100;
		
		//Muestro el resultado por pantalla
		System.out.println("Su marca es de " + (int)lanzamientoCms + " centímetros");
		
		//Cierro el Scanner
		sc.close();
	}

}
