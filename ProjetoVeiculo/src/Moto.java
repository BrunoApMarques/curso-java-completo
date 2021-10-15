
public class Moto extends Veiculo {

	public Moto(String marca, String modelo, int ano) {
		super(marca, modelo, ano);
		// TODO Auto-generated constructor stub
	}

	public void acelerar() {
		System.out.println("Moto acelera na mao");
	}

	public void frear() {
		System.out.println("Frea no pé");
	}

}

