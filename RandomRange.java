package classWork;
import java.util.Random;
import java.util.Scanner;

//Per Taylor
//3/13/2018
//Block: B
//Description: This program will allow the user to input two numbers,
//the program will than give you a random number in between the to numbers given.

public class RandomRange
{
	Random gen = new Random();
	Scanner scan = new Scanner(System.in);
	
	int num1, num2, num3;
	String restart = "yes";
	
	//This introduces the user to the program, and allows them to input the min and max numbers.
	public void input()
	{
		System.out.println("Welcome to the random range program!");
		System.out.println("This program is very simple.");
		System.out.println("Just give me two numbers, and I will give you");
		System.out.println("a random number in between the two numbers given");
		System.out.println("The numbers must be whole numbers.");
		System.out.println("");
		System.out.println("First give me the lower of the two numbers.");
		num1 = scan.nextInt();
		System.out.println("Now give me the higher of the two numbers.");
		num2 = scan.nextInt();
		scan.nextLine();
	}
	
	//This method finds the random number.
	public void randomNumber()
	{
		num3 = gen.nextInt(num2+1-num1)+num1;
		System.out.println("A random number in the range of numbers given is " + num3);
	}
	
	//This will restart the program on a loop as long as the user inputs "yes"
	public void runAgain()
	{
		
		while(restart.equalsIgnoreCase("yes"))
		{
			runProgram();
			System.out.println("Would you like to restart the program, yes or no?");
			restart = scan.nextLine();
		}
			System.out.println("Thanks for trying my program!");
	}
	
	//This method runs the program in the appropriate order.
	public void runProgram()
	{
		input();
		randomNumber();
	}
	
	public static void main(String[] args)
	{
		RandomRange bob = new RandomRange();
		bob.runAgain();
	}

}
