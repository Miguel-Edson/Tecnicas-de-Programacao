package Negócio;

import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.*;
import java.util.ArrayList;

public class Carta extends JPanel  {
	
	private int id;
	private Icone icone;
	private static Carta carta_selecionada;
	public ArrayList<Carta> cartasSelecionadas_2 = new ArrayList<>();
	
	public Carta getCarta_selecionada() {
		return carta_selecionada;
	}
	public void setCarta_selecionada(Carta carta_selecionada) {
		this.carta_selecionada = carta_selecionada;
	}
	
	public int getId() {
		return id;
	}
	public ArrayList<Carta> getCartasSelecionadas_2() {
		return cartasSelecionadas_2;
	}
	public void setCartasSelecionadas_2(ArrayList<Carta> cartasSelecionadas_2) {
		this.cartasSelecionadas_2 = cartasSelecionadas_2;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Icone getIcone() {
		return icone;
	}
	public void setIcone(Icone icone) {
		this.icone = icone;
	}
	
	
	public Carta () {
		super();
		id = 0;
		setLayout(new FlowLayout());
		configurar_carta(id);
					
	}
	
	public Carta (int id) {
		super();
		this.id = id;
		setLayout(new FlowLayout());
		configurar_carta(id);
		Color corDeFundo = new Color(197, 156, 100);
        this.setBackground(corDeFundo);
	}

	private void configurar_carta(int id) {
		
		String Nome_Carta = "carta";
		String png = ".png";
		String Numero_Carta = String.valueOf(id);
		String Nome_Final = (Nome_Carta.concat( Numero_Carta ));
		Nome_Final = Nome_Final.concat(png);
		System.out.println(Nome_Final);
		
		
		Border borda = BorderFactory.createLineBorder(Color.BLACK);
		ImageIcon Carta = new ImageIcon (Nome_Final);
		Carta.setImage(Carta.getImage().getScaledInstance(150, 250, Image.SCALE_SMOOTH));
		JLabel icone_carta = new JLabel(Carta);
		icone_carta.setBorder(borda);

		add (icone_carta);
		
		
		
		
		this.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		        int numero = 1;
		        System.out.println("Carta " + id + " foi clicada!");

		        carta_selecionada = new Carta(id);
		        cartasSelecionadas_2.add(carta_selecionada);
		        System.out.println(cartasSelecionadas_2.size());
		        System.out.println("Id da nova carta criada: " + carta_selecionada.getId());  
		      
		    }
		});

		
}
	public void Expor_Selecionadas() {
		System.out.println("cheguei"+cartasSelecionadas_2.size());
	    
//		for (int i = 0; i < cartasSelecionadas_2.size(); i++) {
//	    	
//	        Carta cartaSelecionadaarray= cartasSelecionadas_2.get(i);
//	        painel.add(cartaSelecionadaarray);
//	        int id = cartaSelecionadaarray.getId();
//	        System.out.println("Carta selecionada - ID: " + id);
//	   
//		}
		
		for (Carta carta: cartasSelecionadas_2) {
			System.out.println("cheguei 2");
			System.out.println(carta.getId());
		}
	}
	
	
	
	
}