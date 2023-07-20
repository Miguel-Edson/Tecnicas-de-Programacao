package Questão_17_JogoDaVelha;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Campo[][] velha  = new Campo [3][3];
		String Simbolo_atual = "X";
		boolean game = true;
		String Vitória = " ";
		Scanner scan = new Scanner (System.in);
		
		Jogo_da_Velha.Iniciar_Jogo(velha);
		
		
		
		
		while (game) {
		
		Vitória = Jogo_da_Velha.VerificarVitória(velha);
		Jogo_da_Velha.Desenhar_Campos(velha);
		
			if(!Vitória.equals(" ")) {
				if(Simbolo_atual == "X") {
					Simbolo_atual= "O";
				}else {
					Simbolo_atual= "X";
				}
				System.out.printf("Jogador %s Venceu %n", Simbolo_atual);
				game=false;
			}else 
					if(Jogo_da_Velha.VerificarJogada(velha,Jogo_da_Velha.Jogar(scan, Simbolo_atual), Simbolo_atual)) {
						if(Simbolo_atual == "X") {
							Simbolo_atual= "O";
						}else {
							Simbolo_atual= "X";
						}
					}
		}
		System.out.println("Fim de Jogo!");
}

}
