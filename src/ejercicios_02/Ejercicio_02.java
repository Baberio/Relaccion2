package ejercicios_02;

import java.util.Scanner;

public class Ejercicio_02 {

	public static void main(String[] args) {
		// 2. Algoritmo que pida 3 números e indique cual es el menor de los tres.
		
		Scanner teclado =new Scanner(System.in);
		
		
		int numero1;
		int numero2;
		int numero3;
		
		System.out.println("Introduce tu primer numero");
		numero1=teclado.nextInt();
		
		System.out.println("Introduce tu segundo numero");
		numero2=teclado.nextInt();
		
		System.out.println("Introduce tu tercer numero");
		numero3=teclado.nextInt();
		
		if (numero1<numero2 && numero1<numero3)      // el simbolo && significa "y"(esta en la tecla 6) noceque nocecuanto
		{System.out.println("El "+numero1+" es el menor");}
		
		else if (numero2<numero1 && numero2<numero3)
		{System.out.println("El "+numero2+" es el menor");}
		
		else if (numero3<numero1 && numero3<numero2)
		{System.out.println("El "+numero3+" es el menor");}
		
		else {System.out.println("Todos son iguales");}
		
		
		teclado.close();
		

	}

}
