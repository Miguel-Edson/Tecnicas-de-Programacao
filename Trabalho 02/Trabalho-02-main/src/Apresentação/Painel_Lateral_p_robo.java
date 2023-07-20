package Apresentação;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Painel_Lateral_p_robo extends JPanel {

	public Painel_Lateral_p_robo () {
		super();
		setLayout(new FlowLayout());
		setPreferredSize(new Dimension(300, 150));
		setBackground(Color.GRAY);
		this.adicionar_img();
	//	this.adicionarBotoes();
	}
	
	public void adicionar_img () {
		ImageIcon R_andador = new ImageIcon ("andador.png");
		R_andador.setImage(R_andador.getImage().getScaledInstance(60, 150, Image.SCALE_SMOOTH));
		JLabel imagem_Andador= new JLabel(R_andador);
		JLabel pontuacao_Andador = new JLabel("15");
		add (imagem_Andador);
		add (pontuacao_Andador);
		
		ImageIcon R_Cavalo = new ImageIcon ("cavalo2.png");
		R_Cavalo.setImage(R_Cavalo.getImage().getScaledInstance(60, 150, Image.SCALE_SMOOTH));
		JLabel imagem_Cavalo= new JLabel(R_Cavalo);
		JLabel pontuacao_Cavalo = new JLabel("-5");
		add (imagem_Cavalo);
		add (pontuacao_Cavalo);
		
		ImageIcon R_Bispo = new ImageIcon ("bispo.png");
		R_Bispo.setImage(R_Bispo.getImage().getScaledInstance(60, 150, Image.SCALE_SMOOTH));
		JLabel imagem_Bispo= new JLabel(R_Bispo);
		JLabel pontuacao_Bispo = new JLabel("15");
		add (imagem_Bispo);
		add (pontuacao_Bispo);
	}
}
