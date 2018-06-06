import java.util.Scanner;

import java.util.InputMismatchException;

public class Principal {

	public static void main(String[] args) {
		String marca = null, matricula = null, modelo = null, compañia = null;
		int dni = 0, cilindrada = 0, plazas = 0;
		boolean electrico = false;
		Coche coche = new Coche(matricula, marca, modelo, dni, electrico);
		Autobus autobus = new Autobus(matricula, marca, modelo, plazas, compañia);
		Moto moto = new Moto(matricula, marca, modelo, cilindrada);
		int filas = 5, columnas = 10;
		char[][] parking = new char[filas][columnas];
		int opcion, f = 0, c = 0, cCoche = 0, cAutobus = 0, cMoto = 0;
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
				imprimeParking(parking, filas, columnas);
				break;
			case 2:
				if (asignarCochePlaza(parking, f, c, teclado, coche))
					cCoche += 5;
				break;
			case 3:
				if (asignarMotoPlaza(parking, f, c, teclado, moto))
					cMoto += 3;
				break;
			case 4:
				if (asignarAutobusPlaza(parking, f, c, teclado, autobus))
					cAutobus += 10;
				break;
			case 5:
				outPlaza(parking, f, c, teclado);
				break;
			case 6:
				System.out.println("Recaudacion de coche: " + cCoche + "€");
				System.out.println("Recaudacion de moto: " + cMoto + "€");
				System.out.println("Recaudacion de autobus: " + cAutobus + "€");
				break;
			case 7:
				break;
			default:
				System.out.println("Introduce del 1 al 7.");
				break;

			}

		} while (opcion != 7);
	}

	private static void outPlaza(char[][] parking, int f, int c, Scanner teclado) {
		// TODO Auto-generated method stub
		try {
			System.out.println("introduzca la fila: ");
			f = teclado.nextInt();
			System.out.println("Introduzca la columna: ");
			c = teclado.nextInt();
			if (parking[f][c] == 'C' || parking[f][c] == 'A' || parking[f][c] == 'M') {
				parking[f][c] = '0';
				System.out.println("Plaza ha sido retirada");
			} else
				System.out.println("Esta plaza ocupada o no hay");
		} catch (InputMismatchException error) {
			System.out.println("No introduzca palabras raras.");
		} catch (ArrayIndexOutOfBoundsException error) {
			System.out.println("Has introudcido numeros de mas");
		}
	}

	private static boolean asignarAutobusPlaza(char[][] parking, int f, int c, Scanner teclado,
			Autobus autobus) {
		// TODO Auto-generated method stub
		boolean comprado = false;
		try {
			System.out.println("introduzca la fila: ");
			f = teclado.nextInt();
			System.out.println("Introduzca la columna: ");
			c = teclado.nextInt();
			if (parking[f][c] == 'X' || parking[f][c] == 'P' || parking[f][c] == 'E'
					|| parking[f][c] == 'S' || parking[f][c] == 'C' || parking[f][c] == 'A'
					|| parking[f][c] == 'M') {
				if (parking[f][c] == 'X')
					System.out.println("Esta es la esquina.");
				if (parking[f][c] == 'X')
					System.out.println("Esta es la pared.");
				if (parking[f][c] == 'E')
					System.out.println("Esta es la entrada.");
				if (parking[f][c] == 'S')
					System.out.println("Esta es la salida.");
				if (parking[f][c] == 'C')
					System.out.println("Aqui hay un coche");
				if (parking[f][c] == 'A')
					System.out.println("Aqui hay un autobus");
				if (parking[f][c] == 'M')
					System.out.println("Aqui hay una moto");
			} else {
				parking[f][c] = 'A';
				System.out.println("Matricula:");
				autobus.matricula = teclado.next();
				System.out.println("Marca:");
				autobus.marca = teclado.next();
				System.out.println("Modelo:");
				autobus.modelo = teclado.next();
				System.out.println("Asientos:");
				autobus.asientos = teclado.nextInt();
				System.out.println("Compañia: ");
				autobus.compañia = teclado.next();
				comprado = true;
			}

		} catch (InputMismatchException error) {
			System.out.println("No introduzca palabras.");
		} catch (ArrayIndexOutOfBoundsException error) {
			System.out.println("No introduzca palabras.");
		}
		return comprado;
	}

	private static boolean asignarCochePlaza(char[][] parking, int f, int c, Scanner teclado, Coche coche) {
		boolean comprado = false;
		try {
			System.out.println("introduzca la fila: ");
			f = teclado.nextInt();
			System.out.println("Introduzca la columna: ");
			c = teclado.nextInt();
			if (parking[f][c] == 'X' || parking[f][c] == 'P' || parking[f][c] == 'E'
					|| parking[f][c] == 'S' || parking[f][c] == 'C' || parking[f][c] == 'A'
					|| parking[f][c] == 'M') {
				if (parking[f][c] == 'X')
					System.out.println("Esta es la esquina.");
				if (parking[f][c] == 'X')
					System.out.println("Esta es la pared.");
				if (parking[f][c] == 'E')
					System.out.println("Entrada.");
				if (parking[f][c] == 'S')
					System.out.println("Salida.");
				if (parking[f][c] == 'C')
					System.out.println("Hay un coche");
				if (parking[f][c] == 'A')
					System.out.println("Hay un autobus");
				if (parking[f][c] == 'M')
					System.out.println("Hay una moto");
			} else {
				parking[f][c] = 'C';
				System.out.println("Matricula:");
				coche.matricula = teclado.next();
				System.out.println("Marca:");
				coche.marca = teclado.next();
				System.out.println("Modelo:");
				coche.modelo = teclado.next();
				System.out.println("DNI");
				coche.dni = teclado.nextInt();
				comprado = true;
			}
		} catch (InputMismatchException error) {
			System.out.println("No introduzca palabras.");
		} catch (ArrayIndexOutOfBoundsException error) {
			System.out.println("No introduzca palabras.");
		}
		return comprado;
	}

	private static boolean asignarMotoPlaza(char[][] parking, int f, int c, Scanner teclado, Moto moto) {
		boolean comprado = false;
		try {
			System.out.println("introduzca la fila: ");
			f = teclado.nextInt();
			System.out.println("Introduzca la columna: ");
			c = teclado.nextInt();
			if (parking[f][c] == 'X' || parking[f][c] == 'P' || parking[f][c] == 'E'
					|| parking[f][c] == 'S' || parking[f][c] == 'C' || parking[f][c] == 'A'
					|| parking[f][c] == 'M') {
				if (parking[f][c] == 'X')
					System.out.println("Esquina.");
				if (parking[f][c] == 'X')
					System.out.println("Pared.");
				if (parking[f][c] == 'E')
					System.out.println("Entrada.");
				if (parking[f][c] == 'S')
					System.out.println("Salida.");
				if (parking[f][c] == 'C')
					System.out.println("Hay un coche");
				if (parking[f][c] == 'A')
					System.out.println("Hay un autobus");
				if (parking[f][c] == 'M')
					System.out.println("Hay una moto");
			} else {
				parking[f][c] = 'M';
				System.out.println("Matricula:");
				moto.matricula = teclado.next();
				System.out.println("Marca:");
				moto.marca = teclado.next();
				System.out.println("Modelo:");
				moto.modelo = teclado.next();
				System.out.println("Cilindrada: ");
				moto.cilindrada = teclado.nextInt();
comprado = true;
			}

		} catch (InputMismatchException error) {
			System.out.println("No introduzca palabras.");
		} catch (ArrayIndexOutOfBoundsException error) {
			System.out.println("No introduzca palabras.");
		}
		return comprado;
	}

	private static void imprimeParking(char[][] parking, int filas, int columnas) {
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
		for (int f = 0; f < filas; f++) {
			for (int c = 0; c < columnas; c++) {
				parking[f][c] = 'R';
				if ((f == 0 && c == 0) || (f == 0 && c == 9) || (f == 4 && c == 0) || (f == 4 && c == 9)
						|| (f == 2 && c == 0))
					parking[f][c] = 'X';
				if ((f == 0 && c >= 1 && c < 9) || (f == 4 && c >= 1 && c < 9) || (f >= 1 && f < 4 && c == 9))
					parking[f][c] = 'P';
				if (f == 1 && c == 0)
					parking[f][c] = 'E';
				if (f == 3 && c == 0)
					parking[f][c] = 'S';
				if (f >= 1 && f < 4 && c >= 1 && c < 8)
					parking[f][c] = ' ';
			}
		}

	}
}
