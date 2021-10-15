package frontend;

import core.Aluno;
import core.Pessoa;

public class Universidade {
	public static void main(String[] args) {
		Pessoa p1, p2;
		p1 = new Pessoa("Jãozim de Deus", "jao@gmail", "55555555");
		p2 = new Aluno("Tais " , "tata@gmail.com", "55555555", 12345, "Ciencia de dados");
System.out.println(p1.exibir());
System.out.println(p2.exibir());
	}
}
