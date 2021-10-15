package userinterface;

import abastecimento.Abastecimento;

public class BombaOne {
public static void main(String[] args) {
	Abastecimento a;
	a = new Abastecimento("Gasolina",5.99, 0,0);
	a.abastecerPorLitro(35);
	System.out.println(a.exibirRecibo());
	a.abastecerPorValor(50);
	System.out.println(a.exibirRecibo());
	
	
}
}
