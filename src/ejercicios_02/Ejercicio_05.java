package ejercicios_02;

import java.util.Scanner;

public class Ejercicio_05 {

	public static void main(String[] args) {
		// 5. Dadas dos casillas de un tablero de ajedrez por la fila y columna que ocupan, comprobar 
		//si están en la misma fila, columna, o en la misma diagonal. 
		
		
		Scanner teclado =new Scanner(System.in);
		
		
		int columna1;
		int fila1;
		int columna2;
		int fila2;
		
		System.out.println("Introduce la columna en la que se encuentra la pieza 1");
		columna1=teclado.nextInt();
		
		System.out.println("Introduce la fila en la que se encuentra la pieza 1");
		fila1=teclado.nextInt();
		
		System.out.println("Introduce la columna en la que se encuentra la pieza 2");
		columna2=teclado.nextInt();
		
		System.out.println("Introduce la fila en la que se encuentra la pieza 2");
		fila2=teclado.nextInt();
		
		if ((columna1==columna2)&&(fila1==fila2))
		{System.out.println("Es la misma pieza");}
		
		else if ((fila1==fila2)&&(columna1!=columna2))
		{System.out.println("Estan en la misma fila");}
		
		else if ((columna1-columna2)==-(fila1-fila2))
		{System.out.println("Estan en la misma diagonal");}
		
		else if ((columna2-columna1)==(fila2-fila1))
		{System.out.println("Estan en la misma diagonal");}
		
		else if ((columna1==columna2)&&(fila1!=fila2))
		{System.out.println("Estan en la misma columna");}
		
		
		
		teclado.close();
		}
	}
	
		

	


