package br.com.exemplarpratica6;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		int numero, volume, tiragem;
		String dataEdicao, titulo, periodicidade, resumo, autores;
		long issn;

		titulo = JOptionPane.showInputDialog("Titulo da Revista");
		issn = Long.parseLong(JOptionPane.showInputDialog("ISSN"));
		periodicidade = JOptionPane.showInputDialog("Periodicidade");

		numero = Integer.parseInt(JOptionPane.showInputDialog("Numero"));
		volume = Integer.parseInt(JOptionPane.showInputDialog("Volume"));
		tiragem = Integer.parseInt(JOptionPane.showInputDialog("Tiragem"));
		dataEdicao = JOptionPane.showInputDialog("Data da Edicao");

		Edicao de1 = new Edicao(numero, volume, dataEdicao, tiragem);
		RevistaCientifica rev1 = new RevistaCientifica(titulo, issn, periodicidade, de1);

		ArrayList<Artigo> artigos = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			titulo = JOptionPane.showInputDialog("Titulo do Artigo");
			resumo = (JOptionPane.showInputDialog("Resumo"));
			autores = JOptionPane.showInputDialog("Autores");
			artigos.add(new Artigo(titulo, resumo, autores));
			de1.adicionaArtigo(artigos.get(i));

		}

	}
}