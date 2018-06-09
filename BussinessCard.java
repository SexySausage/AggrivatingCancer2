package classWork;
import java.applet.Applet;
import java.awt.*;
import java.util.Random;

//Per Taylor
//April 25, 2018
//Block: B
//Desc: A business card that has at least 2 customly made colors,
//1 new font size, 1 string, 1 oval, 1 rectangle, 1 line, 1 polygon.

public class BussinessCard extends Applet
{
	
	int color1, color2, color3;
	Random gen = new Random();
	Color random;
	
	Color red = new Color(255, 0, 0);
	Color black = new Color(0, 0, 0);
	Color white = new Color(255, 255, 255);
	Color teal = new Color(33, 255, 225);
	
	Font wacky = new Font("Comic Sans MS",Font.BOLD,15);
	
	int[] xpos = {100, 200, 300, 400};
	int[] ypos = {400, 300, 200, 100};
	
	public void randomColor()
	{
		color1 = gen.nextInt(256);
		color2 = gen.nextInt(256);
		color3 = gen.nextInt(256);
		random = new Color(color1, color2, color3);
	}
	
	public void drawRect(Graphics art)
	{
		art.setColor(white);
		art.drawRect(50, 50, 400, 200);
		art.drawRect(75, 75, 50, 50);
	}
	
	public void drawDesign(Graphics art)
	{
		art.setColor(red);
		art.drawLine(375, 150, 450, 150);
		art.drawArc(375, 50, 75, 200, 180, 180);
		art.drawArc(375, 50, 75, 200, 360, 360);
		
		art.drawPolygon(xpos, ypos, 4);
	}
	
	public void drawOval(Graphics art)
	{
		art.setColor(teal);
		art.fillOval(375, 50, 75, 200);
	}
	
	public void writeText(Graphics art)
	{
		art.setFont(wacky);
		art.setColor(white);
		art.drawString("Per Taylor", 150, 100);
		art.drawString("938-274-2847", 150, 125);
	}
	
	public void paint(Graphics art)
	{
		setSize(600, 400);
		//If you enjoy seizures feel free to change the background color to "random"
		setBackground(black);
		randomColor();
		drawRect(art);
		drawOval(art);
		drawDesign(art);
		writeText(art);
	}
}
