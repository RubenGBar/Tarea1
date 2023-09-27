package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		//Variable para la base
		double base;
		
		//Variable para la altura
		double altura;
		
		//Variable para calcular el area
		double area;
		
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Le pido que introduzca la base del triángulo
		System.out.println("Introduce la base del triángulo: ");
		
		//Leo del teclado
		base = sc.nextDouble();
		
		//Le pido que introduzca la altura del triángulo
		System.out.println("Introduce la altura del triángulo: ");
		
		//Leo del teclado
		altura = sc.nextDouble();
		
		//Calculo el área del trinángulo
		area = (base*altura)/2;
		
		//Muestro el resultado del área
		System.out.println("El área del triángulo es " + area);
		
		//Cierro el Scanner
		sc.close();
	}

}
