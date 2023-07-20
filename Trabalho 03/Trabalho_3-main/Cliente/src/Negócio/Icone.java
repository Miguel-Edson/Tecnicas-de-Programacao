package Negócio;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Icone extends ImageIcon {
	private int largura;
	private int altura;

	public Icone(String string, int largura, int altura) {
		super(string);
		this.largura = largura;
		this.altura = altura;
		redimensionar();
		System.out.println("aqui2");
	}

	private void redimensionar() {
		Image original = getImage();
		Image redimensionada = original.getScaledInstance(largura, altura, Image.SCALE_SMOOTH);
		setImage(redimensionada);

	}

}
