package Apresentação;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import Apresentação.*;
import Menu.Gerenciador;

import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Screen extends JFrame {
	private Gerenciador gerenciador;
	private Tabuleiro tabuleiro;
	private JFrame jogo;
	private Painel_Lateral_Secundario robo_selecionado;
	private Painel_Lateral_placar_B_A placar_BxA;
	private Painel_Lateral_placar placar_geral;
	private Painel_Lateral painel_lateral;
	private Painel_Topo topo;
	private Screen tela;
	
	
	  public Screen() {
	        super();
	        this.configurarFrame();
	        this.Adicionar_Paineis();
	        setVisible(true);

	    }
	  
	  public void configurarFrame(){
	        this.setTitle("O Regaste dos Alunos na Ilha de Java");
	        this.setSize(new Dimension(1100,800));
	        this.setLayout(new BorderLayout());
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    }
	  
	  public void Adicionar_Paineis(){
		  
		 	Painel_Topo painel_topo = new Painel_Topo();
	        getContentPane().add(painel_topo, BorderLayout.NORTH);
	        
	       
	        Painel_Lateral painel_lateral = new Painel_Lateral();
	        getContentPane().add(painel_lateral, BorderLayout.EAST);
	        painel_lateral.setVisible(false);
	        
			Tabuleiro tabuleiro = new Tabuleiro ();
			add(tabuleiro, BorderLayout.CENTER);
			tabuleiro.setVisible(false);
			
			
			Painel_Lateral_Secundario robo_selecionado = new Painel_Lateral_Secundario();
		  	Painel_Lateral_placar_B_A placar_BxA = new Painel_Lateral_placar_B_A();
			
			gerenciador = new Gerenciador(this, painel_topo, painel_lateral,tabuleiro,robo_selecionado, placar_BxA);
			gerenciador.Prepara_botao(tabuleiro);
			gerenciador.povoar(tabuleiro);
	  }
	  
}
