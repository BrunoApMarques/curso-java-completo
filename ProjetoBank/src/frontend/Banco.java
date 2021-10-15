package frontend;

import core.ContaCorrente;
import core.ContaEspecial;

public class Banco {

	public static void main(String[] args) {
		ContaCorrente cc,ce;
		
		cc = new ContaCorrente(23456 ,"Jaspion",18);
		ce = new ContaEspecial(23456,"Firmino", 10, 20);
		System.out.println(cc.exibir());
		
		
	}
}
