import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.sound.sampled.*;
import java.io.*;
import java.awt.Insets;



public class Jogo extends JFrame{
	JLabel lb1,lb2,lb3,lb4;
	ImageIcon campo,jogador;
	JButton jogar;
	Clip clip;

	
	public Jogo() {
		Componentes();
		Eventos();
	}
	
	
	public void Componentes() {
		setLayout(null);
		new Tela1 ().setVisible(false);
		
		
		//Titulo
		lb1 = new JLabel("NEW ");
		lb1.setBounds(110,10,100,50);
        lb1.setFont( new Font("Lucida Bright Demibold", Font.BOLD, 35) );
        lb1.setForeground(Color.BLUE);
		add(lb1);
		lb2 = new JLabel("MANAGER ");
		lb2.setBounds(215,10,400,50);
        lb2.setFont( new Font("Lucida Bright Demibold", Font.BOLD, 35) );
        lb2.setForeground(Color.RED);
		add(lb2);
	
		
		
		 
		 //Botão Inicial
		 jogar = new JButton ("Jogar");
		 jogar.setBounds(360,235,110,30);
		 jogar.setFont(new Font("Ravie", 1, 18));
	     jogar.setBackground(Color.RED);
	     jogar.setFocusable(false);
		 add(jogar);
			
		
		
		
		//Fundo Tela de Inicio
		jogador = new ImageIcon("jogador.png");			
		lb4 = new JLabel (jogador);
		lb4.setBounds(150, 50 ,175 ,247);
		add(lb4);
		campo = new ImageIcon("campo.jpg");			
		lb3 = new JLabel (campo);
		lb3.setBounds(0, 0 ,500 ,300);
		add(lb3);
		
		
		
	    //Tocar Música 
	    try {
	    	  File soundFile = new File("som.wav");
	           AudioInputStream sound = AudioSystem.getAudioInputStream(soundFile);
	           DataLine.Info info = new DataLine.Info(Clip.class, sound.getFormat());
	           clip = (Clip) AudioSystem.getLine(info);
	           clip.open(sound);
	           clip.start();
	        } catch (Exception e) {
	            JOptionPane.showMessageDialog(this, e);
	        }
        
	} 
	    
	public void Eventos() {
		jogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 //Muda de Tela
				  new Tela1 ().setVisible(true);
				  setVisible(false);
				  clip.stop();
			}
		});
	    
	}
		


		
	



public static void main(String args[]) {
	
	 Jogo frame = new Jogo();
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 frame.setBounds(0,0,500,330);
	 frame.setVisible(true);
	
}
}

