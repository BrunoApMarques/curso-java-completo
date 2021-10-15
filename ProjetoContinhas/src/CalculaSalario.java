import java.util.Scanner;

public class CalculaSalario {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o valor do salario:");
		double salario;
		salario = teclado.nextDouble();
		System.out.println("O salario digitado vale :" + salario);
		double desconto;
		desconto = salario * 15 / 100;
		System.out.println("O desconto vale" + desconto);
		double salarioLiquido;
		salarioLiquido = salario - desconto;
		System.out.println("Seu salario liquido vale" + salarioLiquido);
	}

}
