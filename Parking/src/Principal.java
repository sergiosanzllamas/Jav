import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		int filas = 5, columnas = 10;
		char[][] parking = new char[filas][columnas];
		int opcion, f, c;
		Scanner teclado = new Scanner(System.in);
		iniciaParking(parking, filas, columnas);

		do {
			System.out.println("1. Ver el parking.");
			System.out.println("2. Entrada de un coche.");
			System.out.println("3. Entrada de una moto.");
			System.out.println("4. Entrada de un autobús.");
			System.out.println("5. Salida de un vehículo.");
			System.out.println("6. Ver recaudación.");
			System.out.println("7. Salir del programa.");
			System.out.println();
			System.out.println("Introduce opcion: ");
			opcion = teclado.nextInt();

			switch (opcion) {
			case 1:
				imprimirParking(parking, filas, columnas);
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			default:
				break;

			}

		} while (opcion != 7);
	}

	private static void imprimirParking(char[][] parking, int filas, int columnas) {
		// TODO Auto-generated method stub
		for(int f=0; f<filas; f++) {
			for(int c=0; c<columnas;c++) {
				System.out.print(parking[f][c]);
			}
			System.out.println();
		}
		System.out.println();
	}
	private static void iniciaParking(char[][] parking, int filas, int columnas) {
		// TODO Auto-generated method stub
		for(int f=0; f<filas; f++) {
			for(int c=0; c<columnas; c++) {
				parking[0][0] = 'X';
				parking[0][8] = 'X';
				parking[4][0] = 'X';
				parking[4][8] = 'X';
}
		}		
}
}