package negocios;

import basicas.Produto;
import excecoes.*;
import interfaces.*;

public class CadastroProdutos {
	
	private RepositorioProdutos produtos;
	
	public CadastroProdutos(RepositorioProdutos rep) {
		this.produtos = rep;
	}
	
	public void cadastrarProduto (Produto produto) throws ProdutoJaCadastradoException {
		try {
			produtos.procurar(produto.getCodigo());
			throw new ProdutoJaCadastradoException();
		} catch (ProdutoNaoEncontradoException e) {
			produtos.inserir(produto);
		}
	}
	
	public void atualizarCadastroProduto (Produto produto) throws ProdutoNaoEncontradoException {
		Produto atualizado = produtos.procurar(produto.getCodigo());
//		atualizado FALTANDO COISA PACARAI
	}
}