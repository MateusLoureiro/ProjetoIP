package negocios;

import basicas.Fornecedor;
import excecoes.FornecedorJaCadastradoException;
import excecoes.FornecedorNaoEncontradoException;
import excecoes.RepositorioFornecedoresCheioException;
import interfaces.RepositorioFornecedores;

public class CadastroFornecedores {

	private RepositorioFornecedores fornecedores;

	public CadastroFornecedores(RepositorioFornecedores rep) {
		this.fornecedores = rep;
	}

	public void inserir(Fornecedor cliente) throws FornecedorJaCadastradoException, RepositorioFornecedoresCheioException {
		if (!(this.fornecedores.existe(cliente.getCodigo()))) {
			this.fornecedores.inserir(cliente);
		} else {
			throw new FornecedorJaCadastradoException();
		}
	}

	public Fornecedor procurar(String cnpj) throws FornecedorNaoEncontradoException {
		return fornecedores.procurar(cnpj);
	}
	
	public void atualizar(Fornecedor cliente) throws FornecedorNaoEncontradoException {
		this.fornecedores.atualizar(cliente);
	}
	
	public void remover(String cnpj) throws FornecedorNaoEncontradoException{
		this.fornecedores.remover(cnpj);
	}

	public RepositorioFornecedores getClientes() {
		return this.fornecedores;
	}

	public void setClientes(RepositorioFornecedores clientes) {
		this.fornecedores = clientes;
	}
}
