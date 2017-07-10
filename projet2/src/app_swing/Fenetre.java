package app_swing;

import java.awt.BorderLayout;

import javax.management.monitor.Monitor;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame {

	private Bouton bouton = new Bouton("Monitor bouton");
	
	public Fenetre(){
		this.setSize(300, 300);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		
		
		
		this.getContentPane().add(bouton, BorderLayout.SOUTH);
		this.setVisible(true);
	}
}
