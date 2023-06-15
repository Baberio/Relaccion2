package ejercicios_02;

import java.util.Scanner;

public class Ejercicio_01 {

	public static void main(String[] args) {
		//1. Algoritmo que pida dos enteros y que indique el mayor y el menor, o si ambos son 
		//iguales. 
		
		Scanner teclado =new Scanner(System.in);
		
		int numero1;
		int numero2;
		
		System.out.println("Intruce un numero");
		numero1=teclado.nextInt();
		
		System.out.println("Introduce el segundo numero");
		numero2=teclado.nextInt();
		
		if(numero1<numero2) {System.out.println(numero1+" Es el menor y "+numero2+" Es el mayor");}
		else if (numero1>numero2) {System.out.println(numero1+" Es el mayor y "+numero2+" Es el menor ");}
		else {System.out.println("Son iguales");}
		
		
		teclado.close();

	}

}
