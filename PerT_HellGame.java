package classWork;
import java.awt.*;
import java.util.Random;
import java.applet.Applet;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

//Per Taylor
// 5/23/2018
//Block: B
//Description: This program is simple, the player controls a circle with the mouse,
//and has to dodge enemies that chase him while trying to pick up score items.
//The player can do this by simply dragging the cursor over the hit circle and
//clicking either of the two mouse buttons.
//Each enemy has a different speed to create variety in the gameplay.
public class PerT_HellGame extends JoeApplet implements KeyListener, MouseListener, MouseMotionListener
{
	
	
		int cursorX;
		int cursorY;	
		
		int hitCircleSize = 50;
		int hitCircleX;
		int hitCircleY;
		
		int score = 0;
		int color1;
		int color2;
		int color3;
		
		int enemyX = -100;
		int enemyY = -100;
		int enemy2X = 1466;
		int enemy2Y = -100;
		int enemy3X = - 100;
		int enemy3Y = - 750;
		int enemySizeX = 100;
		int enemySizeY = 100;
		int enemyCount = 0;
		int enemySpeed = 1;
		int averageEnemySpeed = 7;
		int enemyHyperSpeed1 = 10;
		int enemySlowSpeed1 = 3;
		int oldEnemyCount = -1;
		int enemyDifference = enemyCount - oldEnemyCount;
		
		Random gen = new Random();
		
		SolidObject HitCircle = new SolidObject();
		SolidObject enemy = new SolidObject();
		SolidObject enemy2 = new SolidObject();
		SolidObject enemy3 = new SolidObject();
		SolidObject cursorTracer = new SolidObject();
		
		boolean sens1 = true;
		boolean sens2 = false;
		boolean sens3 = false;
		boolean lvlUp = false;
		boolean startScreen = true;
		boolean playGame = true;
		boolean endScreen = false;
		boolean clickable = false;
		boolean dead = false;
		boolean deactivateMouse = false;
		
