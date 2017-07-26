package app_formulaire;

import java.awt.BorderLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Fenetre extends JFrame{

	private JPanel container = new JPanel();
	private JLabel lab = new JLabel("Ma combo");
	private JComboBox<String> comb = new JComboBox<>();
	public Fenetre()
	{
		this.setSize(200,300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		comb.setLayout(new BorderLayout());
		//comb.setPreferredSize(100,20);
		
		
		JPanel top = new JPanel();
		top.add(lab);
		top.add(comb);
		container.add(top, BorderLayout.NORTH);
		this.setContentPane(container);
		this.setVisible(true);
	}
}
