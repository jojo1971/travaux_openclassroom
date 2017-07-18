package app_Calculatrice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;

public class Fenetre extends JFrame  {

	private GridLayout grid = new GridLayout(4,	4);	
	private GridLayout grid2 = new GridLayout(5,	1);	
	private JButton[] mesBoutons = new JButton[13];
	private JPanel pan1 = new JPanel();
	private JPanel pan2 = new JPanel();
	private JPanel pan3 = new JPanel();
	private JLabel lab = new JLabel();
	private double nbr1;

	private String str = "";
	public Fenetre()
	{
		action1 act = new action1();
		lab.setText("1254.2");
		this.setTitle("Calculatrice");
		this.setSize(300,300);
		this.setLocationRelativeTo(null);
		pan1.setSize(300,300);
		pan2.setSize(300,30);
		lab.setSize(300,30);
		lab.setBorder(new MatteBorder(1,1,1,1,Color.black));
		pan2.add(lab);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		grid.setHgap(5);
		grid.setVgap(5);
		pan1.setLayout(grid);
		pan3.setLayout(grid2);
		
		for (int i = 0; i < 4; i++) {
			JButton button = new JButton(""+i);
			pan3.add(button);
		}


		for (int i = 1; i < mesBoutons.length; i++) {
			
			JButton bout;
			switch (i) {
			case  10 :
				bout = new JButton("0");
				bout.setSize(10, 10);
				bout.setName("bout"+i);
				bout.addActionListener(act);
				
				mesBoutons[i] = bout;
				pan1.add(bout);
				break;
			case  11 :
				 bout = new JButton(".");
				 bout.setSize(10, 10);
					bout.setName("bout"+i);
					bout.addActionListener(act);
					
					mesBoutons[i] = bout;
					pan1.add(bout);
				break;
			case  12 :
				 bout = new JButton("=");
				 bout.setSize(10, 10);
					bout.setName("bout"+i);
					bout.addActionListener(act);
					
					mesBoutons[i] = bout;
					pan1.add(bout);
				break;

			default:
				bout = new JButton(""+i);

				bout.setSize(10, 10);
				bout.setName("bout"+i);
				bout.addActionListener(act);
				
				mesBoutons[i] = bout;
				pan1.add(bout);
				break;
			}
			
			
			//System.out.println(bout.getName());
			//System.out.println("ffff"+bout.getText());

		}
		this.add(pan1, BorderLayout.WEST);
		this.add(pan2,BorderLayout.NORTH);
		this.add(pan3,BorderLayout.EAST);
		this.setVisible(true);

	}
	public class action1 implements ActionListener
	{
		public void actionPerformed(ActionEvent arg0) {

			lab.setText(((JButton) arg0.getSource()).getText()+"");
			nbr1 = Double.parseDouble(((JButton) arg0.getSource()).getText());
			System.out.println(nbr1);

		}

	}
	public static void main(String[] args) {

		Fenetre fenetre = new Fenetre();

	}
	

}
