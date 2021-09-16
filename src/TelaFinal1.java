import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.sound.sampled.*;
import java.io.*;
import javax.swing.border.TitledBorder;

public class TelaFinal1 extends JFrame{
		JLabel lb1,lb2,lb3,lb4,lb5;
		ImageIcon campo,empate,caixa;
		JButton jogar;
		Clip clip;	
		


	
public TelaFinal1() {
Componentes();
Eventos();

}


public void Componentes() {
	setLayout(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(0,0,788,896);

			
	lb3 = new JLabel("<html>DEFENDEEEEEEEE O GOLEIROOOOOOOOOOOOO , O GOLEIRO DEFENDEU E O JOGO ACABOU 0X0");
	lb3.setBounds(1 , -290 , 800 , 800);
	lb3.setFont(new Font ("Comic Sans MS", Font.BOLD , 17));
	lb3.setForeground(Color.BLACK);
	add(lb3);		
	empate = new ImageIcon("empate.png");			
	lb2 = new JLabel (empate);
	lb2.setBounds(150, 200 ,500 ,400);
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
  	  File soundFile = new File("etabom.wav");
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
	
	 new TelaFinal1().setVisible(true);
	

}
}