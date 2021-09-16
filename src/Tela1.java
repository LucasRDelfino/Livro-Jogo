import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.sound.sampled.*;
import java.io.*;
import javax.swing.border.TitledBorder;


public class Tela1 extends JFrame{
	JLabel lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8,lb9,lb10,lb11,lb12,lb13,lb14,lb15,lb16,lb17,lb18,lb19,lb20,lb21,lb22,lb23,lb24,lb25,lb26,lb27,lb28,lb29,lb30,lb31,lb32,lb33,lb34,lb35,lb36,lb37,lb38,lb39,lb40,lb41,lb42,lb43;
	ImageIcon jogada1,jogador,caixa,jogada2,jogada3,jogada4,jogada5,jogada6,campo,caixa2,caixa3,setae,setad,jogada7,jogada8;
	JButton bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11,bt12,bt13,bt14,bt15,bt16,bt17,bt18,bt19,bt20,bt21,bt22,bt23,bt24,br25,bt26;

	
	
	
 public Tela1() {
	Componentes();
	Eventos();
}

public void Componentes() {

	setBounds(0, 0, 900, 900);
	setLayout(null);
	
	
	//Condição1
	lb1 = new JLabel("O jogo entre PSG X Manchester United aconteceu nesta tarde de sábado as 16:30 no estádio do água santa, o jogo começou a bola chegou até vc! ");
	lb1.setBounds(20,40,900,20);
	lb1.setFont(new Font ("Comic Sans MS", Font.BOLD , 12));
   	add(lb1);
   	jogada1 = new ImageIcon("jogada1.jpg");			
	lb2 = new JLabel (jogada1);
	lb2.setBounds(230, 120 ,400 ,450);
	add(lb2);
	lb3 = new JLabel("Tocar no seu companheiro mais próximo ");
	lb3.setBounds(35,610,250,20);
	lb3.setFont(new Font ("Comic Sans MS", Font.BOLD , 12));
   	add(lb3);
   	lb4 = new JLabel(" Lançar a bola para o outro lado do campo ");
	lb4.setBounds(600,620,600,20);
	lb4.setFont(new Font ("Comic Sans MS", Font.BOLD , 12));
	add(lb4);
   	setae = new ImageIcon ("setae.jpg");
    bt3 = new JButton(setae);
   	bt3.setBounds(90, 700 ,100 ,100);
   	add(bt3);
	setad = new ImageIcon ("setad.jpg");
    bt4 = new JButton(setad);
    bt4 = new JButton(setad);
   	bt4.setBounds(680, 700 ,100 ,100);
   	add(bt4);
   	
   	
	//Condição1CaminhoA
	lb5 = new JLabel("A bola chegou até seu companheiro , mas próximo o Jogador dominou a bola e tem 2 Opções ");
	lb5.setBounds(40,45,900,20);
	lb5.setFont(new Font ("Comic Sans MS", Font.BOLD , 12));
   	add(lb5);
   	jogada2 = new ImageIcon("jogada2.jpg");			
	lb6 = new JLabel (jogada2);
	lb6.setBounds(230, 120 ,400 ,450);
	add(lb6);
	lb7 = new JLabel("Lançar a bola para o  companheiro mais próximo ");
	lb7.setBounds(35,610,300,20);
	lb7.setFont(new Font ("Comic Sans MS", Font.BOLD , 12));
   	add(lb7);
   	lb8 = new JLabel("Lançar uma bola bem longa na área ");
	lb8.setBounds(600,620,250,20);
	lb8.setFont(new Font ("Comic Sans MS", Font.BOLD , 12));
   	add(lb8);
	setae = new ImageIcon ("setae.jpg");
    bt5 = new JButton(setae);
   	bt5.setBounds(90, 700 ,100 ,100);
   	add(bt5);
	setad = new ImageIcon ("setad.jpg");
    bt6 = new JButton(setad);
    bt6 = new JButton(setad);
   	bt6.setBounds(680, 700 ,100 ,100);
   	add(bt6);
   	
   	
   	
   	
   	
  //Condição1Caminhob
  	lb9 = new JLabel("A bola  foi lançada na área mas o jogador do Manchester tirou , cobrou o lateral e você tem duas opções ");
  	lb9.setBounds(40,45,900,20);
  	lb9.setFont(new Font ("Comic Sans MS", Font.BOLD , 12));
  	add(lb9);
    jogada3 = new ImageIcon("jogada3.jpg");			
  	lb10 = new JLabel (jogada3);
  	lb10.setBounds(230, 120 ,400 ,450);
  	add(lb10);
  	lb11 = new JLabel("Voltar o Jogo para o zagueiro.");
  	lb11.setBounds(35,610,400,20);
  	lb11.setFont(new Font ("Comic Sans MS", Font.BOLD , 12));
    add(lb11);
    lb12 = new JLabel(" Cruzar a bola na área. ");
  	lb12.setBounds(600,620,600,20);
  	lb12.setFont(new Font ("Comic Sans MS", Font.BOLD , 12));
    add(lb12);
	setae = new ImageIcon ("setae.jpg");
    bt7 = new JButton(setae);
   	bt7.setBounds(90, 700 ,100 ,100);
   	add(bt7);
	setad = new ImageIcon ("setad.jpg");
    bt8 = new JButton(setad);
    bt8 = new JButton(setad);
   	bt8.setBounds(680, 700 ,100 ,100);
   	add(bt8);
    
    
    //Condição2A
    lb13 = new JLabel("Seu companheiro dominou o jogo ele pode : ");
  	lb13.setBounds(40,45,900,20);
  	lb13.setFont(new Font ("Comic Sans MS", Font.BOLD , 12));
  	add(lb13);
    jogada4 = new ImageIcon("jogada4.jpg");			
  	lb14 = new JLabel (jogada4);
  	lb14.setBounds(230,120 ,400 ,450);
  	add(lb14);
  	lb15 = new JLabel("Voltar o jogo para o zagueiro ");
  	lb15.setBounds(80,610,400,20);
  	lb15.setFont(new Font ("Comic Sans MS", Font.BOLD , 12));
    add(lb15);
    lb16 = new JLabel(" Cruzar a bola na área para o companheiro ");
  	lb16.setBounds(590,620,600,20);
  	lb16.setFont(new Font ("Comic Sans MS", Font.BOLD , 12));
    add(lb16);
	setae = new ImageIcon ("setae.jpg");
    bt9 = new JButton(setae);
   	bt9.setBounds(90, 700 ,100 ,100);
   	add(bt9);
	setad = new ImageIcon ("setad.jpg");
    bt10 = new JButton(setad);
    bt10 = new JButton(setad);
   	bt10.setBounds(680, 700 ,100 ,100);
   	add(bt10);
    
    
    
    //Condição2B
    lb17 = new JLabel("O jogo virou para o outro lado e tem poucas opções de jogo ");
  	lb17.setBounds(40,45,900,20);
  	lb17.setFont(new Font ("Comic Sans MS", Font.BOLD , 12));
  	add(lb17);
    jogada5 = new ImageIcon("jogada5.jpg");			
  	lb18 = new JLabel (jogada5);
  	lb18.setBounds(230, 120 ,400 ,450);
  	add(lb18);
  	lb19 = new JLabel("Jogar uma bola rasteira na área.  ");
  	lb19.setBounds(35,610,400,20);
  	lb19.setFont(new Font ("Comic Sans MS", Font.BOLD , 12));
    add(lb19);
    lb20 = new JLabel(" Lançar na área do adversários. ");
  	lb20.setBounds(600,620,600,20);
  	lb20.setFont(new Font ("Comic Sans MS", Font.BOLD , 12));
    add(lb20);
	setae = new ImageIcon ("setae.jpg");
    bt11 = new JButton(setae);
   	bt11.setBounds(90, 700 ,100 ,100);
   	add(bt11);
	setad = new ImageIcon ("setad.jpg");
    bt12 = new JButton(setad);
    bt12 = new JButton(setad);
   	bt12.setBounds(680, 700 ,100 ,100);
   	add(bt12);
    
    
    //Condição3A
    lb21 = new JLabel("Seu jogador se posicionou para virar uma bicicleta, vc esta no ar ");
  	lb21.setBounds(40,45,900,20);
  	lb21.setFont(new Font ("Comic Sans MS", Font.BOLD , 12));
     add(lb21);
    jogada6 = new ImageIcon("jogada6.jpg");			
  	lb22 = new JLabel (jogada6);
  	lb22.setBounds(230, 120 ,400 ,450);
  	add(lb22);
  	lb23 = new JLabel("Chutar no canto inferior esquerdo ");
  	lb23.setBounds(35,610 ,400,20);
  	lb23.setFont(new Font ("Comic Sans MS", Font.BOLD , 12));
    add(lb23);
    lb24 = new JLabel("Chutar no canto inferior Direito");
  	lb24.setBounds(600,620,600,20);
  	lb24.setFont(new Font ("Comic Sans MS", Font.BOLD , 12));
    add(lb24);
	setae = new ImageIcon ("setae.jpg");
    bt13 = new JButton(setae);
   	bt13.setBounds(90, 700 ,100 ,100);
   	add(bt13);
	setad = new ImageIcon ("setad.jpg");
    bt14 = new JButton(setad);
    bt14 = new JButton(setad);
   	bt14.setBounds(680, 700 ,100 ,100);
   	add(bt14);
   	
   	
   	
    lb32 = new JLabel("O jogador está de cara pro gol ");
  	lb32.setBounds(40,45,900,20);
  	lb32.setFont(new Font ("Comic Sans MS", Font.BOLD , 12));
     add(lb32);
    jogada7 = new ImageIcon("jogada7.jpg");			
  	lb33 = new JLabel (jogada7);
  	lb33.setBounds(230, 120 ,400 ,450);
  	add(lb33);
  	lb34 = new JLabel("Chutar no canto inferior esquerdo ");
  	lb34.setBounds(35,610 ,400,20);
  	lb34.setFont(new Font ("Comic Sans MS", Font.BOLD , 12));
    add(lb34);
    lb35 = new JLabel("Chutar no canto inferior Direito");
  	lb35.setBounds(600,620,600,20);
  	lb35.setFont(new Font ("Comic Sans MS", Font.BOLD , 12));
    add(lb35);
	setae = new ImageIcon ("setae.jpg");
    bt15 = new JButton(setae);
   	bt15.setBounds(90, 700 ,100 ,100);
   	add(bt15);
	setad = new ImageIcon ("setad.jpg");
    bt16 = new JButton(setad);
    bt16 = new JButton(setad);
   	bt16.setBounds(680, 700 ,100 ,100);
   	add(bt16);
   	
   	
   	
   	lb36 = new JLabel("O cruzamento foi perfeito seu jogar subiu para cabecear ");
  	lb36.setBounds(40,45,900,20);
  	lb36.setFont(new Font ("Comic Sans MS", Font.BOLD , 12));
     add(lb36);
    jogada8 = new ImageIcon("jogada8.jpg");			
  	lb37 = new JLabel (jogada8);
  	lb37.setBounds(230, 120 ,400 ,450);
  	add(lb37);
  	lb38 = new JLabel("Cabecear no canto superior Esquerdo");
  	lb38.setBounds(35,610 ,400,20);
  	lb38.setFont(new Font ("Comic Sans MS", Font.BOLD , 12));
    add(lb38);
    lb39 = new JLabel("Cabecear no canto superior Direito");
  	lb39.setBounds(600,620,600,20);
  	lb39.setFont(new Font ("Comic Sans MS", Font.BOLD , 12));
    add(lb39);
	setae = new ImageIcon ("setae.jpg");
    bt17 = new JButton(setae);
   	bt17.setBounds(90, 700 ,100 ,100);
   	add(bt17);
	setad = new ImageIcon ("setad.jpg");
    bt18 = new JButton(setad);
    bt18 = new JButton(setad);
   	bt18.setBounds(680, 700 ,100 ,100);
   	add(bt18);
    
    
    
   

    
    //Fundo da Tela
    caixa = new ImageIcon("caixa.png");			
	lb40 = new JLabel (caixa);
	lb40.setBounds(-50, -80 ,970,300);
	add(lb40);
	caixa2 = new ImageIcon("caixa2.png");			
	lb41 = new JLabel (caixa2);
	lb41.setBounds(-80, 580 ,500 ,100);
	add(lb41);
	caixa3 = new ImageIcon("caixa2.png");			
	lb42 = new JLabel (caixa3);
	lb42.setBounds(460, 590 ,500 ,100);
	add(lb42);
	campo = new ImageIcon("campo2.jpg");			
	lb43 = new JLabel (campo);
	lb43.setBounds(0, 0 ,900 ,900);
	add(lb43);
	

    
    
    lb1.setVisible(true);
    lb2.setVisible(true);
    lb3.setVisible(true);
    lb4.setVisible(true);
    lb5.setVisible(false);
    lb6.setVisible(false);
    lb7.setVisible(false);
    lb8.setVisible(false);
    lb9.setVisible(false);
    lb10.setVisible(false);
    lb11.setVisible(false);
    lb12.setVisible(false);
    lb13.setVisible(false);
    lb14.setVisible(false);
    lb15.setVisible(false);
    lb16.setVisible(false);
    lb17.setVisible(false);
    lb18.setVisible(false);
    lb19.setVisible(false);
    lb20.setVisible(false);
    lb21.setVisible(false);
    lb22.setVisible(false);
    lb23.setVisible(false);
    lb24.setVisible(false);
     lb32.setVisible(false);
    lb33.setVisible(false);
    lb34.setVisible(false);
    lb35.setVisible(false);
    lb36.setVisible(false);
    lb37.setVisible(false);
    lb38.setVisible(false);
    lb39.setVisible(false);
    
    
    
    
    
    
    
    bt5.setVisible(false);
    bt6.setVisible(false);
    bt7.setVisible(false);
    bt8.setVisible(false);
    bt9.setVisible(false);
    bt10.setVisible(false);
    bt11.setVisible(false);
    bt12.setVisible(false);
    bt13.setVisible(false);
    bt14.setVisible(false);
    bt15.setVisible(false);
    bt16.setVisible(false);
    bt17.setVisible(false);
    bt18.setVisible(false);
    
    
    
   	
   	
   	
	
}


public void Eventos() {
	bt3.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		lb1.setVisible(false);
	    lb2.setVisible(false);
	    lb3.setVisible(false);
	    lb4.setVisible(false);
	    lb5.setVisible(true);
	    lb6.setVisible(true);
	    lb7.setVisible(true);
	    lb8.setVisible(true);
	    bt5.setVisible(true);
	    bt6.setVisible(true);
	    bt3.setVisible(false);
	    bt4.setVisible(false);
	    
		
		
		 
		}
	});
	bt4.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		lb1.setVisible(false);
	    lb2.setVisible(false);
	    lb3.setVisible(false);
	    lb4.setVisible(false);
	    lb9.setVisible(true);
	    lb10.setVisible(true);
	    lb11.setVisible(true);
	    lb12.setVisible(true);
	    bt7.setVisible(true);
	    bt8.setVisible(true);
	    bt3.setVisible(false);
	    bt4.setVisible(false);
	    bt6.setVisible(false);
		
		
		 
		}
	});
	bt5.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		lb32.setVisible(true);
		lb33.setVisible(true);
		lb34.setVisible(true);
		lb35.setVisible(true);
	    lb5.setVisible(false);
	    lb6.setVisible(false);
	    lb7.setVisible(false);
	    lb8.setVisible(false);
	    bt5.setVisible(false);
	    bt15.setVisible(true);
	    bt16.setVisible(true);
	    bt10.setVisible(false);
	    lb1.setVisible(false);
	    lb2.setVisible(false);
	    lb3.setVisible(false);
	    lb4.setVisible(false);
	    bt6.setVisible(false);
		
		
		 
		}
	});
	bt6.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	    lb36.setVisible(true);
	    lb37.setVisible(true);
	    lb38.setVisible(true);
	    lb39.setVisible(true);
	    lb5.setVisible(false);
	    lb6.setVisible(false);
	    lb7.setVisible(false);
	    lb8.setVisible(false);
	    bt5.setVisible(false);
	    bt6.setVisible(false);
	    bt17.setVisible(true);
	    bt18.setVisible(true);
		
		
		 
		}
	});
	bt8.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	    lb21.setVisible(true);
	    lb22.setVisible(true);
	    lb23.setVisible(true);
	    lb24.setVisible(true);
	    lb9.setVisible(false);
	    lb10.setVisible(false);
	    lb11.setVisible(false);
	    lb12.setVisible(false);
	    bt7.setVisible(false);
	    bt8.setVisible(false);
	    bt13.setVisible(true);
	    bt14.setVisible(true);
	    bt6.setVisible(false);
		
		
		 
		}
	});
	bt7.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			new TelaFinal2().setVisible(true);				
			  setVisible(false);
			
			
			 
			}
		});
	bt9.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			new TelaFinal2().setVisible(true);				
			  setVisible(false);
			
			
			 
			}
		});
	
	bt13.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		new TelaFinal().setVisible(true);				
		  setVisible(false);
		
		
		 
		}
	});
	bt14.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			new TelaFinal1().setVisible(true);				
			  setVisible(false);
		
			 
			}
		});
	
	bt15.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		new TelaFinal1().setVisible(true);				
		  setVisible(false);
		
		
		 
		}
	});
	bt16.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			new TelaFinal().setVisible(true);				
			  setVisible(false);
		
			 
			}
		});
	bt17.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		new TelaFinal1().setVisible(true);				
		  setVisible(false);
		
		
		 
		}
	});
	bt18.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			new TelaFinal().setVisible(true);				
			  setVisible(false);
		
			 
			}
		});
	
	
	
	
}
public static void main(String args[]) {
	
	 Tela1 frame = new Tela1();
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 frame.setVisible(true);
	
}
	
	
}