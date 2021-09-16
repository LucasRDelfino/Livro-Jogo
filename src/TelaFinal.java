import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.sound.sampled.*;
import java.io.*;
import javax.swing.border.TitledBorder;

public class TelaFinal extends JFrame{
		JLabel lb1,lb2,lb3,lb4,lb5;
		ImageIcon campo,troféu,caixa;
		JButton jogar;
		Clip clip;	
		


	
public TelaFinal() {
Componentes();
Eventos();

}


public void Componentes() {
	setLayout(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(0,0,788,896);

	
	
	lb3 = new JLabel("GOOOOOLLLLLLL!!! , Parabéns o seu time fez o gol e o jogo acabou 1x0");
	lb3.setBounds(20 , -300 , 1800 , 800);
	lb3.setFont(new Font ("Comic Sans MS", Font.BOLD , 20));
	lb3.setForeground(Color.BLACK);
	add(lb3);		
	troféu = new ImageIcon("troféu.png");			
	lb2 = new JLabel (troféu);
	lb2.setBounds(175, 200 ,400 ,260);
	add(lb2);	
	caixa = new ImageIcon("caixa.png");			
	lb4 = new JLabel (caixa);
	lb4.setBounds(-20, -30 ,800,300);
	add(lb4);
	
	
	campo = new ImageIcon("campo3.jpg");			
	lb1 = new JLabel (campo);
	lb1.setBounds(0, 0 ,800 ,900);
	add(lb1);
	
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
	
	
    
}



public static void main(String args[]) {
	
	 new TelaFinal().setVisible(true);
	

}
}