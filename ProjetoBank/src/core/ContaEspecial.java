package core;
public class ContaEspecial extends ContaCorrente {
	private double limite;
	
	public ContaEspecial(int numeroConta, String nomeTitular, double saldo, double limite) {
	super(numeroConta,nomeTitular,saldo);
	this.limite = limite;
}
    public String exibir() {
    	return "Nome titular : "+nomeTitular+ "Numero conta : "+numeroConta+"Saldo : "+saldo+"Limite : "+limite ;
    }
  
    public boolean sacar (double valor) {
    	if(saldo+limite >=valor) {
    		saldo=saldo-valor;
    		return true;
    	}else {
    		return false;
    	}
    }
    public double getLimite() {
    	return limite;
    }
    public void setLimite(double limite) {
    	this.limite=limite;
    }
    }
