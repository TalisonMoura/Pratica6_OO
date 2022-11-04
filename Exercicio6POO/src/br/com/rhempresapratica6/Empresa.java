package br.com.rhempresapratica6;

public class Empresa {
	private String nomeEmpresa;
	private String cnpj;
	private int qtdFuncionario;
	Funcionario[] funcionarios;
	private static int count = 0;

	public Empresa(String nomeEmpresa, String cnpj, int qtdFuncionario) {
		this.nomeEmpresa = nomeEmpresa;
		this.cnpj = cnpj;
		if (qtdFuncionario <= 100) {
			funcionarios = new Funcionario[qtdFuncionario];
		} else {
			this.qtdFuncionario = 100;
			funcionarios = new Funcionario[100];
		}
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public int getQtdFuncionario() {
		return qtdFuncionario;
	}

	public void setQtdFuncionario(int qtdFuncionario) {
		this.qtdFuncionario = qtdFuncionario;
	}

	public void insereFuncionario(Funcionario func) {
		funcionarios[count] = func;
		count++;
	}
}
