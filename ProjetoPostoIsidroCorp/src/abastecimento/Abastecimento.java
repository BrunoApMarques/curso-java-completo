package abastecimento;

public class Abastecimento {
	 private String nomeCombustivel;
	 private double precoLitro ;
	 private double quantidadeLitro;
	 private double totalPagar;
	 
	 public Abastecimento(String nomeCombustivel, double precoLitro, double quantidadeLitro,  double totalPagar) {
		this.nomeCombustivel = nomeCombustivel;
		this.precoLitro=precoLitro;
		this.quantidadeLitro=quantidadeLitro;
		this.totalPagar=totalPagar;
	 }
	 public String  exibirRecibo () {
		 return nomeCombustivel+" "+precoLitro+" "+ quantidadeLitro+" "+totalPagar;
	 }
	 
	 public void abastecerPorLitro(double quantidadeLitro) {
		 this.quantidadeLitro=quantidadeLitro;
		 this.totalPagar=this.quantidadeLitro*precoLitro;
		 	 
	 }
	 public void abastecerPorValor( double valor) {
		 this.totalPagar=valor;
		 this.quantidadeLitro=valor/precoLitro;
		 		 
	 }

	public String getNomeCombustivel() {
		return nomeCombustivel;
	}

	public void setNomeCombustivel(String nomeCombustivel) {
		this.nomeCombustivel = nomeCombustivel;
	}

	public double getPrecoLitro() {
		return precoLitro;
	}

	public void setPrecoLitro(double precoLitro) {
		this.precoLitro = precoLitro;
	}

	public double getQuantidadeLitro() {
		return quantidadeLitro;
	}

	public void setQuantidadeLitro(double quantidadeLitro) {
		this.quantidadeLitro = quantidadeLitro;
	}

	public double getTotalPagar() {
		return totalPagar;
	}

	public void setTotalPagar(double totalPagar) {
		this.totalPagar = totalPagar;
	}
}

