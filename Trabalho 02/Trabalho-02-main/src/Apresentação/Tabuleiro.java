package Apresentação;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.JPanel;

import Modelo.Celula;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Tabuleiro extends JPanel{

	
	public Celula getCelula (int x, int y) {
		Component [] components = getComponents();
		
		for (Component componente : components) {
			if (componente instanceof JButton) {
				JButton botao = (JButton) componente;
				Celula celula = (Celula) botao.getClientProperty("cell");
			
				if (celula.getX() == x && celula.getY() == y) {
					return celula;
				}
			}
		}
		return null;
	}

	public Tabuleiro() {

		setLayout(new GridLayout(8, 8));
				//gerarBotoes();
		for (int linha = 1; linha <= 8; linha++) {
			for (int coluna = 1; coluna <= 8; coluna++) {
				
				Celula celula = new Celula (linha, coluna);
				
				celula.Botao.putClientProperty("cell", celula);
				celula.Botao.setPreferredSize(new Dimension (500,500));
				celula.Botao.setBorderPainted(false);
				add (celula.Botao);
			
				if((linha + coluna) % 2 == 0) {
					celula.Botao.setBackground(Color.WHITE);
				} else {
					celula.Botao.setBackground(Color.DARK_GRAY);
				}
			}
		}
		
		
	}
}
	
