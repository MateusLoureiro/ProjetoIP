package main;

import basicas.*;
import excecoes.ProdutoNaoEncontradoException;
import fachada.Restaurante;
import repositorios.*;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RepositorioProdutosArray rep = new RepositorioProdutosArray(2);
		rep.inserir(new Refeicao("primeiro", 30, 40, 0, true));
		rep.inserir(new Refeicao("segundo", 30, 40, 1, true));
		rep.inserir(new Refeicao("terceiro", 30, 40, 2, true));
		rep.inserir(new Refeicao("quarto", 30, 40, 3, true));
		rep.inserir(new Refeicao("quinto", 30, 40, 4, true));
		try {
//			rep.remover(4);
//			rep.remover(3);
//			rep.remover(2);
//			rep.remover(1);
//			rep.remover(0);
			rep.atualizar(new Refeicao("kkkkkkkkk", 30, 40, -1, true));
		} catch (ProdutoNaoEncontradoException e) {
			// TODO Auto-generated catch block
			System.out.println("Nao tem");
		}
		
		rep.TESTARARRAY();
	}
	
}
