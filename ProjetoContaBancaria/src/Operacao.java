import java.util.Scanner;

public class Operacao {
	public static void main(String[] args) {
		
	Scanner teclado = new Scanner(System.in);
	ControleBancario c;
	c =  new ControleBancario (1234, 3366, "Bruno Mezzenga", "36677631843", 0);
	int opcao;
	double valor;
	
	do {
		System.out.println("Bem vindo ao Isibanks.Digite 1 para information da conta, 2 para deposito, 3 para saque e 0 para encerrar");
		opcao=teclado.nextInt();
		switch(opcao) {
		case 1:
		  System.out.println(c.imprimir());
		break;
		case 2:
			System.out.println("Valor deposito");
			valor=teclado.nextDouble();
			c.depositar(valor);
			break;
		
		case 3:
			System.out.println("Valor do saque");
			valor=teclado.nextDouble();
			if(c.sacar(valor)){
				System.out.println("Efetuado saque");
			}else {
				System.out.println("Saldo insuficiente");
			}
			break;
		case 0:
			System.out.println("Obrigado volte sempre!");
			break;
				default:
					System.out.println("Operação inválida!");
					break;
			}
	}while(opcao !=0);

}
}

