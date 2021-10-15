package userinterface;

import core.Produto;

public class Loja {
public static void main(String[] args) {
	Produto p;
	p= new Produto(1234,"Teclado que acende luzinha",200);
	System.out.println(p.exibir());
}
}
