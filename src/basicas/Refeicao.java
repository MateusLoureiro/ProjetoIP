package basicas;

public class Refeicao extends Produto {

	public Refeicao(String nome, double precoCompra, double precoVenda, int codigo,
			boolean disponibilidade) {
		super(nome, precoCompra, precoVenda, codigo, disponibilidade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void atualizarDisponibilidade(boolean disponibilidade) {
		// TODO Auto-generated method stub
		this.setDisponibilidade(disponibilidade);
	}

}
