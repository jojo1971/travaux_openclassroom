package app_observer;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Fenetre extends JFrame
{
	private JLabel lab;
	private JPanel pan;
	private Horloge horloge;

	public Fenetre()
	{
		pan = new JPanel();
		horloge = new Horloge();
		lab = new JLabel("date : "+horloge.getHour());
		
		
		lab.setHorizontalAlignment(JLabel.CENTER);
		pan.setLayout(new BorderLayout());
		pan.add(lab, BorderLayout.CENTER);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setSize(300, 100);
		this.add(pan);
		this.setVisible(true);
		
	}
	

	public static void main(String[] args)
	{
		Fenetre fenetre = new Fenetre();

	}

}
