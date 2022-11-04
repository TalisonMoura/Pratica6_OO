package br.com.localidadepratica6;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String tipoTrabalho;
		String descAlimento;
		String nomeP;
		String descricao;
		String endereco;
		String datainicio;
		String datafim;
		int opcao;
		int duracaoTrabalho;
		float qtd;

		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(
					"<1>Cadastrar Projeto Distribuir Alimentos\n<2>Cadastrar Projeto Trabalho Voluntario\n<3>Sair"));
			switch (opcao) {
			case 1:
				endereco = JOptionPane.showInputDialog("Endereco do Projeto");
				nomeP = JOptionPane.showInputDialog("Nome do Projeto");
				descricao = JOptionPane.showInputDialog("Descricao do Projeto");
				datainicio = JOptionPane.showInputDialog("Data Inicio do Projeto");
				datafim = JOptionPane.showInputDialog("Data Fim do Projeto");
				descAlimento = JOptionPane.showInputDialog("Descricao do Alimento do Projeto");
				qtd = Float.parseFloat(JOptionPane.showInputDialog("Quantidade"));
				DistribuicaoAlimento da = new DistribuicaoAlimento(nomeP, descricao, endereco, datainicio, datafim,
						descAlimento, qtd);
				JOptionPane.showMessageDialog(null, da.imprimeProjeto(), "Mensagem", JOptionPane.DEFAULT_OPTION);
				JOptionPane.showMessageDialog(null, da.validaProjeto(), "Mensagem", JOptionPane.DEFAULT_OPTION);
				break;
			case 2:
				endereco = JOptionPane.showInputDialog("Endereco do Projeto");
				nomeP = JOptionPane.showInputDialog("Nome do Projeto");
				descricao = JOptionPane.showInputDialog("Descricao do Projeto");
				datainicio = JOptionPane.showInputDialog("Data Inicio do Projeto");
				datafim = JOptionPane.showInputDialog("Data Fim do Projeto");
				tipoTrabalho = JOptionPane.showInputDialog("Tipo do Trabalho");
				duracaoTrabalho = Integer.parseInt("Duracao do Trabalho");
				TrabalhoVoluntario tb = new TrabalhoVoluntario(nomeP, descricao, endereco, datainicio, datafim,
						tipoTrabalho, duracaoTrabalho);
				JOptionPane.showMessageDialog(null, tb.imprimeProjeto(), "Mensagem", JOptionPane.DEFAULT_OPTION);
				JOptionPane.showMessageDialog(null, tb.validaProjeto(), "Mensagem", JOptionPane.DEFAULT_OPTION);
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Sair");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opcao Invalida");
			}

		} while (opcao != 3);

	}

}
