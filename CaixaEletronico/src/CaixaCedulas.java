import java.util.Scanner;

public class CaixaCedulas {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int valor;
		int q100, q50, q20, q5, q1;
		int resto;
		System.out.println("Digite valor do saque");
		valor = teclado.nextInt();
		q100 = valor / 100;
		resto = valor % 100;
		q50 = resto / 50;
		resto = resto % 50;
		q20 = resto / 20;
		resto = resto % 20;
		q5 = resto / 5;
		resto = resto % 5;
		q1 = resto / 1;
		resto = resto / 1;
		System.out.println("Quantidades de cédulas de 100:" + q100);
		System.out.println("Quantidades de cédulas de 50:" + q50);
		System.out.println("Quantidades de cédulas de 20:" + q20);
		System.out.println("Quantidades de cédulas de 5:" + q5);
		System.out.println("Quantidades de cédulas de 1:" + q1);

	}
}
