
public class Carro extends Veiculo{

	public Carro(String marca, String modelo, int ano) {
		super(marca, modelo, ano);
		// TODO Auto-generated constructor stub
	}
    public void acelerar() {
    	System.out.println("Carro veloz acelera por pensamento");
    }
    public void frear() {
    	System.out.println("Frea no pe");
    }
}
