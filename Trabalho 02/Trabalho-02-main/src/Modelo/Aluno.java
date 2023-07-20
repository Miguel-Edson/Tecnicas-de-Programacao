package Modelo;

import Apresentação.Icone;

public class Aluno implements Elemento{
	
		Icone icone_aluno = new Icone("icone_aluno.png",60,80);

		@Override
		public int getType() {
			return 1;
		}
		
		
		public Icone getIcone () {
			return icone_aluno;
		}
		public void setIcone (Icone icone) {
			this.icone_aluno = icone;
		}
	
	}
