package classWork;
import java.util.Random;
import java.util.Scanner;

//Per Taylor
//3/6/2018
//Block: B
//Description: This program will let the player play a game involving dice with the computer.

public class Dice
{
	int playNum1, playNum2, compNum1, compNum2, playTotal, compTotal;
	String again = "yes";
	
	Random gen = new Random();
	Scanner scan = new Scanner(System.in);
	
	//This will explain the rules to the player.
	public void intro()
	{
		System.out.println("Welcome to the dice game!");
		System.out.println("You will roll two dice, and so will your opponent.");
		System.out.println("The person who rolls the highest total wins.");
		System.out.println("Good luck!");
		System.out.println("");
	}
	
	//This will roll the players dice.
	public void playerDice()
	{
		playNum1 = gen.nextInt(6)+1;
		playNum2 = gen.nextInt(6)+1;
		playTotal = playNum1 + playNum2;
	}
	
	//This will roll the opponents dice.
	public void compDice()
	{
		compNum1 = gen.nextInt(6)+1;
		compNum2 = gen.nextInt(6)+1;
		compTotal = compNum1 + compNum2;
	}
	
	//This will tell the player the outcome of the match.
	public void outcome()
	{
		//This calculates the players results.
		System.out.println("The player has rolled a " +playNum1);
		System.out.println("The player has rolled a " +playNum2);
		System.out.println("The player has a total score of " +playTotal);
		System.out.println("");
		
		//This calculates the opponents results.
		System.out.println("The opponent has rolled a " +compNum1);
		System.out.println("The opponent has rolled a " +compNum2);
		System.out.println("The opponent has a total score of " +compTotal);
		System.out.println("");
		
		//This tells you who won.
		if(playTotal == compTotal)
		{
			System.out.println("Its a draw, nobody wins!");
		}
		else
		{
			if(playTotal/compTotal == 0)
			{
				System.out.println("You lost this match...");
			}
			else
			{
				System.out.println("Congratulations, you won!");
			}
		}
	}
	
	//This allow the player to either play again or quit the game.
	public void runAgain()
	{
		while(again.equalsIgnoreCase("yes"))
		{
			runProgram();
			System.out.println("Would you like to play again?");
			again = scan.nextLine();
		}
		System.out.println("Thank you for playing!");
	}
	
	//This runs the entire program in the appropriate order.
	public void runProgram()
	{
		intro();
		playerDice();
		compDice();
		outcome();
	}
	
	public static void main(String[] args)
	{
		Dice bob = new Dice();
		bob.runAgain();
	}

}
