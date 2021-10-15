import java.util.Scanner;

public class CalculoConsumo {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite velocidade");
		double velocidade;
		velocidade = teclado.nextDouble();
		System.out.println("Digite o tempo");
		double tempo;
		tempo = teclado.nextDouble();
		double distancia = velocidade * tempo;
		double consumo = distancia / 14;
		System.out.println("Consumo=" + consumo);

	}

}
