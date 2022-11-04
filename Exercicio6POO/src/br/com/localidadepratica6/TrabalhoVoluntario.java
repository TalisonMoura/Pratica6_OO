package br.com.localidadepratica6;

public class TrabalhoVoluntario extends Projeto {
	private String tipoTrabalho;
	private int duracaoTrabalho;

	public TrabalhoVoluntario(String nomeP, String descricao, String endereco, String datainicio, String datafim,
			String tipoTrabalho, int duracaoTrabalho) {
		super(nomeP, descricao, endereco, datainicio, datafim);
		this.tipoTrabalho = tipoTrabalho;
		this.duracaoTrabalho = duracaoTrabalho;
	}

	public String getTipoTrabalho() {
		return tipoTrabalho;
	}

	public void setTipoTrabalho(String tipoTrabalho) {
		this.tipoTrabalho = tipoTrabalho;
	}

	public int getDuracaoTrabalho() {
		return duracaoTrabalho;
	}

	public void setDuracaoTrabalho(int duracaoTrabalho) {
		this.duracaoTrabalho = duracaoTrabalho;
	}

	public boolean validaProjeto() {
		if (getDuracaoTrabalho() > 2)
			return true;
		else
			return false;
	}

	public String imprimeProjeto() {
		return "Endereco do Projeto: " + getEndereco() + "Nome do Projeto: " + getNomeP() + "\n" + "Descricao: "
				+ getDescricao() + "\n" + "Data Inicio: " + getDatainicio() + "\n" + "Data Fim: " + getDatafim() + "\n"
				+ "TipoTrabalho: " + getTipoTrabalho() + "\n" + "Duracao Trabalho: " + getDuracaoTrabalho();
	}
}
