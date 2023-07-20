package Apresentação;

import java.awt.Color;
import javax.swing.Icon;
import javax.swing.JButton;


public class Botao_robo extends JButton{
	
	public Botao_robo(String txt, Color color, Icon icon) {
		setText(txt);
		setBackground(color);
		setBorderPainted(false);
		setIcon(icon);
		
		
	}
	

}