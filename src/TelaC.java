import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.sound.sampled.*;
import java.io.*;


public class TelaC extends JFrame{
		JLabel lb1,lb2,lb3,lb4,lb5;
		ImageIcon campo;
		JButton jogar;
		Clip clip;
		
public TelaC() {
	Componentes();
	Eventos();

}

public void Componentes() {
	setLayout(null);
	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(0,0,788,896);
	
	jogar = new JButton ("Jogar");
	jogar.setBounds(100,820,110,30);
	jogar.setFont(new Font("Ravie", 1, 18));
    jogar.setBackground(Color.RED);
    jogar.setFocusable(false);
	add(jogar);
		
	campo = new ImageIcon("carregamento.jpg");			
	lb1 = new JLabel (campo);
	lb1.setBounds(0, 0 ,788 ,896);
	add(lb1);
	
	try {
		File soundFile = new File("vi.wav");
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
			  new Tela1().setVisible(true);				
			  setVisible(false);
			  clip.stop();
			  
	}
	});

	
}






public static void main(String args[]) {
	
	 new TelaC().setVisible(true);
	

}	
}

	
		
		
	  

