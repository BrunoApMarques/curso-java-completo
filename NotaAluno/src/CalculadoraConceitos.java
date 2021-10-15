import java.util.Scanner;

public class CalculadoraConceitos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double n1, n2, media;
		System.out.println("Digite nota do primeiro bimestre");
		n1 = teclado.nextDouble();
		System.out.println("Digite nota do segundo bimestre");
		n2 = teclado.nextDouble();
		media = (n1 + n2) / 2;
		if (media > 9 && media <= 10) {
			System.out.println("Aprovado com conceito A");
		} else if (media > 8 && media <= 9) {
			System.out.println("Aprovado com conceito B");
		} else if (media > 6 && media <= 8) {
			System.out.println("Aprovado com conceito C");
		} else if (media >= 3 && media <= 6) {
			System.out.println("em exame");
		} else if (media > 0 && media <= 3) {
			System.out.println("REPROVADO");
		}
	}
}
