package Apresentação;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Painel_Topo extends JPanel  {
	
//	private static final long serialVersionUID = 1L;
	private JTextField nomeJogador;
	private JButton botaoJogar;
	private JButton botaoRelatorio;

	public Painel_Topo() {
		setLayout(new FlowLayout());
		setPreferredSize(new Dimension(900, 60));
		setBackground(Color.GRAY);
		

		JLabel nomeUsuario = new JLabel("Nome do Jogador: ");
		nomeUsuario.setForeground(Color.WHITE);
		
		nomeJogador = new JTextField();
		Dimension textFieldDimension = new Dimension(200, 30);
		nomeJogador.setPreferredSize(textFieldDimension);
        
		botaoJogar = new Botao_robo("Jogar", new Color(54,54,54), null);
		botaoJogar.setForeground(Color.WHITE);
		Dimension tamanho_botao = new Dimension(130, 30);
		
		botaoJogar.setPreferredSize(tamanho_botao);
		botaoRelatorio = new Botao_robo("Gerar Relatório", new Color(54,54,54), null);
		botaoRelatorio.setPreferredSize(tamanho_botao);
		botaoRelatorio.setForeground(Color.WHITE);
		
		add(nomeUsuario);
		add(nomeJogador);
		add(botaoJogar);
		add(botaoRelatorio);
		
		nomeJogador.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String nome = nomeJogador.getText().trim();
				if (!nome.isEmpty())
					botaoJogar.setEnabled(true);
			}
		});
	}

	public JTextField getNomeJogador() {
		return nomeJogador;
	}

	public void setNomeJogador(JTextField nomeJogador) {
		this.nomeJogador = nomeJogador;
	}

	public JButton getBotaoJogar() {
		return botaoJogar;
	}

	public void setBotaoJogar(JButton botaoJogar) {
		this.botaoJogar = botaoJogar;
	}

	public JButton getBotaoRelatorio() {
		return botaoRelatorio;
	}

	public void setBotaoRelatorio(JButton botaoRelatorio) {
		this.botaoRelatorio = botaoRelatorio;
	}
	
	
	
	
}
