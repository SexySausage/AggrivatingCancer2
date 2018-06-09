package classWork;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;

//Per Taylor
//Block: B
// 5/1/2018
//Desc:

public class Game extends JoeApplet implements KeyListener, MouseListener, MouseMotionListener
{
	int ballX = 100;
	int ballY = 100;
	int ball2X = 50;
	int ball2Y = 50;
	int ballSpeed2X = 5;
	int ballSpeed2Y = 5;
	int ballSpeedX = 20;
	int ballSpeedY = 20;
	int sizeX = 50;
	int sizeY = 50;
	int Score = 0;
	
	boolean startScreen = true;
	boolean playGame = true;
	boolean firstHit = true;
	
	SolidObject ball1SO = new SolidObject();
	SolidObject ball2SO = new SolidObject();
	
	Random gen = new Random();
	Color random = new Color(gen.nextInt(256), gen.nextInt(256), gen.nextInt(256));
	
	//This method is only called automatically at the beginning of the program.
	public void init()
	{
		addKeyListener(this);
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	
	//Draws the start screen.
	public void drawStartScreen(Graphics art)
	{
		setBackground(Color.green);
		art.setColor(Color.black);
		art.drawString("Welcome, hit X to begin the game.", 200, 200);
	}
	
	public void drawEndScreen(Graphics art)
	{
		if(Score >= 10)
		{
		setBackground(Color.red);
		art.setColor(Color.black);
		art.drawString("The end, hit R to replay", 200, 200);
		}
	}
	
	//This will draw the ball.
	public void drawBall(Graphics art)
	{
		art.setColor(random);
		art.fillOval(ballX, ballY, sizeX, sizeY);
		ball1SO.makeSolidObject(ballX, ballY, 50, 50);
	}
	
	//This is the ball that you will control with the arrow keys.
	public void drawBall2(Graphics art)
	{
		art.setColor(Color.black);
		art.fillOval(ball2X, ball2Y, 30, 30);
		ball2SO.makeSolidObject(ball2X, ball2Y, 30, 30);
	}
	
	//This will make the ball move.
	public void moveBall()
	{
		ballX = ballX + ballSpeedX;
		ballY = ballY + ballSpeedY;
		
		if(ballX > 450 || ballX < 0)
		{
			ballSpeedX = - ballSpeedX;
			random = new Color(gen.nextInt(256), gen.nextInt(256), gen.nextInt(256));
			//sizeX = sizeX + 1;
			//sizeY = sizeY + 1;
		}
		
		if(ballY > 350 || ballY < 0)
		{
			ballSpeedY = - ballSpeedY;
			random = new Color(gen.nextInt(256), gen.nextInt(256), gen.nextInt(256));
			//sizeX = sizeX + 1;
			//sizeY = sizeY + 1;
		}
			if(ball1SO.isCollidingWith(ball2SO))
			{
				if(firstHit)
				{
					ballSpeedX = -ballSpeedX;
					ballSpeedY = -ballSpeedY;
					random = new Color(gen.nextInt(256), gen.nextInt(256), gen.nextInt(256));
					firstHit = false;
				}
			}
			else
			{
				firstHit = true;
			}
			
	}
	
	public void counter(Graphics art)
	{
		art.setColor(Color.BLACK);
		art.drawString("Score = "+Score, 10, 10);
		
		if(ballY > 350)
		{
			Score++;
		}
		
		if(Score == 10)
		{
			drawEndScreen(art);
		}
		
	}
	
	//This runs the program / creates the applet.
	public void paint(Graphics art)
	{
		setSize(500, 400);
		if(startScreen)
		{
			drawStartScreen(art);
		}
		else if(playGame)	//play game.
		{
			drawBall(art);
			moveBall();
			drawBall2(art);
			counter(art);
		}
			else
			{
				drawEndScreen(art);
			}
		repaint();
	}

	@Override
	public void keyPressed(KeyEvent e)
	{
		int key = e.getKeyCode();
		
		if(key == e.VK_X)
		{
			startScreen = false;
		}
		
		if(key == e.VK_R)
		{
			startScreen  = true;
			playGame = true;
			Score = 0;
		}
		
		if(key == e.VK_LEFT && ball2X > 0)
		{
			ball2X = ball2X - ballSpeed2X;
		}
		
		if(key == e.VK_RIGHT && ball2X < 470)
		{
			ball2X = ball2X + ballSpeed2X;
		}
		
		if(key == e.VK_UP && ball2Y > 0)
		{
			ball2Y = ball2Y - ballSpeed2Y;
		}
		
		if(key == e.VK_DOWN && ball2Y < 370)
		{
			ball2Y = ball2Y + ballSpeed2Y;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e)
	{
		
		
	}

	@Override
	public void keyTyped(KeyEvent e)
	{
		
		
	}

	@Override
	public void mouseClicked(MouseEvent e)
	{
		Color random = new Color(gen.nextInt(256), gen.nextInt(256), gen.nextInt(256));
	}

	@Override
	public void mouseEntered(MouseEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e)
	{
		ball2X = e.getX();
		ball2Y = e.getY();
	}
}
