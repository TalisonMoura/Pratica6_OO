package br.com.exemplarpratica6;

import java.util.ArrayList;

public class RevistaCientifica {
	private String titulo;
	private long issn;
	private String peridiocidade;
	private Edicao edicoes;

	public RevistaCientifica(String titulo, long issn, String peridiocidade, Edicao edicoes) {
		// super();
		this.titulo = titulo;
		this.issn = issn;
		this.peridiocidade = peridiocidade;
		this.edicoes = edicoes;
	}
}