		Color hitCircleColor = new Color(color1, color2, color3);
		
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
			art.drawString("Welcome to The Hell Game!", 575, 350);
			art.drawString("Press X to play, or press Y to start at lvl two!", 535, 365);
			deactivateMouse = false;
		}
		
		//This is what happens when you die (This is not a good thing.)
		public void drawEndScreen(Graphics art)
		{
			if(dead)
			{
				setBackground(Color.white);
				art.setColor(Color.black);
				art.drawString("Y O U - D I E D", 575, 350);
				art.drawString("- Press R to try again -", 555, 365);
				
				enemyX = -100;
				enemyY = -100;
				enemy2X = 1466;
				enemy2Y = - 100;
				enemy3X = - 100;
				enemy3Y = - 750;
				enemy.makeSolidObject(enemyX,enemyY,20,20);
				enemy2.makeSolidObject(enemy2X, enemy2Y, 20, 20);
				enemy3.makeSolidObject(enemy3X, enemy3Y, 20, 20);
				enemyCount = 0;
				endScreen = true;
				deactivateMouse = true;
			}
		}
		
		//This is the solid object that follows the cursor.
		public void drawCursorTracer(Graphics art)
		{
			art.setColor(Color.YELLOW);
			art.fillOval(cursorX, cursorY, 25, 25);
			cursorTracer.makeSolidObject(cursorX, cursorY, 25, 25);
			
			if(cursorX == hitCircleX || cursorY == hitCircleY)
			{
				clickable = true;
			}
		}
		
		//This is the circle, that when the cursor is over it AND is pressed, the computer senses when it is hit.
		public void drawHitCircle(Graphics art)
		{
			art.setColor(hitCircleColor);
			art.fillOval(hitCircleX, hitCircleY, hitCircleSize, hitCircleSize);
			HitCircle.makeSolidObject(hitCircleX, hitCircleY, hitCircleSize, hitCircleSize);
		}
		
		//This draws the first enemy.
		public void drawEnemy(Graphics art)
		{
			art.setColor(Color.BLUE);
			art.fillOval(enemyX, enemyY, enemySizeX, enemySizeY);
			enemy.makeSolidObject(enemyX, enemyY, enemySizeX, enemySizeY);
		}
		
		//This draws the second enemy.
		public void drawEnemy2(Graphics art)
		{
			art.setColor(Color.RED);
			art.fillOval(enemy2X, enemy2Y, enemySizeX, enemySizeY);
			enemy2.makeSolidObject(enemy2X, enemy2Y, enemySizeX, enemySizeY);
		}
		
		//This draws the third enemy.
		public void drawEnemy3(Graphics art)
		{
			art.setColor(Color.ORANGE);
			art.fillOval(enemy3X, enemy3Y, enemySizeX, enemySizeY);
			enemy3.makeSolidObject(enemy3X, enemy3Y, enemySizeX, enemySizeY);
		}
		
		//This controls the movement of the third enemy.
		public void enemyMovement3()
		{
			if(enemy3X > cursorX)
			{
				enemy3X = enemy3X - averageEnemySpeed;
			}
			
			if(enemy3X < cursorX)
			{
				enemy3X = enemy3X + averageEnemySpeed;
			}
			
			if(enemy3Y > cursorY)
			{
				enemy3Y = enemy3Y - averageEnemySpeed;
			}
			
			if(enemy3Y < cursorY)
			{
				enemy3Y = enemy3Y + averageEnemySpeed;
			}
		}
		
		//This moves the second enemy toward the player.
		public void enemyMovement2()
		{
			if(enemy2X > cursorX)
			{
				enemy2X = enemy2X - enemyHyperSpeed1;
			}
			
			if(enemy2X < cursorX)
			{
				enemy2X = enemy2X + enemyHyperSpeed1;
			}
			
			if(enemy2Y > cursorY)
			{
				enemy2Y = enemy2Y - enemySlowSpeed1;
			}
			
			if(enemy2Y < cursorY)
			{
				enemy2Y = enemy2Y + enemySlowSpeed1;
			}
		}
		
		//This moves the enemy toward the player/cursor.
		public void enemyMovement()
		{
			if(enemyX > cursorX)
			{
				enemyX = enemyX - enemySlowSpeed1;
			}
			
			if(enemyX < cursorX)
			{
				enemyX = enemyX + enemySlowSpeed1;
			}
			
			if(enemyY > cursorY)
			{
				enemyY = enemyY - enemyHyperSpeed1;
			}
			
			if(enemyY < cursorY)
			{
				enemyY = enemyY + enemyHyperSpeed1;
			}
		}
	
		//This triggers stuff if the enemies collide with each other or collide with the cursor.
		//This also affects collision between 2 or more enemies.
		public void enemyCollision(Graphics art)
		{
			if(cursorTracer.isCollidingWith(enemy))
			{
				dead = true;
			}
			
			if(cursorTracer.isCollidingWith(enemy2))
			{
				dead = true;
			}
			
			if(cursorTracer.isCollidingWith(enemy3))
			{
				dead = true;
			}
			
			if(enemyX == enemy2X)
			{
				if(cursorX > 700)
				{
					enemyX = enemyX + score / 100;
					enemy2X = enemy2X + score / 100;
				}
				else if(cursorX <= 700)
				{
					enemyX = enemyX - score / 100;
					enemy2X = enemy2X - score / 100;
				}
			}
			
			if(enemyY == enemy2Y)
			{
				if(cursorY >  325)
				{
					enemyY = enemyY + score / 100;
					enemy2Y = enemy2Y + score / 100;
				}
				
				else if(cursorX <= 325)
				{
					enemyY = enemyY - score / 100;
					enemy2Y = enemy2Y - score / 100;
				}
			}
			
			//----------------------------//
			
			if(enemyX == enemy3X)
			{
				if(cursorX > 700)
				{
					enemyX = enemyX + score / 100;
					enemy3X = enemy3X + score / 100;
				}
				else if(cursorX <= 700)
				{
					enemyX = enemyX - score / 100;
					enemy3X = enemy3X - score / 100;
				}
			}
			
			if(enemyY == enemy3Y)
			{
				if(cursorY >  325)
				{
					enemyY = enemyY + score / 100;
					enemy3Y = enemy3Y + score / 100;
				}
				
				else if(cursorX <= 325)
				{
					enemyY = enemyY - score / 100;
					enemy3Y = enemy3Y - score / 100;
				}
			}
		}
		
		//This places the score in the top left corner.
		public void score(Graphics art)
		{
			art.drawString("score = "+score, 10, 10);
		}
		
		//Once you reach 10,000 score, you level up.
		public void levelUp()
		{
			lvlUp = true;
			enemyCount = enemyCount + 1;
			oldEnemyCount = oldEnemyCount + 1;
			if(score >= 10000)
			{
				if(score < 20000)
				{
					lvl2();
				}
			}
			
			if(score <= -1000000)
			{
				lvl666();
			}
		}
		
		//This is level one, which happens if you have less then 10,000 score.
		//You can skip this level if you'd like.
		public void lvl1()
		{
			if(score < 10000)
			{
				color1 = 255;
				color2 = 255;
				color3 = 255;
				hitCircleColor = new Color(color1, color2, color3);
			}
		}
		
		//This is level two, which is reached once you have 10,000 score.
		public void lvl2()
		{
			setBackground(Color.black);
			color1 = 127;
			color2 = 255;
			color3 = 0;
			hitCircleColor = new Color(color1, color2, color3);
		}
		
		//A little easter egg level that I never got to finishing.
		public void lvl666()
		{
			setBackground(Color.GRAY);
			color1 = 255;
			color2 = 255;
			color3 = 255;
			hitCircleColor = new Color(color1, color2, color3);
		
			enemyCount = 25;
		}
		
		//This runs the program in the appropriate order.
		public void paint(Graphics art)
		{
			setSize(1366, 650);
			setFrameRate(100);
			if(startScreen)
			{
				drawStartScreen(art);
			}
			else if(playGame)
			{
				lvl1();
				drawCursorTracer(art);
				drawHitCircle(art);
				score(art);
				drawEnemy(art);
				drawEnemy2(art);
				drawEnemy3(art);
				levelUp();
				if(lvlUp == true)
				{
					lvl2();
				}
				enemyMovement();
				enemyMovement2();
				enemyMovement3();
				enemyCollision(art);
				if(dead)
				{
					drawEndScreen(art);
				}
			}
		
			repaint();
		}
		
	
		
	@Override
	public void mouseDragged(MouseEvent e) //
	{
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public void mouseMoved(MouseEvent e) //
	{
		if(deactivateMouse == false)
		{
			cursorX = e.getX();
			cursorY = e.getY();
		}
	}

	
	@Override
	public void mouseClicked(MouseEvent arg0) //
	{
		
		
	}

	
	@Override
	public void mouseEntered(MouseEvent arg0) //
	{
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public void mouseExited(MouseEvent arg0) //
	{
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public void mousePressed(MouseEvent e) //
	{
		//This is the absolute basic score idea.
				if(cursorTracer.isCollidingWith(HitCircle))
				{
						score = score + 1000;
				}
				else if(!cursorTracer.isCollidingWith(HitCircle))
				{
					score = score - 1000;
				}
		//This will change the location of the circle after it is hit.
			hitCircleX = gen.nextInt(1266)+0;
			hitCircleY = gen.nextInt(550)+0;
	}

	
	@Override
	public void mouseReleased(MouseEvent arg0) //
	{
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public void keyPressed(KeyEvent e)
	{
		int key = e.getKeyCode();
		
		if(key == e.VK_X)
		{
			if(startScreen == true)
			{
				startScreen = false;
				playGame = true;
				color1 = 0;
				color2 = 0;
				color3 = 0;
			}
		}
		
		if(key == e.VK_Y)
		{
			if(startScreen == true)
			{
				startScreen  = false;
				playGame = true;
				score = 10000;
			}	
		}	
		
		if(key == e.VK_Z)
		{
			if(startScreen == true)
			{
				startScreen = false;
				playGame = true;
				score = score - 1000000;
			}
		}
		
		if(key == e.VK_R)
		{
			if(endScreen == true)
			{
				dead = false;
				endScreen = false;
				startScreen = true;
				playGame = true;
				score = 0;
				enemyCount = 0;
			}
		}
		
		if(key == e.VK_1)
		{
			if(sens1)
			{
				cursorX = cursorX;
				cursorY = cursorY;
			}
			
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) //
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) //
	{
		// TODO Auto-generated method stub
		
	}

}
