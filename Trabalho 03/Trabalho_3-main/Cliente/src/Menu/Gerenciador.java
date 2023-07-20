package Menu;

import javax.swing.JOptionPane;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import Apresentação.Painel_Cartas;
import Apresentação.Painel_Dica;
import Apresentação.Painel_Infomações;
import Negócio.*;

public class Gerenciador {
	
	private JFrame tela_principal;
	private Painel_Infomações painel_informações;
	private Painel_Cartas painel_cartas;
	private Painel_Dica painel_dicas;
	private Carta carta;
	
	
	public Gerenciador (JFrame tela_principal, Painel_Infomações painel_informações, 
							Painel_Cartas painel_cartas, Painel_Dica painel_dicas, Carta carta) {
		
		this.tela_principal = tela_principal;
		this.painel_informações = painel_informações;
		this.painel_cartas = painel_cartas;
		this.painel_dicas = painel_dicas;
		
		
		
		painel_dicas.getEnviar().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	ColocarDica();	
            }
        });		
	
	
		painel_dicas.getPróximaJogada().addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	JOptionPane.showConfirmDialog(null, "Voce é o Jogador novo?");   
	        	painel_cartas.removerCartasSelecionadas();
	        	painel_cartas.sortearNovasCartas();
	        	
	        }
	    });		
	
	
	painel_dicas.getComparar().addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        	System.out.println("eu funciono");
        	
        	//carta.Expor_Selecionadas();
        //	painel_cartas.Expor_Selecionadas();
        	carta.Expor_Selecionadas();
        }
    });		
}
	
	public void ColocarDica () {
		 String dicaDigitada = painel_dicas.getDica().getText();
         System.out.println("Dica enviada: " + dicaDigitada);
         painel_dicas.getDica().setText("");         
         painel_informações.getRodada().setText("Dica Recebida:");
         painel_informações.getInformação().setText(dicaDigitada);    
    //   setCarta(painel_cartas.getCarta().getCarta_selecionada());  
    //   System.out.println("carta enviada como selecionada: " + carta.carta_selecionada.getId() ;
         
        
	}


	
	public Carta getCarta() {
		return carta;
	}



	public void setCarta(Carta carta) {
		this.carta = carta;
	}



}
