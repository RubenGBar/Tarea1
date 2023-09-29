package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		
		//Declaro las variables
		double a, b, c, x, y;
		
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Le digo lo que vamos a hacer
		System.out.println("Vamos a calcular el valor de unpolinomio de segundo grado como este: y=ax^2+bx+c");
		
		//Le pido el valor de a
		System.out.println("Introduce el valor de a: ");
		
		//Leo del teclado el valor de a
		a = sc.nextDouble();
		
		//Le pido el valor el de b
		System.out.println("Introduce el valor de b: ");
		
		//Leo del teclado el valor de b
		b = sc.nextDouble();
		
		//Le pido el valor de c
		System.out.println("Introduce el valor de c");
		
		//Leo del teclado el valor de c
		c = sc.nextDouble();
		
		//Le pido que introduzca el valor de x
		System.out.println("Introduce el valor de x");
		
		//Leo del teclado el valor de x
		x = sc.nextDouble();
		
		//Declaro el valor de y
		y = (a*Math.pow(x, 2))+b*x+c;
		
		//Le muestro el valor del polinomio de segundo grado
		System.out.println("El valor del polinomio de segundo grado es: " + y);
		
		//Cierro el Scanner
		sc.close();
	}

}
