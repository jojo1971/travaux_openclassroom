package app_swing;

import java.awt.BorderLayout;

import javax.management.monitor.Monitor;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Fenetre extends JFrame {

	private Bouton bouton = new Bouton("Monitor bouton");
	private JPanel container = new JPanel();
	private JLabel lab = new JLabel();

	
	public Fenetre(){
		this.setSize(300, 300);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		container.setLayout(new BorderLayout());
		lab.setText("mon texte");
		lab.setHorizontalTextPosition(JLabel.CENTER);
		container.add(bouton, BorderLayout.SOUTH);
		container.add(lab, BorderLayout.NORTH);		
		
		this.setContentPane(container);		
		this.setVisible(true);
	}
}
