package app_swing;

import java.awt.BorderLayout;
import java.io.IOException;

import javax.management.monitor.Monitor;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Fenetre extends JFrame {

	private int i = 0;
	private Bouton bouton = new Bouton("Monitor bouton");
	private Panneau pan  = new Panneau();
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
		container.add(pan, BorderLayout.CENTER);		
		
		this.setContentPane(container);		
		this.setVisible(true);
		go();
	}
	
	private void go()
	{
		//JOptionPane.showMessageDialog(null, pan.getPosX());
		int x = pan.getPosX();
		int y = pan.getPosY();
		boolean backX = false;
		boolean backY = false;
		while(true)
		{
			if (x < 1) {
				backX = false;				
			}
			if (x > pan.getWidth() - 50) {
				backX = true;
			}
			
			
			if (y < 1) {
				backY = false;				
			}
			if (y > pan.getHeight() - 50) {
				backY = true;
			}
			
			if (!backX) {
				pan.setPosX(++x);
			} else {
				pan.setPosX(--x);
				
			}
			
			if (!backY) {
				pan.setPosY(++y);
			} else {
				pan.setPosY(--y);
				
			}
			
		
			pan.repaint();

			try {
				Thread.sleep(8);
			} catch (InterruptedException e) {

				e.printStackTrace();			}
		}
	}
}
