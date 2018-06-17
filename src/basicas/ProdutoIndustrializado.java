package basicas;

public class ProdutoIndustrializado extends Produto {
	
	private int estoque;

	public ProdutoIndustrializado(String nome, double precoCompra, double precoVenda, int codigo,
			boolean disponibilidade, int estoque) {
		super(nome, precoCompra, precoVenda, codigo, disponibilidade);
		// TODO Auto-generated constructor stub
		this.estoque = estoque;
	}

	@Override
	public void atualizarDisponibilidade(boolean disponibilidade) {
		// TODO Auto-generated method stub
		if (this.estoque > 0) {
			super.setDisponibilidade(disponibilidade);
		}
	}
	
	public void adicionarEstoque(int estoque) {
		this.estoque += estoque;
	}
	
	public void retirarEstoque(int estoque) {
		this.estoque -= estoque;
	}

	public int getEstoque() {
		return this.estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

}
