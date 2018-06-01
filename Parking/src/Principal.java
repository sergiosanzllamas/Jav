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
			System.out.println("2.Coche.");
			System.out.println("3. Moto.");
			System.out.println("4. Autobús.");
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
		for (int f = 0; f < filas; f++) {
			for (int c = 0; c < columnas; c++) {
				System.out.print(parking[f][c]);
			}
			System.out.println();
		}
		System.out.println();
	}

	private static void iniciaParking(char[][] parking, int filas, int columnas) {
		// TODO Auto-generated method stub
		for(int r=1; r<4; r++) {
		for (int f = 0; f < filas; f++) {
			for (int c = 0; c < columnas; c++) {
				parking[f][c] = '\0';
				if((f == 0 && c==0) || (f ==0 && c== 9) || (f==4 && c ==0) || (f==4 && c == 9))
				parking[f][c] = 'X';
				if((f==0 && c>=1 && c<=9) || (f ==4 && c>=1 && c<=9))
				parking[f][c] = 'P';
			}
		}
	}
}
}