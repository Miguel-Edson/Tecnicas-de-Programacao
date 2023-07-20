package Apresentação;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Painel_Lateral_placar_B_A extends JPanel  {
	int Quant_Aluno = 0;
	int Quant_Bug = 0;
	
public Painel_Lateral_placar_B_A () {
	super();
	setLayout(new FlowLayout(FlowLayout.LEFT));
	setPreferredSize(new Dimension(300, 120));
	setBackground(Color.GRAY);
	this.adicionar_placar();
}

public void adicionar_placar () {
	
	JLabel Total = new JLabel("Pontuação: ");
	add(Total);
	
	ImageIcon P_aluno = new ImageIcon ("icone_aluno.png");
	P_aluno.setImage(P_aluno.getImage().getScaledInstance(30, 50, Image.SCALE_SMOOTH));
	JLabel imagem_Aluno= new JLabel(P_aluno);
	JLabel pontuacao_Aluno = new JLabel(String.valueOf(this.Quant_Aluno)+"  X ");
	add (imagem_Aluno);
	add (pontuacao_Aluno);
	
	ImageIcon P_Bug = new ImageIcon ("icone_bug2.png");
	P_Bug.setImage(P_Bug.getImage().getScaledInstance(40, 50, Image.SCALE_SMOOTH));
	JLabel imagem_Bug= new JLabel(P_Bug);
	JLabel pontuacao_Bug = new JLabel(String.valueOf(this.Quant_Bug));
	add (imagem_Bug);
	add (pontuacao_Bug);
}

public int getQuant_Aluno() {
	return Quant_Aluno;
}

public void setQuant_Aluno(int quant_Aluno) {
	Quant_Aluno = quant_Aluno;
}

public int getQuant_Bug() {
	return Quant_Bug;
}

public void setQuant_Bug(int quant_Bug) {
	Quant_Bug = quant_Bug;
}


public void Achar_Bug () {
	this.Quant_Bug += 1;
}

public void Achar_Aluno () {
	this.Quant_Aluno += 1;
}


}
