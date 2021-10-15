
public class Loja {
	public static void main(String[] args) {
		Carro c1;
		c1 = new Carro();
		;
		c1.marca = "chevrolet";
		c1.modelo = "corsa";
		c1.cor = "verde";
		c1.ano = 1989;
		c1.preco = 4918;
		Carro c2 = new Carro();
		c2.marca = "Fiat";
		c2.modelo = "Unão";
		c2.cor = "Preto ";
		c2.ano = 2011;
		c2.preco = 3000;
		c1.exibir();
		c2.exibir();
		System.out.println("Valor ipva" + c1.calcularipva());
	}
}
