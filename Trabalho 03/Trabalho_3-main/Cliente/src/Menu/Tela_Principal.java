package Menu;

import Apresentação.*;
import Menu.*;
import Negócio.*;
import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Dimension;

import Negócio.*;
import java.awt.Color;

public class Tela_Principal extends JFrame  {
	private Carta carta;
	private Gerenciador gerenciador;
	
	
	public Tela_Principal() {
	        super();
	        this.configurarFrame();
	        this.Adicionar_Paineis();
	        setVisible(true);
	    }
	
	public void configurarFrame(){
        this.setTitle("Uma dica X Uma Carta");
        this.setSize(new Dimension(1100, 500));
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
	
	public void Adicionar_Paineis(){
		carta = new Carta();
		 Painel_Infomações painel_info = new Painel_Infomações();
		 getContentPane().add(painel_info, BorderLayout.NORTH);	
		 painel_info.setVisible(true);
		 
		 Painel_Cartas painel_cartas = new Painel_Cartas(carta);
		 getContentPane().add(painel_cartas, BorderLayout.CENTER);	
		 painel_cartas.setVisible(true);
		 
		 
		 Painel_Dica painel_dica = new Painel_Dica();
		 getContentPane().add(painel_dica, BorderLayout.SOUTH);	
		 painel_dica.setVisible(true);
		 
		 
		 
		 
		 gerenciador = new Gerenciador (this, painel_info, painel_cartas, painel_dica, carta);
	}
	
  


}

