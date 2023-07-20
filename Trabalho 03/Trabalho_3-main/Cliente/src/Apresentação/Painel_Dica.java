package Apresentação;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;


public class Painel_Dica extends JPanel{
	
	private JTextField Dica;
	private JButton Enviar;
	private JButton Comparar;
	private JButton PróximaJogada;
	
	public Painel_Dica () {
		super();
		this.Configurar();
	}

	private void Configurar() {
		
		Dimension tamanho_botao = new Dimension(200, 50);
		Color corDeFundo = new Color(108, 69, 40);
		
		setLayout(new FlowLayout());
		setPreferredSize(new Dimension(800, 70));
		setBackground(Color.GRAY);
	    this.setBackground(corDeFundo);
		
		Font fonte_Tip = new Font("Cambria", Font.BOLD, 35);
		JLabel Tip = new JLabel("Dica: ");
		Tip.setForeground(Color.WHITE);
		Tip.setFont(fonte_Tip);
		
		
		Dimension textFieldDimension = new Dimension(350, 50);
		Dica = new JTextField();
		Dica.setPreferredSize(textFieldDimension);
		Font fonte_dica = Dica.getFont();
        Font Nova_fonte_dica = fonte_dica.deriveFont(fonte_dica.getSize() + 10f); 
        Dica.setFont(Nova_fonte_dica);
        
        Color corDeFundoBotão = new Color(45, 26, 11);
		Enviar = new JButton("Enviar Dica", null);
		Enviar.setForeground(Color.WHITE);
		Enviar.setPreferredSize(tamanho_botao);
		Enviar.setBackground(corDeFundoBotão);
		Font fonte_botão = new Font("Arial", Font.BOLD, 25);
		Enviar.setFont(fonte_botão);
		
	
		Comparar = new JButton("Comparar", null);
		Comparar.setForeground(Color.WHITE);
		Comparar.setPreferredSize(tamanho_botao);
		Comparar.setBackground(corDeFundoBotão);
		Comparar.setFont(fonte_botão);
		

		PróximaJogada = new JButton("Próximo", null);
		PróximaJogada.setForeground(Color.WHITE);
		PróximaJogada.setPreferredSize(tamanho_botao);
		PróximaJogada.setBackground(corDeFundoBotão);
		PróximaJogada.setFont(fonte_botão);
		
		
		add(Tip);
		add(Dica);
		add(Enviar);
		add(PróximaJogada);
		add(Comparar);
		
		
	}

	public JButton getComparar() {
		return Comparar;
	}

	public void setComparar(JButton comparar) {
		Comparar = comparar;
	}

	public JButton getPróximaJogada() {
		return PróximaJogada;
	}

	public void setPróximaJogada(JButton próximaJogada) {
		PróximaJogada = próximaJogada;
	}

	public JTextField getDica() {
		return Dica;
	}

	public void setDica(JTextField dica) {
		Dica = dica;
	}

	public JButton getEnviar() {
		return Enviar;
	}

	public void setEnviar(JButton enviar) {
		Enviar = enviar;
	}

	
}
