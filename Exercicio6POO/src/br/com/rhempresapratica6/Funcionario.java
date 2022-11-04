package br.com.rhempresapratica6;

public class Funcionario extends Pessoa {
	private String departamento;
	private double salario;
	private String dataEntrada;
	private String rG;
	private boolean status;

	public Funcionario(String nome, String email, String telefone, String departamento, double salario,
			String dataEntrada, String rG, boolean status) {
		super(nome, email, telefone);
		this.departamento = departamento;
		this.salario = salario;
		this.dataEntrada = dataEntrada;
		this.rG = rG;
		this.status = status;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public String getrG() {
		return rG;
	}

	public void setrG(String rG) {
		this.rG = rG;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void bonifcar(double bonus) {
		this.salario = this.salario + bonus;
	}

	public void demitir() {
		this.status = false;
	}

	public String mostarDados() {
		return getNome() + "\n" + getEmail() + "\n" + getTelefone() + "\n" + getDepartamento() + "\n" + getSalario()
				+ "\n" + getDataEntrada() + "\n" + getrG() + "\n" + isStatus();
	}
}
