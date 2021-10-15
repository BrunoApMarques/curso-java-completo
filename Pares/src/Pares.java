import java.util.Scanner;

public class Pares {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		int pares;
		int impares;
		pares = 0;
		impares = 0;
		for (int contador = 1; contador <= 5; contador++) {
			System.out.println("Por favor, digite um numero ");
			numero = teclado.nextInt();
			if (numero % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}
		System.out.println("Quantidade de valores pares = " + pares);
		System.out.println("Quantidade de valores impares = " + impares);
	}

}
