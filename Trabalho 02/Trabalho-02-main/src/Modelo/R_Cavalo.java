package Modelo;

import javax.swing.ImageIcon;

import Apresentação.Icone;

public class R_Cavalo extends Robo{
	private ImageIcon icone_robo;
	public R_Cavalo () {
		super();
		this.nome = "Cavalo";
		this.setIcone(new Icone("cavalo2.png", 40, 80));
	
	}
	
	
}
