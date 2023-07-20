package Apresentação;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Painel_Infomações extends JPanel{
	
	private JLabel Informação;
	private JLabel Rodada;

	public Painel_Infomações () {
	setLayout(new FlowLayout());
	setPreferredSize(new Dimension(800, 50));
	setBackground(Color.GRAY);
	Color corDeFundo = new Color(108, 69, 40);
    this.setBackground(corDeFundo);
	

	Font fonte_Tip = new Font("Cambria", Font.BOLD, 25);
	Rodada = new JLabel("Rodada da Vez: ");
	Informação = new JLabel();
	Informação.setText("O Jogador está escolhendo a Carta da Rodada");
	
	
	Rodada.setForeground(Color.WHITE);
	Rodada.setFont(fonte_Tip);

	Informação.setForeground(Color.WHITE);
	Informação.setFont(fonte_Tip);
	
	
	add(Rodada);
	add(Informação);
}

	

	public JLabel getRodada() {
		return Rodada;
	}

	public void setRodada(JLabel rodada) {
		Rodada = rodada;
	}
	
	public JLabel getInformação() {
		return Informação;
	}

	public void setInformação(JLabel informação) {
		informação = Informação;
	}

}
