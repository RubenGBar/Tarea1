package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		//Declaro la variable para recoger el número con decimales
		double numero;
		
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Pido que introduzca el numero con decimales
		System.out.println("Introduzca un número con decimales: ");
		
		//Hago que lea el numero del teclado
		numero = sc.nextDouble();
		
		//Le pido que sume 0.5 al número introducido y con el cast se redondea al entero más próximo
		System.out.println("El número redoneado es: " + (int)(numero+0.5));
		
		//Cierro el Scanner
		sc.close();
	}

}
