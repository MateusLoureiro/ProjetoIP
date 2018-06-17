package repositorios;

import basicas.Produto;
import excecoes.ProdutoNaoEncontradoException;
import interfaces.RepositorioProdutos;

public class RepositorioProdutosArray implements RepositorioProdutos {
	
	private Produto[] produtos;
	private int ultimoIndice;
	private int tamanho;
	
	public RepositorioProdutosArray(int tamanho) {
		produtos = new Produto[tamanho];
		this.ultimoIndice = -1; //não é o tamanho atual, e sim o ultimo indice
		this.tamanho = tamanho;
	}
	
	public void inserir(Produto produto) {
		// TODO Auto-generated method stub
		if (ultimoIndice < tamanho - 1) { // (tamanho - 1) é o ultimo indice suportado peelo array
			ultimoIndice++;
			produtos[ultimoIndice] = produto;
		} else {
			this.aumentarArray();
			this.inserir(produto);
		}
	}

	public void atualizar(Produto produto) {
		// TODO Auto-generated method stub
		
	}

	public void remover(int codigo) throws ProdutoNaoEncontradoException {
		// TODO Auto-generated method stub
		int indiceRemovido = this.acharIndice(codigo);
		
		for(int i = indiceRemovido; i < this.ultimoIndice - 1; i++) {
			this.produtos[i] = this.produtos[i + 1];
		}
		
		this.produtos[this.ultimoIndice] = null;
		ultimoIndice--;
	}

	public Produto procurar(int codigo) throws ProdutoNaoEncontradoException {
		// TODO Auto-generated method stub
		int indiceProcurado = this.acharIndice(codigo);
		Produto procurado = this.produtos[indiceProcurado];
	
		return procurado;
	}
	
	public int acharIndice(int codigo) throws ProdutoNaoEncontradoException {
		boolean achou = false;
		int indiceProcurado = -1;
		
		for (int i = 0; i < ultimoIndice && !achou; i++) {
			if(this.produtos[i].getCodigo() == codigo) {
				indiceProcurado = i;
				achou = true;
			}
		}
		
		if (!achou) {
			throw new ProdutoNaoEncontradoException();
		}
		
		return indiceProcurado;
	}
	
	public void aumentarArray() {
		Produto[] novoArray = new Produto[tamanho * 2];
		
		for(int i = 0; i < this.tamanho; i++) {
			novoArray[i] = this.produtos[i];
		}
		this.produtos = novoArray;
	}
}