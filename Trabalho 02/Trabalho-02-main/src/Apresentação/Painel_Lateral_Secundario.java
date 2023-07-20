package Apresentação;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import Modelo.*;
import Apresentação.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Painel_Lateral_Secundario extends JPanel{
	private Botao_robo_secundario B_andador;
	private Botao_robo_secundario B_cavalo;
	private Botao_robo_secundario B_bispo;
	private Robo robo_selecionado;
	
	R_Andador andador = new R_Andador();
	R_Cavalo cavalo = new R_Cavalo();
	R_Bispo bispo = new R_Bispo();
	
	public Painel_Lateral_Secundario() {
		super();
		setLayout(new FlowLayout());
		setPreferredSize(new Dimension(300, 140));
		setBackground(Color.GRAY);
		this.adicionarBotoes();

		
		    }

	public void adicionarBotoes() {
		Dimension tamanho_botao = new Dimension(85, 130);
		
		JButton B_andador = new JButton("andador", new ImageIcon("andador_molduraicon.png"));
		B_andador.setForeground(Color.WHITE);
		B_andador.setPreferredSize(tamanho_botao);
		B_andador.setContentAreaFilled(false);
		B_andador.setBorderPainted(false);

		JButton B_cavalo = new JButton("cavalo", new ImageIcon("moldura_cavaloicon.png"));
		B_cavalo.setForeground(Color.WHITE);
		B_cavalo.setPreferredSize(tamanho_botao);
		B_cavalo.setContentAreaFilled(false);
		B_cavalo.setBorderPainted(false);
		
		JButton B_bispo = new JButton("bispo", new ImageIcon("bispo_molduraicon.png"));
		B_bispo.setForeground(Color.WHITE);
		B_bispo.setPreferredSize(tamanho_botao);
		B_bispo.setContentAreaFilled(false);
		B_bispo.setBorderPainted(false);
		
		add (B_andador);
		add (B_cavalo);
		add (B_bispo);
		
		
		ActionListener selecionarRoboListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			JButton botaoSelecionado = (JButton) e.getSource();
				
					switch (botaoSelecionado.getText()) {
						case "andador":
							robo_selecionado = andador;
							break;
					case "cavalo":
							robo_selecionado = cavalo;
							break;
					case "bispo":
							robo_selecionado = bispo;
							break;
					}
					System.out.println("Robô selecionado: " + botaoSelecionado.getText());

					botaoSelecionado.setEnabled(false);
				}
			
		};
		B_andador.addActionListener(selecionarRoboListener);
		B_cavalo.addActionListener(selecionarRoboListener);
		B_bispo.addActionListener(selecionarRoboListener);
		
		System.out.println(selecionarRoboListener);
		System.out.println("robo_selecionado: "+ robo_selecionado);
		System.out.println("nome do botao:" + B_andador);
		System.out.println("nome do botao:" + B_cavalo);
		System.out.println("nome do botao:" + B_bispo);
		System.out.println("bispo:" + bispo);
		setBorder(BorderFactory.createEmptyBorder(10, 0, 25, 0));
	}
	
	
	public JButton getB_andador() {
		return B_andador;
	}

	public void setB_andador(Botao_robo_secundario b_andador) {
		B_andador = b_andador;
	}

	public Botao_robo_secundario getB_cavalo() {
		return B_cavalo;
	}

	public void setB_cavalo(Botao_robo_secundario b_cavalo) {
		B_cavalo = b_cavalo;
	}

	public Botao_robo_secundario getB_bispo() {
		return B_bispo;
	}

	public void setB_bispo(Botao_robo_secundario b_bispo) {
		B_bispo = b_bispo;
	}

	public Robo getRobo_selecionado() {
		return robo_selecionado;
	}

	public void setRobo_selecionado(Robo robo_selecionado) {
		robo_selecionado = robo_selecionado;
	}
	
	public void Ligar() {
		B_andador.setEnabled(true);
		B_cavalo.setEnabled(true);
		B_bispo.setEnabled(true);
	}
	
	public R_Andador getAndador() {
		
		return andador;
	}

	public void setAndador(R_Andador andador) {
		this.andador = andador;
	}

	public R_Cavalo getCavalo() {
		return cavalo;
	}

	public void setCavalo(R_Cavalo cavalo) {
		this.cavalo = cavalo;
	}

	public R_Bispo getBispo() {
		return bispo;
	}

	public void setBispo(R_Bispo bispo) {
		this.bispo = bispo;
	}

}

	
	
