package app_swing;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Bouton extends JButton implements MouseListener{
	
	private String name;
	private Image img;
	
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
	

	public void paintComponents(Graphics g) {
	
		Graphics2D g2d = (Graphics2D)g;
		GradientPaint gp = new GradientPaint(0, 0, Color.red,  0, 20, Color.red, true);
		g2d.setPaint(gp);
		g2d.drawImage(img, 0, 0, this.getWidth(), this.getHeight(),this);
		g2d.setColor(Color.black);
		g2d.drawString(this.name, this.getWidth() /2 - (this.getWidth() / 2/4), (this.getHeight() /2) +5);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent event) {

		try {
			img = ImageIO.read(new File("Sans titre.png"));
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
			img = ImageIO.read(new File("fondBoutonHover.png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
