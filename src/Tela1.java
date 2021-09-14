import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.sound.sampled.*;
import java.io.*;



public class Tela1 extends JFrame{
	JLabel lb1,lb2,lb3;
	ImageIcon jogada1,jogador;
	JButton bt1,bt2;

	
	
	
 public Tela1() {
	Componentes();
	Eventos();
}

public void Componentes() {
	setBounds(0, 0, 900, 700);
	setLayout(null);
	lb1 = new JLabel("O jogo entre R27 X Dinossauros Fc aconteceu nesta tarde de sábado as 16:30 no estádio do água santa, o jogo começou a bola chegou até vc! ");
	lb1.setBounds(20,20,900,20);
   	add(lb1);
   	jogada1 = new ImageIcon("jogada1.jpg");			
	lb2 = new JLabel (jogada1);
	lb2.setBounds(50, 50 ,800 ,400);
	add(lb2);
	
	
}


public void Eventos() {
}
public static void main(String args[]) {
	
	 Tela1 frame = new Tela1();
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 frame.setVisible(true);
	
}
	
	
}