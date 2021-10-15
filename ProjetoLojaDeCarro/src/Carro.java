
public class Carro {
	String marca;
	String modelo;
	String cor;
	int ano;
	double preco;

	void exibir() {
		System.out.println("Marca do carro ; " + marca);
		System.out.println("Modelo do carro ; " + modelo);
		System.out.println("Cor do carro ; " + cor);
		System.out.println("Preco do carro ; " + preco);
		System.out.println("Ano do carro ; " + ano);
	}

	double calcularipva() {

		double ipva;
		if (ano > 2000) {
			ipva = preco * 3 / 100;

		} else {
			ipva = 0;
		}
		return ipva;

	}
}
