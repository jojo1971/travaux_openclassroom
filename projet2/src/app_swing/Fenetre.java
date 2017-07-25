package app_swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Fenetre extends JFrame implements ActionListener {

	private Bouton bouton = new Bouton("mon bouton");
	private Bouton bouton2 = new Bouton("mon bouton2");
	private Panneau pan  = new Panneau();
	private JPanel container = new JPanel();
	private JPanel containerBouton = new JPanel();
	private JLabel lab = new JLabel();
	private int compteur;
	private boolean controle = true; 
	private boolean backX = false, backY = false;
	private int x, y; 
	private Thread t;


	public Fenetre(){

		bouton.addActionListener(new action1());
		bouton2.addActionListener(new action2());

		this.setSize(300, 300);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		container.setLayout(new BorderLayout());
		lab.setText("mon texte");
		Font police = new Font("arial", Font.ITALIC, 15);
		lab.setFont(police);
		lab.setBackground(Color.red);
		lab.setForeground(Color.green);
		lab.setHorizontalAlignment(JLabel.CENTER);
		containerBouton.add(bouton, BorderLayout.EAST);
		containerBouton.add(bouton2, BorderLayout.WEST);
		container.add(lab, BorderLayout.NORTH);		
		container.add(pan, BorderLayout.CENTER);		
		container.add(containerBouton, BorderLayout.SOUTH);		

		this.setContentPane(container);		
		this.setVisible(true);
		go();
	}

	private void go()

	{
		x = pan.getPosX();
		y = pan.getPosY();
		while(controle)
		{
			if (x < 1)backX = false;				
			if (x > pan.getWidth() - 50)backX = true;
			if (y < 1)backY = false;
			if (y > pan.getHeight() - 50)backY = true;

			if (!backX)pan.setPosX(++x);
			else pan.setPosX(--x);

			if (!backY)	pan.setPosY(++y);
			else pan.setPosY(--y);		
			pan.repaint();

			try {
				Thread.sleep(8);
			} catch (InterruptedException e) {

				e.printStackTrace();			}
		}
	}

	class action1 implements ActionListener
	{
		public void actionPerformed(ActionEvent arg0) {	
			controle = true;
			t = new Thread(new PlayAnimation());
			t.start();
			lab.setText("Vous avez cliqué sur le premier bouton");
			bouton.setEnabled(false);
			bouton2.setEnabled(true);
			go();
		}
	}

	class action2 implements ActionListener
	{
		public void actionPerformed(ActionEvent arg0) {
			controle = false;
			lab.setText("Vous avez cliqué sur le 2e bouton");
			bouton.setEnabled(true);
			bouton2.setEnabled(false);
		}
	}
	public class PlayAnimation implements Runnable
	{
		@Override
		public void run() {
			go();			
		}		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
