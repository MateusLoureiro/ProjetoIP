package repositorios;

import basicas.Produto;
import excecoes.ProdutoNaoEncontradoException;
import interfaces.RepositorioProdutos;

public class RepositorioProdutosArray implements RepositorioProdutos {
	
	private Produto[] produtos;
	private int indice;
	private int tamanho;
	
	public RepositorioProdutosArray(int tamanho) {
		produtos = new Produto[tamanho];
		this.indice = 0;
		this.tamanho = tamanho;
	}
	
	public void inserir(Produto produto) {
		// TODO Auto-generated method stub
		if (indice < tamanho) {
			produtos[indice] = produto;
			indice++;
		} else {
			
		}
	}

	public void atualizar(Produto produto) {
		// TODO Auto-generated method stub
		
	}

	public void remover(int codigo) {
		// TODO Auto-generated method stub
		
	}

	public Produto procurar(int codigo) throws ProdutoNaoEncontradoException {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void aumentarArray() {
		
	}
}