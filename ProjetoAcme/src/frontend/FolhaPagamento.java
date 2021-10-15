package frontend;

import core.Chefe;
import core.Funcionarios;

public class FolhaPagamento {
	public static void main(String[] args) {
		Funcionarios f1, f2, f3, f4, f5, f6;
		f1 = new Chefe(12345, "Silvio ", 5000, 20, 500);
		System.out.println(f1.getNome() + "R$ " + f1.calcularSalario());
	}
}
