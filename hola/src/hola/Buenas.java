package hola;

import java.util.Scanner;

public class Buenas {

	public static void main(String[] args) {

		int filas = 10;
		int columnas = 10;
		int[][] matriz = new int[filas][columnas];
		Scanner teclado = new Scanner(System.in);
		int fila = 0;
		int columna = 0;
		inicializarmatriz(matriz, filas, columnas);
		
		imprimirmatriz(matriz, filas, columnas);
		
		comprarentrada(matriz, filas, columnas, teclado);
		
		imprimirmatriz(matriz, filas, columnas);

	}

	private static void comprarentrada(int[][] matriz, int a, int e, Scanner teclado) {
System.out.println("introdux¡zca fila:");
a = teclado.nextInt();
System.out.println("introdux¡zca columna:");
e = teclado.nextInt();
		
		if ((matriz[a][e] == 8) || (matriz[a][e] == 1)) {
			if (matriz[a][e] != 8) {
				System.out.println("es pasillo");
			} else
				System.out.println("LO siento la bsutaca esta acupada");

		} else {
			matriz[a][e] = 1;
			System.out.println("La has comprado");
		}
	}

	private static void imprimirmatriz(int[][] matriz, int filas, int columnas) {
		// TODO Auto-generated method stub
		for (int a = 0; a < filas; a++) {
			for (int e = 0; e < columnas; e++) {
				System.out.print(matriz[a][e] + "\t");
			}
			System.out.println();
		}
	}

	private static void inicializarmatriz(int[][] matriz, int columnas, int filas) {
		// TODO Auto-generated method stub
		for (int a = 0; a < filas; a++) {
			for (int e = 0; e < columnas; e++) {
				if (e == 4 || e == 5)
					matriz[a][e] = 8;

				else
					matriz[a][e] = 0;
			}
		}
	}
}
