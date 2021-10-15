import java.util.Scanner;

public class CaixaDeCompras {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double preco, total;
		total = 0;

		do {
			System.out.println("Informe o preço do produto : ");
			preco = teclado.nextDouble();
			if (preco > 0) {
				total = total + preco;

			}
		} while (preco > 0);
		System.out.println("Total da compra : " + total);
	}
}
