package app_Calculatrice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

public class Fenetre extends JFrame  {

	private GridLayout grid = new GridLayout(4,	4);	
	private GridLayout grid2 = new GridLayout(5,	1);	
	private JButton[] mesBoutons = new JButton[13];
	private JPanel container = new JPanel();
	private JPanel pan1 = new JPanel();
	private JPanel pan2 = new JPanel();
	private JPanel pan3 = new JPanel();
	private JTextField lab = new JTextField();
	private String nbr1 = "";
	private String nbr2 = "";
	private double result;
	private String signe = "";
	private String aff1 = "";
	private String aff2 = "";
	private String aff3 = "";
	private int compt = 0;
	private boolean deus = false;

	private String str = "";
	public Fenetre()
	{
		container.setLayout(new BorderLayout());
		action1 act = new action1();
		SignePlus signePlus = new SignePlus();
		SigneEgal signeEgal = new SigneEgal();
		SigneMoins signeMoins = new SigneMoins();
		SigneMult signeMult= new SigneMult();
		SigneDiv signeDiv = new SigneDiv();
		this.setTitle("Calculatrice");
		this.setSize(300,300);
		this.setLocationRelativeTo(null);
		pan1.setSize(100,300);
		pan2.setSize(100,30);
		lab.setText("1254.2");
		lab.setEditable(false);;
		pan2.add(lab);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		grid.setHgap(5);
		grid.setVgap(5);
		grid2.setVgap(5);
		pan1.setLayout(grid);
		pan3.setLayout(grid2);


		JButton boutC = new JButton("C");
		boutC.setForeground(Color.RED);
		JButton boutPlus = new JButton("+");
		JButton boutMoins= new JButton("-");
		JButton boutMult= new JButton("*");			
		JButton boutDiv= new JButton("/");	
		JButton egal = new JButton("=");	
		JButton point = new JButton(".");	

		pan3.add(boutC);
		pan3.add(boutPlus);
		pan3.add(boutMoins);
		pan3.add(boutMult);
		pan3.add(boutDiv);

		boutPlus.addActionListener(signePlus);
		boutMoins.addActionListener(signeMoins);
		boutMult.addActionListener(signeMult);
		boutDiv.addActionListener(signeDiv);
		boutC.addActionListener(act);
		point.addActionListener(act);
		egal.addActionListener(signeEgal);

		JButton un = new JButton("1");
		JButton deux = new JButton("2");			
		JButton trois = new JButton("3");
		JButton quatre = new JButton("4");
		JButton cinq = new JButton("5");
		JButton six = new JButton("6");
		JButton sept = new JButton("7");
		JButton huit = new JButton("8");
		JButton neuf = new JButton("9");
		JButton zero = new JButton("0");

		un.addActionListener(act);
		deux.addActionListener(act);
		trois.addActionListener(act);
		quatre.addActionListener(act);
		cinq.addActionListener(act);
		six.addActionListener(act);
		sept.addActionListener(act);
		huit.addActionListener(act);
		neuf.addActionListener(act);
		zero.addActionListener(act);

		pan1.add(un);
		pan1.add(deux);
		pan1.add(trois);
		pan1.add(quatre);
		pan1.add(cinq);
		pan1.add(six);
		pan1.add(sept);
		pan1.add(huit);
		pan1.add(neuf);
		pan1.add(zero);	

		pan1.add(point);
		pan1.add(egal);

		container.add(pan1, BorderLayout.CENTER);
		container.add(pan2,BorderLayout.NORTH);
		container.add(pan3,BorderLayout.EAST);
		this.setContentPane(container);;
		this.setVisible(true);

	}
	public class action1 implements ActionListener
	{
		public void actionPerformed(ActionEvent arg0) {

			JButton o = (JButton)arg0.getSource();
			if (o.getText() == "C") {
				lab.setText("");
				nbr1 = "";
				nbr2 = "";
				signe = "";
				aff1 = "";
				aff2 = "";
				result = 0;
				deus = false;
			}else if(deus == false)
			{

				aff1 = o.getText();
				nbr1 = nbr1 + aff1;
				lab.setText(nbr1);
			}else
			{
				aff2 = o.getText();

				nbr2 = nbr2 + aff2;
				lab.setText(nbr2);
			}
		}
	}

	public class SignePlus implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {

			deus = true;
			signe = "+";
		}

	}
	public class SigneMoins implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			
			deus = true;
			signe = "-";
		}
		
	}
	public class SigneMult implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			
			deus = true;
			signe = "*";
		}
		
	}
	public class SigneDiv implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			
			deus = true;
			signe = "/";
		}
		
	}
	public class SigneEgal implements ActionListener
	{
		public String dec(Double nbr)
		{
			DecimalFormat df = new DecimalFormat("#.#############");
			return (df.format(nbr));
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			deus = false;
			
			switch (signe) {
			case "+":
				result = Double.parseDouble(nbr1) + Double.parseDouble(nbr2);
				lab.setText(dec(result));
				break;
			case "-":
				result = Double.parseDouble(nbr1) - Double.parseDouble(nbr2);
				lab.setText(dec(result));
				break;
			case "*":
				result = Double.parseDouble(nbr1) * Double.parseDouble(nbr2);
				lab.setText(dec(result));
				break;
			case "/":
				result = Double.parseDouble(nbr1) / Double.parseDouble(nbr2);
				lab.setText(dec(result));
				break;

			default:
				break;
			}
			
			nbr1 = "";
			nbr2 = "";
			
		}

	}
	
	
	public static void main(String[] args) {
		Fenetre fenetre = new Fenetre();
	}


}
