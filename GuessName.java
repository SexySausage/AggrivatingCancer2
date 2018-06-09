package classWork;
import java.util.Scanner;

//Per Taylor
//Block: B
//2/14/18
//This will change the sentence to leet.

public class GuessName 
{
	Scanner scan = new Scanner(System.in);
	String name, guessLetter1, guessLetter2, guessLetter3, guessName;
	char letter1, letter2, letter3;
	int length, position1, position2, position3;
	
	//This just explains the rules.
	public void intro()
	{
		name = "daryl";
		System.out.println("Welcome to classroom hang man.");
		System.out.println("In this game, you will get to guess 3 letters, while");
		System.out.println("trying to figure out whose name it is in this classroom.");
		System.out.println("After you've guessed 3 letters, you will get 1 guess at");
		System.out.println("whose name it actually is.");
	}
	
	//this finds the length of the name.
	public void findLength()
	{
		length = name.length();
	}
	
	//this allows the user to guess a letter of the name 3 times.
	public void guessLetter()
	{
		System.out.println("The name is " + length + " letters long.");
		System.out.println("Ok, now guess what letters are in the name.");
		
		//This will guess the first letter.
		guessLetter1 = scan.nextLine();
		if(name.indexOf(guessLetter1) == -1)
		{
			System.out.println("Sorry, that letter is not in the name, try again!");
		}
		else
		{
			position1 = name.indexOf(guessLetter1);
			System.out.println("You're correct, letter " + guessLetter1 + " is in position " + position1);
		}
		
		//This will guess the second letter.
		guessLetter2 = scan.nextLine();
		if(name.indexOf(guessLetter2) == -1)
		{
			System.out.println("Sorry, that letter is not in the name, try again!");
		}
		else
		{
			position2 = name.indexOf(guessLetter2);
			System.out.println("You're correct, letter " + guessLetter2 + " is in position " + position2);
		}
		
		//This will guess the third letter.
		guessLetter3 = scan.nextLine();
		if(name.indexOf(guessLetter3) == -1)
		{
			System.out.println("Sorry, that letter is not in the name.");
		}
		else
		{
			position3 = name.indexOf(guessLetter3);
			System.out.println("You're correct, letter " + guessLetter3 + " is in position " + position3);
		}
	}
	
	//This method allows the user to input the name he thinks it is.
	public void guessName()
	{
		System.out.println("Who do you think it is?");
		guessName = scan.nextLine();
		if(guessName.equals(name))
		{
			System.out.println("Congratulations, you are correct!");
		}
		else
		{
			System.out.println("You are incorrect");
			System.out.println("The correct answer was " + name);
		}
	}
	
	//This method runs all the other methods in the appropriate order.
	public void runProgram()
	{
		intro();
		findLength();
		guessLetter();
		guessName();
	}
	
	public static void main(String[] args) 
	{
		GuessName bob = new GuessName();
		bob.runProgram();
	}

}
