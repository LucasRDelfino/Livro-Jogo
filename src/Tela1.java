import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.sound.sampled.*;
import java.io.*;
import javax.swing.border.TitledBorder;


public class Tela1 extends JFrame{
	JLabel lb1,lb2,lb3,lb4,lb5;
	ImageIcon jogada1,jogador,caixa;
	JButton bt1,bt2;

	
	
	
 public Tela1() {
	Componentes();
	Eventos();
}

public void Componentes() {
	setBounds(0, 0, 900, 700);
	setLayout(null);
	lb1 = new JLabel("O jogo entre R27 X Dinossauros Fc aconteceu nesta tarde de sábado as 16:30 no estádio do água santa, o jogo começou a bola chegou até vc! ");
	lb1.setBounds(20,40,900,20);
	lb1.setForeground(Color.white);
   	add(lb1);
   	jogada1 = new ImageIcon("jogada.jpg");			
	lb2 = new JLabel (jogada1);
	lb2.setBounds(230, 100 ,400 ,450);
	add(lb2);
	lb3 = new JLabel("Tocar no seu companheiro mais próximo ");
	lb3.setBounds(15,520,400,20);
   	add(lb3);
   	lb4 = new JLabel(" Lançar a bola para o outro lado do campo ");
	lb4.setBounds(600,520,600,20);
   	add(lb4);
   	caixa = new ImageIcon ("caixa.png");
   	lb5 = new JLabel (caixa);
   	lb5.setBounds(1, 1, 900, 200);
   	add(lb5);
	getContentPane().setBackground(Color.white);
    
	
	
}


public void Eventos() {
}
public static void main(String args[]) {
	
	 Tela1 frame = new Tela1();
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 frame.setVisible(true);
	
}
	
	
}