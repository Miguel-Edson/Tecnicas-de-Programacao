package Modelo;

import Apresentação.Icone;

public class Bug implements Elemento {

	Icone icone_bug = new Icone("icone_bug2.png",70,70);

	
	@Override
	public int getType() {
		
		return 2;
	}
	
	public Icone getIcone () {
		return icone_bug;
	}
	public void setIcone (Icone icone) {
		this.icone_bug = icone;
	}


	
	
	
}
