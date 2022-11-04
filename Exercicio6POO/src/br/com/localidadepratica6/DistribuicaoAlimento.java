package br.com.localidadepratica6;

public class DistribuicaoAlimento extends Projeto {
	private String descAlimento;
	private float qtd;

	public DistribuicaoAlimento(String nomeP, String descricao, String endereco, String datainicio, String datafim,
			String descAlimento, float qtd) {
		super(nomeP, descricao, endereco, datainicio, datafim);
		this.descAlimento = descAlimento;
		this.qtd = qtd;
	}

	public String getDescAlimento() {
		return descAlimento;
	}

	public void setDescAlimento(String descAlimento) {
		this.descAlimento = descAlimento;
	}

	public float getQtd() {
		return qtd;
	}

	public void setQtd(float qtd) {
		this.qtd = qtd;
	}

	public boolean validaProjeto() {
		if (getDatafim() == null)
			return true;
		else
			return false;
	}

	public String imprimeProjeto() {
		return "Endereco do Projeto: " + "\n" + getEndereco() + "Nome do Projeto: " + getNomeP() + "\n" + "Descricao: "
				+ getDescricao() + "\n" + "Data Inicio: " + getDatainicio() + "\n" + "Data Fim: " + getDatafim() + "\n"
				+ "Descricao Alimento: " + getDescAlimento() + "\n" + "Quantidade: " + getQtd();
	}
}
