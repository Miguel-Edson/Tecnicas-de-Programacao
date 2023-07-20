package Modelo;

import Apresentação.Icone;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Apresentação.*;

public class R_Bispo extends Robo{
	private ImageIcon icone_robo;
	public R_Bispo () {
		super();
		this.nome = "Bispo";
		this.setIcone(new Icone("bispo.png", 40, 80));
	}
	
	
}
