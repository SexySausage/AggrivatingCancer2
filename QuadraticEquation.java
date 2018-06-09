package classWork;
import java.util.Scanner;
import java.text.DecimalFormat;

//Per Taylor
//Block: B
//3/19/2018
//Description: This will solve the quadratic equation based on what the user inputs for A, B and C.

public class QuadraticEquation
{
	Scanner scan = new Scanner(System.in);
	DecimalFormat dec2 = new DecimalFormat("0.00");
	
	double A, B, C, answer1, answer2, decAnswer1, decAnswer2;
	String again = "yes";

	//This allows the user to input A, B and C.
	public void input()
	{
		System.out.println("Welcome to my quadratic equation calculator!");
		System.out.println("We all know what this does and no one wants to do it.");
		System.out.println("So just input A, B and C below and get it over with.");
		System.out.println("");
		System.out.println("Input A here.");
		A = scan.nextDouble();
		System.out.println("Input B here.");
		B = scan.nextDouble();
		System.out.println("Input C here.");
		C = scan.nextDouble();
		scan.nextLine();
	}
	
	//This takes A, B and C and plugs them into the quadratic formula.
	public void doMath()
	{
		if(Math.pow(B, 2) - 4 * A * C < 0)
		{
			System.out.println("The numbers you have inputted are invalid,");
			System.out.println("You can not square root a negative number.");
		}
		else
		{
			answer1 = (-B + Math.sqrt(Math.pow(B, 2) - 4 * A * C)) / ( 2 * A * C);
			System.out.println("In the equation -B + ... the answer is " +dec2.format(answer1));
			
			answer2 = (-B - Math.sqrt(Math.pow(B, 2) - 4 * A * C)) / ( 2 * A * C);
			System.out.println("In the equation -B - ... the answer is " +dec2.format(answer2));
		}
	}
	
	//This runs the methods in the correct order.
	public void runProgram()
	{
		input();
		doMath();
		
	}
	
	public void runAgain()
	{
		{
			while(again.equalsIgnoreCase("yes"))
			{
				runProgram();
				System.out.println("Do you need any more problems solved?");
				again = scan.nextLine();
			}
			System.out.println("Thanks for using my program.");
		}
	}
	
	public static void main(String[] args)
	{
		QuadraticEquation bob = new QuadraticEquation();
		bob.runAgain();
	}

}
