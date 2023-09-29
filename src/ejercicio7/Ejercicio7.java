package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		
		//Declaro las variables
		double centimetros, milimetros, metros, convmili, convmetros, centimetrosfinales;
		
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Le pido que introduzca los segundos
		System.out.println("Introduce una cantidad de centímetros: ");
		
		//Leo el valor de los cenímetros del teclado
		centimetros = sc.nextDouble();
		
		//Le pido que introduzca los milimetros
		System.out.println("Introduzca una cantidad de milimetros: ");
		
		//Leo el valor de los milimetros del teclado
		milimetros = sc.nextDouble();
		
		//Le pido que introduzca los metros
		System.out.println("Introduce una cantidad de metros: ");
		
		//Leo la cantidad de metros del teclado
		metros = sc.nextDouble();
		
		//Paso los milimetros a centimetros
		convmili = milimetros/10;
		
		//Paso los metros a centimetros
		convmetros = metros*100;
		
		//Suma de todas las cantidades
		centimetrosfinales = centimetros+convmili+convmetros;
		
		//Muestro el resultado por pantalla
		System.out.println("La sema total de als 3 cantidades es igual a " 
		+ centimetrosfinales + " centímetros");
		
		//Cierro el Scanner
		sc.close();
	}

}
