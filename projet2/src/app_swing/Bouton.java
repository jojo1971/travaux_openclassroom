package app_swing;

import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import javax.swing.JButton;

public class Bouton extends JButton implements MouseListener{
	
	String name;
	Image img;
	
	public Bouton(String str)
	{
		super(str);
		this.name = str;
		
		try {
			img = ImageIO.read(new File("fondBouton.png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.addMouseListener(this);		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent event) {

		try {
			img = ImageIO.read(new File("fondBoutonHover.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void mouseExited(MouseEvent event) {

		try {
			img = ImageIO.read(new File("fondBouton.png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void mousePressed(MouseEvent event) {

		try {
			img = ImageIO.read(new File("fondBoutonClic.png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void mouseReleased(MouseEvent event) {

		try {
			img = ImageIO.read(new File("fondBouton.png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
