package Menu;

import Apresentação.*;
import Modelo.*;

import java.util.Random;
import javax.swing.JFrame;

import Modelo.Celula;
import Modelo.Robo;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;



public class Gerenciador {
	public int numero_alunos = 4;
	public int numero_bugs = 4;
	private Tabuleiro tabuleiro;
	private JFrame jogo;
	private Painel_Lateral_Secundario robo_selecionado;
	private Painel_Lateral_placar_B_A placar_BxA;
	private Painel_Lateral_placar placar_geral;
	private Painel_Lateral painel_lateral;
	private Painel_Topo topo;
	private Screen tela;
	private Botao_robo_secundario B_andador;
	private Botao_robo_secundario B_cavalo;
	private Botao_robo_secundario B_bispo;
	//private Celula celula;

	
	
	
	
	
	
	public Gerenciador (Screen screen, Painel_Topo painel_topo, Painel_Lateral painel_lateral,Tabuleiro tabuleiro, Painel_Lateral_Secundario robo_selecionado,Painel_Lateral_placar_B_A placar_BxA) {

	this.robo_selecionado = robo_selecionado;
	this.placar_BxA = placar_BxA;
	this.painel_lateral = painel_lateral;
			 painel_topo.getBotaoJogar().addActionListener(new ActionListener() {    		

		@Override
		public void actionPerformed(ActionEvent e) {
			if (painel_topo.getNomeJogador().getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Por favor, digite seu nome!");
//				screen.setSize(1100,800);
//				painel_lateral.setVisible(true);
//				tabuleiro.setVisible(true);
			} else {
				screen.setSize(1100,800);
				painel_lateral.setVisible(true);
				tabuleiro.setVisible(true);
				
			}

		}
	});
	
	
			 painel_lateral.getB_Sair().addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						String[] opcoes = { "Sim", "Não" };

						int opcao = JOptionPane.showOptionDialog(null, "Deseja realmente sair do jogo?", "Confirmação",
								JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

						if (opcao == JOptionPane.YES_OPTION) {
							System.out.println("Opção selecionada: Sim");
							screen.dispose();
						}

					}
				});
	
	
		painel_lateral.getB_Verificar().addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			verificar_Todos_Robos();
		}

	});
	
		
		painel_lateral.getB_Jogar().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				remover_Robos();

			}

		});	
		

	}
	
	public void Prepara_botao (Tabuleiro tabuleiro) {
		Component[] components = tabuleiro.getComponents();
		System.out.println("cheguei aqui");
		for (Component component : components) {
			if (component instanceof JButton) {
				((JButton) component).addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						Colocar_Robo(tabuleiro, painel_lateral.getPainelSecundario().getRobo_selecionado(),
								((Celula) ((JButton) component).getClientProperty("cell")).getX(),
								((Celula) ((JButton) component).getClientProperty("cell")).getY());
						robo_selecionado.setRobo_selecionado(null);

					}

				});
			}
		}
	}
	
	
	public void Colocar_Robo (Tabuleiro tabuleiro, Robo robo, int x, int y) {
		System.out.println("cheguei aqui2");
		System.out.println(robo);
		if (robo != null) {
			tabuleiro.getCelula(x, y).Botao.setIcon(robo.getIcone());

			robo.setLocalizacao(tabuleiro.getCelula(x, y));
			
			System.out.println("adicionou a celula" + robo.getLocalizacao().getX() + robo.getLocalizacao().getY());
			tabuleiro.getCelula(x, y).setRobo(robo);
			System.out.println("adicionou o robo a celula" + robo.getLocalizacao().getX() + robo.getLocalizacao().getY());
		}
	}
	
	public void verificar_Todos_Robos() {

			String roundFinalText = "";
			roundFinalText += verificar_Robo(painel_lateral.getPainelSecundario().getAndador());
			roundFinalText += verificar_Robo(painel_lateral.getPainelSecundario().getCavalo());
			roundFinalText += verificar_Robo(painel_lateral.getPainelSecundario().getBispo());

			if (roundFinalText.equals("")) {
				JOptionPane.showMessageDialog(null, "Infelizemente você não encontrou nenhum aluno!");
			} else {
				JOptionPane.showMessageDialog(null, roundFinalText);
			}
			roundFinalText = "";
		//	atualizar_pontuacao();
			painel_lateral.getB_Verificar().setEnabled(false);
		}

	
	public String verificar_Robo (Robo robo) {
		if (Pegar_Tipo(robo) == 1) {
			//placar_BxA.Achar_Aluno();
			placar_BxA.Achar_Aluno();
			robo.GanharPontos();
			System.out.println("ganha");
			return "O " + robo.getNome() + " encontrou um Aluno! (+10 Pontos!)\n";

		} else if (Pegar_Tipo(robo) == 2) {
			//painel_lateral.getPlacar_BxA().Achar_Bug();
			robo.PerderPontos();
			System.out.println("perde");
			return "O " + robo.getNome() + " encontrou um Bug! (-15 Pontos!)\n";
		} else {
			return "";
		}

	}
	
	
	public int Pegar_Tipo(Robo robo) {
		if (robo.getLocalizacao().getConteudo() != null) {
			return robo.getLocalizacao().getConteudo().getType();
		}
		return 0;
	}
	
	public int Elementos_Celula(Robo robo) {
		if (robo.getLocalizacao().getConteudo() != null) {
			return robo.getLocalizacao().getConteudo().getType();
		}
		return 0;
	}
	
	
	private int Gerar_Numero_Aleatorio (int max, int min) {
		Random numero_aleatorio;
		numero_aleatorio = new Random();
		return numero_aleatorio.nextInt((max - min) +1) + min;
		
	}
	
	public void povoar (Tabuleiro tabuleiro) {
		ArrayList<int[]> randomPositions = new ArrayList<int[]>();

		// Gera posições aleatórias para alunos e bugs
		for (int i = 1; i <= (this.numero_alunos + this.numero_bugs); i++) {
			int[] randomCord = new int[3];
			randomCord[2] = (i <= this.numero_alunos) ? 1 : 2; // Define o tipo (aluno ou bug)

			boolean sameCoord;
			do {
				randomCord[0] = Gerar_Numero_Aleatorio(8, 1);
				randomCord[1] = Gerar_Numero_Aleatorio(8, 1);
				sameCoord = false;

				// Verifica se a posição gerada já está ocupada
				for (int[] c : randomPositions) {
					if (randomCord[0] == c[0] && randomCord[1] == c[1]) {
						sameCoord = true;
						break;
					}
				}
			} while (sameCoord);

			randomPositions.add(randomCord);
		}

		// Adiciona os alunos e bugs às posições geradas
		for (int[] position : randomPositions) {
			int targetX = position[0];
			int targetY = position[1];
			int targetType = position[2];

			if (targetType == 1) {
				Aluno novoAluno = new Aluno();
				tabuleiro.getCelula(targetX, targetY).setConteudo(novoAluno);
				tabuleiro.getCelula(targetX, targetY).Botao.setIcon(novoAluno.getIcone());
			} else if (targetType == 2) {
				Bug novoBug = new Bug();
				tabuleiro.getCelula(targetX, targetY).setConteudo(novoBug);
				tabuleiro.getCelula(targetX, targetY).Botao.setIcon(novoBug.getIcone());
			}

		}
	}

	
	public void remover_Robos() {
		System.out.println("aqui tem o robo andador:" + painel_lateral.getPainelSecundario().getB_andador());
		if (painel_lateral.getPainelSecundario().getAndador().getLocalizacao().getConteudo() != null) {
			painel_lateral.getPainelSecundario().getAndador().getLocalizacao().Botao
					.setIcon(painel_lateral.getPainelSecundario().getAndador().getLocalizacao().getConteudo().getIcone());
			System.out.println("aqui tem o robo andador1:" + painel_lateral.getPainelSecundario().getB_andador());
		} else {
			painel_lateral.getPainelSecundario().getAndador().getLocalizacao().Botao.setIcon(null);
			System.out.println("aqui tem o robo andador2:" + painel_lateral.getPainelSecundario().getAndador());
		}
		painel_lateral.getPainelSecundario().getAndador().getLocalizacao().Botao.setEnabled(false);

		if (painel_lateral.getPainelSecundario().getCavalo().getLocalizacao().getConteudo() != null) {
			painel_lateral.getPainelSecundario().getCavalo().getLocalizacao().Botao
					.setIcon(painel_lateral.getPainelSecundario().getCavalo().getLocalizacao().getConteudo().getIcone());
		} else {
			painel_lateral.getPainelSecundario().getCavalo().getLocalizacao().Botao.setIcon(null);
		}
		painel_lateral.getPainelSecundario().getCavalo().getLocalizacao().Botao.setEnabled(false);

		if (painel_lateral.getPainelSecundario().getBispo().getLocalizacao().getConteudo() != null) {
			painel_lateral.getPainelSecundario().getBispo().getLocalizacao().Botao
					.setIcon(painel_lateral.getPainelSecundario().getBispo().getLocalizacao().getConteudo().getIcone());
		} else {
			painel_lateral.getPainelSecundario().getBispo().getLocalizacao().Botao.setIcon(null);
		}
		painel_lateral.getPainelSecundario().getBispo().getLocalizacao().Botao.setEnabled(false);

//		chooseRobo.getCavalo().getcellLocated().Button.setEnabled(false);
	//	painel_lateral.getPainelSecundario().Ligar();
		
		painel_lateral.getPainelSecundario().getB_andador().setEnabled(true);
		painel_lateral.getPainelSecundario().getB_cavalo().setEnabled(true);
		painel_lateral.getPainelSecundario().getB_bispo().setEnabled(true);;
		
	//	bispoButton.setEnabled(true);
	//	cavaloButton.setEnabled(true);
		//chooseRobo.turnButtonsOn();
//		treeButtonsMenu.getVerifyButton().setEnabled(true);
		painel_lateral.getB_Verificar().setEnabled(true);
		
	}
	
}
