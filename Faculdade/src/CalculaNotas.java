import java.util.Scanner;

public class CalculaNotas {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double resultado;
		System.out.println("Digite a primeira nota");
		double nota1 = teclado.nextDouble();
		System.out.println("Digite a segunda nota");
		double nota2 = teclado.nextDouble();
		resultado = (nota1 + nota2) / 2;
		System.out.println("A sua nota final é " + resultado);
		if (resultado >= 6) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reproved");
		}
	}
}
