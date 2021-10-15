
public class Produto {
	private int codigo;
	private String nome;
	private String descricao;
	private int quantidade;
	private double preco;

	void exibir() {
		System.out.println("codigo do produto=" + codigo);
		System.out.println("nome do produto=" + nome);
		System.out.println("descricao do produto=" + descricao);
		System.out.println("preco" + preco);
		System.out.println("quantidade do produto" + quantidade);
	}

	void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
