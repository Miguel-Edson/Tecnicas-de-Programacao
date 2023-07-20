package Apresentação;


import java.awt.Dimension;
import java.awt.Graphics;
import Apresentação.*;
import javax.swing.Icon;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.UIManager;

public class Botao_robo_secundario extends JButton {

private int id;
	
    public Botao_robo_secundario(Icon icon, int id) {
    	this.id = id;
        setIcon(icon);
        setBorderPainted(false);
        setContentAreaFilled(false);
        setOpaque(false);
        setFocusPainted(false);
        setPreferredSize(new Dimension(30, 30)); 
    }


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
