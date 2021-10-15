import java.util.Scanner;

public class LeitorDeSenha {
public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	int senha;
	
	do {
	System.out.println("Digite sua senha :");
	senha=teclado.nextInt();
	if(senha !=2002) {
		System.out.println("senha invalida!");
	}
	} while (senha != 2002);
	System.out.println("senha validada  ");
		
	}
}
