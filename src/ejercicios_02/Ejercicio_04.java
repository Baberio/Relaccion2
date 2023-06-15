package ejercicios_02;

import java.util.Scanner;

public class Ejercicio_04 {

	public static void main(String[] args) {
		// 4. Algoritmo que pida tres números de tipo entero y compruebe si es posible que exista un 
		//triángulo con esas dimensiones.
		
		
		Scanner teclado =new Scanner(System.in);
		
		
		int a;
		int b;
		int c;
		
		System.out.println("Introduce tu primer numero");
		a=teclado.nextInt();
		
		System.out.println("Introduce tu segundo numero");
		b=teclado.nextInt();
		
		System.out.println("Imtroduce tu tercer numero");
		c=teclado.nextInt();
		
		if (((a+b)>c)&&((a+c)>b)&&((b+c)>a)) 
		{System.out.println("Es posible crear el triangulo");}
		
		else {System.out.println("No es posible crear el triangulo");}
		
		teclado.close();
	}

}
