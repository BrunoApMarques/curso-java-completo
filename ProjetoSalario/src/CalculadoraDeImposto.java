import java.util.Scanner;
public class CalculadoraDeImposto {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double salario,imposto;
		System.out.println("Digite seu salario");
		salario=teclado.nextDouble();
		if(salario<=2000) {
			imposto=0;
		}
		else if(salario>2000 && salario<=3000) {
			imposto=salario*7/100;
		}
		else if(salario>3000 && salario<=4000) {
			imposto=salario*10/100;
		}
		else {
			imposto=720;
		}
		System.out.println("Salario"+salario);
		System.out.println("Imposto="+imposto);
	}

}
