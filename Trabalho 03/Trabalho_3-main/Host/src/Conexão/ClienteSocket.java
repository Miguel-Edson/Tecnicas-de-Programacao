package Conexão;

import Negócio.*;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class ClienteSocket {
	private PrintWriter escritor;
	private Scanner leitor;
	
	public ClienteSocket(Socket socket) {
		
		try {
			OutputStream saida = socket.getOutputStream();
			this.escritor = new PrintWriter(saida, true);
			
			InputStream entrada = socket.getInputStream();
			this.leitor = new Scanner(new InputStreamReader(entrada));
						
		} catch (Exception error) {
			error.printStackTrace();
		}
		
	}
	
	public void enviarMensagem(Eventos evento, ArrayList<String> dados) {
		this.escritor.write((new Mensagem(evento, dados)).toString());
	}
	
	public void enviarMensagem(Eventos evento) {
		this.escritor.write((new Mensagem(evento)).toString());
	}
	
	public Mensagem receberMensagem() {
		if (!this.leitor.hasNextLine()) {
			return null;
		}
		
		Eventos evento = Eventos.valueOf(this.leitor.nextLine());
		
		ArrayList<String> dados = new ArrayList<String>();
		
 		while (this.leitor.hasNextLine()) {
			dados.add(this.leitor.nextLine());
		}
		
		return new Mensagem(evento, dados);
	}
	
}