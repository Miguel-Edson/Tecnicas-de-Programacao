package Apresentação;

import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;


public class Painel_Lateral extends JPanel {
	private Painel_Lateral_Secundario painelSecundario;
	private Painel_Lateral_placar_B_A placar_BxA;
	
	Botao_robo B_Verificar = new Botao_robo("Verificar", new Color(54,54,54), null);
	Botao_robo B_Jogar = new Botao_robo("Próxima Jogada", new Color(54,54,54), null);
	Botao_robo B_Sair = new Botao_robo("Sair do Jogo", new Color(54,54,54), null);

	
	public Painel_Lateral() {
		super();
		this.configurarPainel();
		this.adicionarPaineis();
		this.adicionarBotoes();
		
	}
	
	public void configurarPainel() {
		
		setLayout(new FlowLayout());
		setPreferredSize(new Dimension(300, 800));
		setBackground(Color.GRAY);
		    }
	
	public void adicionarPaineis() {
		Painel_Lateral_placar placar = new Painel_Lateral_placar();
		add(placar, BorderLayout.SOUTH);
		
		Painel_Lateral_placar_B_A placar_Total = new Painel_Lateral_placar_B_A();
		add(placar_Total, BorderLayout.NORTH);
		
		Painel_Lateral_p_robo placar_robos = new Painel_Lateral_p_robo();
		add(placar_robos, BorderLayout.NORTH);
		
		this.painelSecundario = new Painel_Lateral_Secundario();
		add(painelSecundario, BorderLayout.NORTH);
		
		
	}
		
	public void adicionarBotoes() {
		Dimension tamanho_botao = new Dimension(250, 50);
		Font fonte = new Font(getName(), 20, 20);
		
	//	Botao B_Verificar = new Botao("Verificar", new Color(54,54,54), null);
		B_Verificar.setForeground(Color.WHITE);
		B_Verificar.setPreferredSize(tamanho_botao);
		B_Verificar.setFont(fonte);
		
	//	Botao B_Jogar = new Botao("Próxima Jogada", new Color(54,54,54), null);
		B_Jogar.setForeground(Color.WHITE);
		B_Jogar.setPreferredSize(tamanho_botao);
		B_Jogar.setFont(fonte);
		
	//	Botao B_Sair = new Botao("Sair do Jogo", new Color(54,54,54), null);
		B_Sair.setForeground(Color.WHITE);
		B_Sair.setPreferredSize(tamanho_botao);
		B_Sair.setFont(fonte);
		
		add (B_Verificar);
		add (B_Jogar);
		add (B_Sair);
		
	}
	
	public Botao_robo getB_Verificar() {
		return B_Verificar;
	}
	
	public void setB_Verificar (Botao_robo B_Verificar) {
		this.B_Verificar = B_Verificar;
	}
	
	public Botao_robo getB_Jogar() {
		return B_Jogar;
	}
	
	public void setB_Jogar(Botao_robo B_Jogar) {
		this.B_Jogar = B_Jogar;
	}
	
	public Botao_robo getB_Sair() {
		return B_Sair;
	}
	
	public void setB_Sair(Botao_robo B_Sair) {
		this.B_Sair = B_Sair;
	}

	public Painel_Lateral_Secundario getPainelSecundario() {
		return painelSecundario;
	}

	public void setPainelSecundario(Painel_Lateral_Secundario painelSecundario) {
		this.painelSecundario = painelSecundario;
	}
	


}