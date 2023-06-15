package ejercicios_02;

import java.util.Scanner;

public class Ejercicio_03 {

	public static void main(String[] args) {
		// 3. Algoritmo que pida tres números distintos de tipo float e indique cual es el que ocupa la 
		//posición central si los tres se ordenasen. 
		
		Scanner teclado =new Scanner(System.in);
		
		float numero1;
		float numero2;
		float numero3;
		
		System.out.println("Introduce tu primer numero");
		numero1=teclado.nextFloat();
		
		System.out.println("Introduce tu segundo numero");
		numero2=teclado.nextFloat();
		
		System.out.println("Introduce tu tercer numero");
		numero3=teclado.nextFloat();
		
		if ((numero1>numero2 && numero1<numero3) ||(numero1<numero2 && numero1>numero3)) // para poner noceque "||" "o" (esta en la tecla 1 con altgr)
		{System.out.println("El del medio de los chichos es "+numero1);}
		
		else if ((numero2>numero1 && numero2<numero3) || (numero2<numero1 && numero2>numero3))
		{System.out.println("El del medio de los chichos es "+numero2);}
		
		else {System.out.println("El del medio de los chichos es "+numero3);}
		
		teclado.close();
		}

	}


