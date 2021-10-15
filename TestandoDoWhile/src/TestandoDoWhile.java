import java.util.Scanner;

public class TestandoDoWhile {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		int contador, resultado;
		System.out.println("Digite um valor");
		numero = teclado.nextInt();
		contador = 0;
		do {
			resultado = contador * numero;
			System.out.println("O resultado é : " + resultado);
			contador += 1;
		} while (contador <= 10);
	}
}
