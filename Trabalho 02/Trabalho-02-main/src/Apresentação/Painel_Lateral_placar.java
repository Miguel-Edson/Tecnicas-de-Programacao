package Apresentação;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Painel_Lateral_placar extends JPanel {
	
	public Painel_Lateral_placar () {
		super();
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setPreferredSize(new Dimension(300, 40));
		setBackground(Color.GRAY);
		this.adicionar_placar();
		//this.placar_total();
	}
	public void adicionar_placar () {
		JLabel pontuacao_total = new JLabel("Pontuação: " + "999");
		add (pontuacao_total);
	}
	
	
	
}
