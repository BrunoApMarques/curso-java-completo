import java.util.Scanner;

public class TestandoFor {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int numero, resultado;
	System.out.println("Coloque um n�mero.");
	numero=teclado.nextInt();
	for(int contador=0; contador<=10;contador++) {
		resultado=numero*contador;
		System.out.println("Seu resultado �"+resultado);
	}
}
}
