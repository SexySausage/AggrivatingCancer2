package classWork;
import java.applet.Applet;
import java.awt.*;

//Per Taylor
//Block: B
//April 4, 2018
//Description: First Graphics applet, drawing weird doodles and stuff.

public class firstApplet extends Applet
{
	Font big = new Font("arial",Font.BOLD,50);
	
	Color purple = new Color(153, 0, 153);
	
	int[] xpos = {100,200,400,300};
	int[] ypos = {200,400,500,100};
	
	public void drawHouse(Graphics art)
	{
		art.drawLine(500, 400, 500, 200);
		art.drawLine(500, 400, 700, 400);
		art.drawLine(700, 400, 700, 200);
		art.drawLine(500, 200, 600, 100);
		art.drawLine(700, 200, 600, 100);
		art.drawRect(575, 300, 50, 100);
		art.drawOval(575, 225, 50, 50);
	}
	
	//This draws stuff.
	public void drawStuff(Graphics art)
	{
		art.setFont(big);
		art.setColor(purple);
		art.drawString("ShApE",100,100);
		
		art.drawRect(100, 100, 50, 75);
		
		art.setColor(Color.blue);
		art.fillOval(100, 100, 50, 75);
		
		art.setColor(Color.red);
		art.fillArc(100, 100, 50, 75, -45, -90);
		
		art.drawPolygon(xpos, ypos, 4);
	}
	
	//This is the applet thingy.
	public void paint(Graphics art)
	{
		setSize(800,800);  //This makes the applet viewer bigger.
		drawHouse(art);
		drawStuff(art);
	}
	
}
