import java.util.Scanner;

public class TestandoWhile {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		System.out.println("Coloque um numero aqui");
		numero = teclado.nextInt();
		int contador, resultado;
		contador = 0;
		while (contador <= 10) {
			resultado = contador * numero;
			System.out.println("Seu resultado foi : " + resultado);
			contador=contador+1;

		}
	}
}
