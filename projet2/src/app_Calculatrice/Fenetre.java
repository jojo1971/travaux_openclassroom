package app_Calculatrice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class Fenetre extends JFrame  {

	private GridLayout gridNbr = new GridLayout(4,	4);	
	private GridLayout grid2 = new GridLayout(5, 1);	
	private JPanel container = new JPanel();
	private JPanel panNbr = new JPanel();
	private JPanel text = new JPanel();
	private JPanel panSigne = new JPanel();
	private JTextField lab = new JTextField(30);
	private String nbr1 = "";
	private String nbr2 = "";
	private double result;
	private String signe = "=";
	private String aff1 = "";
	private String aff2 = "";
	private boolean deus = false;
	private boolean altern = false;
	private int compt = 0;

	public Fenetre()
	{
		container.setLayout(new BorderLayout());
		action1 act = new action1();
		SignePlus signePlus = new SignePlus();
		SigneEgal signeEgal = new SigneEgal();
		SigneMoins signeMoins = new SigneMoins();
		SigneMult signeMult= new SigneMult();
		SigneDiv signeDiv = new SigneDiv();
		Calcul calcul = new Calcul();
		this.setTitle("Calculatrice");
		this.setSize(300,300);
		this.setLocationRelativeTo(null);
		panNbr.setSize(100,300);
		text.setLayout(new FlowLayout(FlowLayout.RIGHT));
		text.setPreferredSize(new Dimension(200,30));
		lab.setText("0");
		lab.setHorizontalAlignment(SwingConstants.RIGHT);
		lab.setEditable(false);
		text.add(lab);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		gridNbr.setHgap(5);
		gridNbr.setVgap(5);
		grid2.setVgap(5);
		panNbr.setLayout(gridNbr);
		panSigne.setLayout(grid2);


		JButton boutC = new JButton("C");
		boutC.setForeground(Color.RED);
		JButton boutPlus = new JButton("+");
		JButton boutMoins= new JButton("-");
		JButton boutMult= new JButton("*");			
		JButton boutDiv= new JButton("/");	
		JButton egal = new JButton("=");	
		JButton point = new JButton(".");	

		panSigne.add(boutC);
		panSigne.add(boutPlus);
		panSigne.add(boutMoins);
		panSigne.add(boutMult);
		panSigne.add(boutDiv);

		boutPlus.addActionListener(signePlus);
		boutPlus.addActionListener(calcul);
		boutMoins.addActionListener(signeMoins);
		boutMoins.addActionListener(calcul);
		boutMult.addActionListener(signeMult);
		boutMult.addActionListener(calcul);
		boutDiv.addActionListener(signeDiv);
		boutDiv.addActionListener(calcul);
		boutC.addActionListener(act);
		point.addActionListener(act);
		egal.addActionListener(signeEgal);
		egal.addActionListener(calcul);

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

		panNbr.add(un);
		panNbr.add(deux);
		panNbr.add(trois);
		panNbr.add(quatre);
		panNbr.add(cinq);
		panNbr.add(six);
		panNbr.add(sept);
		panNbr.add(huit);
		panNbr.add(neuf);
		panNbr.add(zero);	

		panNbr.add(point);
		panNbr.add(egal);

		container.add(panNbr, BorderLayout.CENTER);
		container.add(text,BorderLayout.NORTH);
		container.add(panSigne,BorderLayout.EAST);
		this.setContentPane(container);;
		this.setVisible(true);

	}
	public class action1 implements ActionListener
	{
		public void actionPerformed(ActionEvent arg0) {

			altern = false;
			JButton o = (JButton)arg0.getSource();
			if (o.getText() == "C") {
				lab.setText("0");
				nbr1 = "";
				nbr2 = "";
				signe = "=";
				aff1 = "";
				aff2 = "";
				result = 0;
				deus = false;
				compt = 0;
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
	public String dec(Double nbr)
	{
		DecimalFormat df = new DecimalFormat("#.#################");
		return (df.format(nbr));
	}

	public class SignePlus implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {			
			signe = "+";
		}
	}
	public class SigneMoins implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {			signe = "-";
		}
	}
	public class SigneMult implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			signe = "*";		}		
	}
	public class SigneDiv implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			signe = "/";
		}	
	}
	public class SigneEgal implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			signe = "=";
		}		
	}

	public class Calcul implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {

			if(altern == false)
			{
				if(compt > 0)
				{	
					deus = true;

					switch(signe)
					{
					case("+") :System.out.println("(+)AVANT : deus = "+deus+" nbr1 = "+nbr1+" nbr2 = "+nbr2+" signe : "+signe+"result : "+result);
					result = Double.parseDouble(nbr1) + Double.parseDouble(nbr2);
					altern = true;
					break;
					case("-") :System.out.println("(-)AVANT : deus = "+deus+" nbr1 = "+nbr1+" nbr2 = "+nbr2+" signe : "+signe+"result : "+result);
					result = Double.parseDouble(nbr1) - Double.parseDouble(nbr2);
					altern = true;
					break;
					case("*") :System.out.println("(*)AVANT : deus = "+deus+" nbr1 = "+nbr1+" nbr2 = "+nbr2+" signe : "+signe+"result : "+result);
					result = Double.parseDouble(nbr1) * Double.parseDouble(nbr2);
					altern = true;

					break;
					case("/") :
						if (Double.parseDouble(nbr2) == 0) {
							lab.setText("0");
							nbr1 = "";
							nbr2 = "";
							signe = "=";
							aff1 = "";
							aff2 = "";
							result = 0;
							deus = false;
							compt = 0;
							System.out.println("(*vvvvv)AVANT : deus = "+deus+" nbr1 = "+nbr1+" nbr2 = "+nbr2+" signe : "+signe+"result : "+result);
							System.out.println("errorrrrr");
							break;
						} else {System.out.println("(*)AVANT : deus = "+deus+" nbr1 = "+nbr1+" nbr2 = "+nbr2+" signe : "+signe+"result : "+result);
							result = Double.parseDouble(nbr1) / Double.parseDouble(nbr2);
							altern = true;
						}
					break;
					case("=") :
						System.out.println("===");
					nbr1 = "";
					nbr2 = "";
					aff1 = "";
					aff2 = "";
					result = 0;
					deus = false;
					compt = 0;
					altern = false;
					break;
					default :
						break;
					}
					nbr1 = result+"";
					nbr2 = "";
					lab.setText(dec(result));
				}else
				{
					deus = true;
					altern = true;
					compt++;
				}
			}
		}
	}

	public static void main(String[] args) {
		Fenetre fenetre = new Fenetre();
	}
}
