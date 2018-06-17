package basicas;

public abstract class Produto {

	private String nome;
	private double precoVenda;
	private double precoCompra;
	private int codigo;
	private boolean disponibilidade;
	
	public Produto(String nome, double precoCompra, double precoVenda, int codigo, boolean disponibilidade) {
		this.nome = nome;
		this.precoCompra = precoCompra;
		this.precoVenda = precoVenda;
		this.codigo = codigo;
		this.disponibilidade = disponibilidade;
	}
	
	public abstract void atualizarDisponibilidade(boolean disponibilidade);
	
	public boolean getDisponibilidade() {
		return this.disponibilidade;
	}

	protected void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPrecoVenda() {
		return this.precoVenda;
	}
	
	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}
	
	public double getPrecoCompra() {
		return this.precoCompra;
	}
	
	public void setPrecoCompra(double precoCompra) {
		this.precoCompra = precoCompra;
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
}