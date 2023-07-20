package Apresentação;

import Apresentação.*;
import Menu.*;
import Negócio.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class Entrada extends JFrame  {

	private JButton Iniciar;
	private JButton Sair;
	private JPanel Botoes;
	
	public Entrada() {
	        super();
	        this.configurarFrame();
	        this.Adicionar_Paineis();
	        setVisible(true);
	    }
	
	public void configurarFrame(){
        this.setTitle("Uma dica X Uma Carta");
        this.setSize(new Dimension(500, 500));
        setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
//        Botoes = new JPanel();
//        Botoes.setSize(220,200);
//        
//    	Botoes.add(Iniciar);
//    	getContentPane().add(Botoes, BorderLayout.NORTH);	
//    	Botoes.setVisible(true);
    }
	

	
	public void Adicionar_Paineis(){
		
		Dimension tamanho_botao = new Dimension(200, 50);
		Color corDeFundo = new Color(108, 69, 40);
		Font fonte_botão = new Font("Arial", Font.BOLD, 25);
		Color corDeFundoBotão = new Color(45, 26, 11);
		
		Iniciar = new JButton("Iniciar", null);
		Iniciar.setForeground(Color.WHITE);
		Iniciar.setPreferredSize(tamanho_botao);
		Iniciar.setBackground(corDeFundoBotão);
		Iniciar.setFont(fonte_botão);
		
		
		Iniciar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	dispose();
            	Tela_Principal tela_principal = new Tela_Principal();
        		tela_principal.setVisible(true);
            	
            }
        });		
		

		Sair = new JButton("Próximo", null);
		Sair.setForeground(Color.WHITE);
		Sair.setPreferredSize(tamanho_botao);
		Sair.setBackground(corDeFundoBotão);
		Sair.setFont(fonte_botão);
		
		
		add(Iniciar);
		add(Sair);
	}
	
  


}

