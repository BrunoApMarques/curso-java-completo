import java.util.Scanner;

public class ExibirPositivo {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int n1, contador, resultado;
	contador = 1;
	do {
		System.out.println("Digite um Numero");
		n1 = teclado.nextInt();
		if(n1 > 0) {
			System.out.println("O numero digitado é : " + n1);
		}
	} while (n1 != 0);
}
}

