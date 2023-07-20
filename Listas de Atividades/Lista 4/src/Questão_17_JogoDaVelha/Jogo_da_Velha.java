package Questão_17_JogoDaVelha;
import java.util.Scanner;

public class Jogo_da_Velha {
	Campo[][] velha  = new Campo [3][3];
	Scanner scan = new Scanner (System.in);

	
	public static void Desenhar_Campos (Campo [][] velha) {
		Limpar();
		
		System.out.println("      [0]        [1]          [2]  ");
		System.out.printf(" [0]   %s  |      %s     |     %s  %n",velha[0][0].getSímbolo(),velha[0][1].getSímbolo(),velha[0][2].getSímbolo());
		System.out.println(" ___________________________________");
		System.out.printf(" [1]   %s  |      %s     |     %s  %n", velha[1][0].getSímbolo(),velha[1][1].getSímbolo(),velha[1][2].getSímbolo());
		System.out.println(" ___________________________________");
		System.out.printf(" [2]   %s  |      %s     |     %s%n%n", velha[2][0].getSímbolo(),velha[2][1].getSímbolo(),velha[2][2].getSímbolo());

	
	
	}
	
	
	public static String VerificarVitória (Campo[][] velha) {

			for(int i=0;i<3;i++){
				if((velha[i][0].getSímbolo()=="X" && velha[i][1].getSímbolo()=="X" && velha[i][2].getSímbolo()=="X")||(velha[i][0].getSímbolo()=="O" && velha[i][1].getSímbolo()=="O" && velha[i][2].getSímbolo()=="O")){
					return velha[i][0].getSímbolo();
				}
			}
			for(int i=0;i<3;i++){
				if((velha[0][i].getSímbolo()=="X" && velha[1][i].getSímbolo()=="X" && velha[2][i].getSímbolo()=="X")||(velha[0][i].getSímbolo()=="O" && velha[1][i].getSímbolo()=="O" && velha[2][i].getSímbolo()=="O")){
					return velha[0][i].getSímbolo();
				}
			}
			if((velha[0][0].getSímbolo()=="X" && velha[1][1].getSímbolo()=="X" && velha[2][2].getSímbolo()=="X")||(velha[0][2].getSímbolo()=="O" && velha[1][1].getSímbolo()=="O" && velha[2][0].getSímbolo()=="O")){
				return velha[0][0].getSímbolo();
			}
			return " ";
		}
	
	
	
	public static void Limpar() {
		for (int count=0;count<200;count++) {
			System.out.println(" ");
		}
	}
	
	public static Boolean VerificarJogada (Campo [][] velha, int linha_coluna[], String Simbolo_atual) {
		if (velha[linha_coluna[0]][linha_coluna[1]].getSímbolo() == " ") {
			velha[linha_coluna[0]][linha_coluna[1]].setSímbolo(Simbolo_atual);
			return true;
		}else {
			return false;
		}
	}
	
	
	public static int[] Jogar (Scanner scan, String Simbolo_Atual) {
		int linha_coluna[]= new int [2];
		
		System.out.printf("%s %s \n", "Vez do Jogador: ",Simbolo_Atual);
		System.out.printf("Informe a Linha: ");
		linha_coluna[0]=scan.nextInt();
		System.out.printf("Informe a Coluna: ");
		linha_coluna[1]=scan.nextInt();
		return linha_coluna;
	}
	
	
	public static void Iniciar_Jogo(Campo [][] velha) {
		for (int l= 0 ; l<3;l++) {
			for (int c=0;c<3;c++) {
				velha [l][c] = new Campo();
			}
		}
	}
}

