public class AumentoSalario {
	public static void main(String[] args) {
		Funcionario e;
		e = new Funcionario();
		e.setNome("Bruno Mezenga");
		e.setCargo("Developer");
		e.setSalario(9989);
		e.imprimir();
		e.aumentarSalario(5);
		e.imprimir();
	}
}
