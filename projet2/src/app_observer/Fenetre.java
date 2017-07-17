package app_observer;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Fenetre extends JFrame {

	private JLabel lab = new JLabel();
	private Horloge horloge = new Horloge();
	private String hour = "";
	public Fenetre(){
		this.setSize(200,80);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		horloge.addObservateur(new Observateur() {
			
			@Override
			public void update(String hour) {
				lab.setText(hour);
				
			}
		});
		
		this.getContentPane().add(lab, BorderLayout.CENTER);
		this.setVisible(true);
		horloge.run();
		
	}

	public static void main(String[] args) {
		Fenetre fenetre = new Fenetre();

	}

}
