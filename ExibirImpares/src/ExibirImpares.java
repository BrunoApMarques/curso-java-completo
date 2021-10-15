import java.util.Scanner;

public class ExibirImpares {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int n;
		System.out.println("Coloque o numero");
		n=teclado.nextInt();
		for(int contador=1; contador<=n; contador=contador=2) {
			System.out.println(contador);
		}
		}
	}