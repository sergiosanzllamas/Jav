package hola;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Buenas {

	public static void main(String[] args) {
int opcion;
		int filas = 10;
		int columnas = 10;
		int[][] matriz = new int[filas][columnas];
		Scanner teclado = new Scanner(System.in);
		int fila = 0;
		int columna = 0;
		inicializarmatriz(matriz, filas, columnas);

		

	
	
	do {
		System.out.println("1.sala");
		System.out.println("2.compra entrada");
		System.out.println("3.devuelve entrada");
		System.out.println("4.salir");
		System.out.println();
		System.out.println("Introduzca opción: ");
          opcion = teclado.nextInt();
          switch (opcion) {
			case 1:
				imprimirmatriz(matriz, filas, columnas);
				break;
			case 2:
				comprarentrada(matriz,fila,columna,teclado);
				break;
			case 3:
				devolverEntrada(matriz,fila,columna,teclado);
				break;
			case 4:
				System.out.println("Has salido");
				break;
			default:
				System.out.println("Introduzca otra opción.");
				break;
}
		}while(opcion != 4);
	}
			private static void devolverEntrada(int[][] sala, int fila, int columna, Scanner teclado) {
			// TODO Auto-generated method stub
			try {
				System.out.println("introduzca fila: ");
				fila = teclado.nextInt();
				System.out.println("Introduzca columna: ");
				columna = teclado.nextInt();
				
				if((sala[fila][columna] == 8) || (sala[fila][columna] == 0 ))
					if(sala[fila][columna] == 8)
						System.out.println("No hay butaca porque es pasillo.");
					else
						System.out.println("Esta butaca no esta comprada.");
				else
					sala[fila][columna] = 0;
			}catch(InputMismatchException error) {
				System.out.println("No introduzca palabras raras.");
			}catch(ArrayIndexOutOfBoundsException error) {
				System.out.println("Has introudcido numeros de mas");
			}
	}

	private static void comprarentrada(int[][] matriz, int a, int e, Scanner teclado) {
		try {
			System.out.println("introduzca fila:");
			a = teclado.nextInt();
			System.out.println("introduzca columna:");
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
		
		}catch(InputMismatchException error){
			System.out.println("no introduzca palabras raras");
		}catch(ArrayIndexOutOfBoundsException error) {
			System.out.println("el valor no es correcto");
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
