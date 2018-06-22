package main;

import basicas.*;
import excecoes.*;
import fachada.Restaurante;
import negocios.CadastroProdutos;
import repositorios.*;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RepositorioProdutosArray rep = new RepositorioProdutosArray();
		CadastroProdutos cadastroProdutos = new CadastroProdutos(rep);
		rep.inserir(new Refeicao("primeiro", 30, 40, 0, true));
		rep.inserir(new Refeicao("segundo", 30, 40, 1, true));
		rep.inserir(new Refeicao("terceiro", 30, 40, 2, true));
		rep.inserir(new Refeicao("quarto", 30, 40, 3, true));
		rep.inserir(new Refeicao("quinto", 30, 40, 4, true));
		try {
			Produto produto = cadastroProdutos.procurarCadastro(6);//(new Refeicao("sexto", 10, 420, 5, true));
			System.out.println(produto.getNome());
		} catch (ProdutoNaoEncontradoException e) {
			// TODO Auto-generated catch block
			System.out.println("N TA CADASTRADO");
		}
		
//		rep.TESTARARRAY();
	}
	
}
