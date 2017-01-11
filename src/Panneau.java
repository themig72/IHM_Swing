import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Panneau extends JPanel
{
	//private int i = 0;
	private int marge=12;
	private int margeHead=50;



	public void paintComponent(Graphics g)
	{
		int minCote = Math.min(this.getHeight()/2, this.getWidth()/2); // je calcule le minimum entre largeur et hauteur du cercle pour redimentionnent de la fenetre
		//int deb = (this.getWidth()/4-(this.getWidth()/2));
		
		g.setColor(Color.red);
	    g.drawRect((this.getWidth()/2)+(this.getWidth()/2-minCote)/2, 0, minCote, minCote); // x,y,largeur,hauteur

	    g.setColor(Color.blue);
	    g.drawPolygon(new int[] {this.getWidth()/2-minCote,this.getWidth()/2-minCote/2,this.getWidth()/2}, new int[]{minCote,0,minCote}, 3); // ({x,x,x},{y,y,y}, taille des tableaux) 
		
	    g.setColor(Color.green);
	    g.drawOval((this.getWidth()/2-minCote)/2, this.getHeight()/2+1, minCote-1, minCote-1); // x,y,largeur,hauteur
	    
	    try
	    {
	    Image img = ImageIO.read(new File("IMIE.png"));
	    g.drawImage(img, (this.getWidth()/2)+(this.getWidth()/2-minCote)/2, this.getHeight()/2+1, minCote, minCote,null); // x,y,largeur,hauteur
	    }
	    catch (IOException e)
	    {
	    	e.printStackTrace();
	    }
		
	//System.out.println("Execution numéro : " + (i++));
	}
}
