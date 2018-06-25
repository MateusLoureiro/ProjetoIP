package fachada;

import negocios.*;
import basicas.*;
import excecoes.*;
import interfaces.*;

public class Restaurante {
	
	private CadastroProdutos produtos;
	private CadastroClientes clientes;
	private CadastroFuncionarios funcionarios;
	private CadastroFornecedores fornecedores;

	public Restaurante(RepositorioProdutos repProd, RepositorioClientes repCli, RepositorioFuncionarios repFunc, RepositorioFornecedores repForn) {
		this.produtos = new CadastroProdutos(repProd);
		this.clientes = new CadastroClientes(repCli);
		this.funcionarios = new CadastroFuncionarios(repFunc);
		this.fornecedores = new CadastroFornecedores(repForn);
	}

	public void cadastrarFuncionario(Funcionario funcionario) throws FuncionarioJaCadastradoException, RepositorioFuncionariosCheioException {
		funcionarios.inserir(funcionario);
	}
	
	public void cadastrarFornecedor(Fornecedor fornecedor) throws FornecedorJaCadastradoException, RepositorioFornecedoresCheioException {
		fornecedores.inserir(fornecedor);
	}
	
	public void cadastrarProduto(Produto produto) throws ProdutoJaCadastradoException, FornecedorInvalidoException {
		try {
			fornecedores.procurar(produto.getFornecedor().getCodigo());
			produtos.cadastrar(produto);
		} catch (FornecedorNaoEncontradoException e) {
			// TODO Auto-generated catch block
			throw new FornecedorInvalidoException();
		}
	}
	
	public void cadastrarCliente(Cliente cliente) throws FuncionarioInvalidoException, ClienteJaCadastradoException, RepositorioClientesCheioException {
		try {
			funcionarios.procurar(cliente.getGarcom().getCodigo());
			clientes.inserir(cliente);
		} catch (FuncionarioNaoEncontradoException e) {
			// TODO Auto-generated catch block
			throw new FuncionarioInvalidoException();
		}
	}
}
