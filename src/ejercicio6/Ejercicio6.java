package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		
		//Declaro la constante de cuantos segundos es una hora
		final double HORA_A_SEGS = 3600;
		
		//Declaro la constante de cuantos minutos es una hora
		final double MINS_A_SEGS = 60;
		
		//Declaro las variables
		double seg, hor, min, calmin, segfinal;
		
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Le pido que introduzca la cantidad de segundos
		System.out.println("Introduzca la cantidad de segundos: ");
		
		//Leo del teclado el valor de los segundos
		seg = sc.nextDouble();
		
		//Calculo de las horas
		hor = seg/HORA_A_SEGS;
		
		//Hago la misma operación que antes, pero me quedo con el resto pues estos son los minutos
		min = seg%HORA_A_SEGS;
		
		//Calculo de los minutos
		calmin = min/MINS_A_SEGS;
		
		//Hago la misma operación que antes y me quedo con el resto que serán los segundos
		segfinal = min%MINS_A_SEGS;
		
		//Muestro el resultado de la conversión
		System.out.println("Los " + (int)seg + " segundos, son: " + (int)hor + " horas " + (int)calmin + 
				" minutos y " + (int)segfinal + " segundos");
		
		//Cierro el Scanner
		sc.close();
	}

}
