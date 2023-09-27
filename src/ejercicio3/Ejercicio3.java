package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
			//Variable que recoje el primer número a intdoucir
			int num1;
			
			//Variable donde recojo el segundo número a introducir
			int num2;
			
			//Variable para el Ternario
			int multiplo;
			
			//Creo el Scanner
			Scanner sc = new Scanner(System.in);
			
			//Le pido que introduzca un número
			System.out.println("Introduce un número: ");
			
			//Hago que lea el numero del teclado
			num1 = sc.nextInt();
			
			//Le pido que introduzca el segundo número
			System.out.println("Introduce un número: ");
			
			//Leo el segundo número del teclado
			num2 = sc.nextInt();
			
			/* Creo un ternario con el que calculo que cantidad hay que sumarle a num1 para que sea
			 * multiplo de num2 */
			multiplo = (num1%num2 == 0) ? 0 : num2-num1%num2;
			
			//Le digo que número necesita sumarle para que el numero 1 sea multiplo del numero 2
			System.out.println("Para que" + num1 + "sea múltiplo de" + num2 + "tienes que sumarle " + multiplo);
			
			//Cierro el Scanner
			sc.close();
	}

}
