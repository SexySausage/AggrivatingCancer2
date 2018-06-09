package classWork;
import java.util.Scanner;
import java.text.DecimalFormat;

//Per Taylor
//3/13/2018
//Block: B
//Description: This will find the hypotenuse of a triangle using the pythagorean theorem.

public class RightTriangle
{
	Scanner scan = new Scanner(System.in);
	DecimalFormat dec3 = new DecimalFormat("0.000");
	
	String again = "yes";
	double num1, num2, num3, num4, num5, num6;
	
	//This will allow the user to input the two legs of the triangle.
	public void input()
	{
		System.out.println("This program will find the hypotenuse of any right triangle.");
		System.out.println("please tell me the two legs of the triangle.");
		num1 = scan.nextDouble();
		num2 = scan.nextDouble();
	}
	
	//This will find the hypotenuse of the triangle.
	public void findHyp()
	{
		num3 = Math.pow(num1, 2);
		num4 = Math.pow(num2, 2);
		
		num5 = num3+num4;
		num6 = Math.sqrt(num5);
		scan.nextLine();
	}
	
	//This will tell the user the hypotenuse of the triangle.
	public void results()
	{
		System.out.println("In a triangle with legs that measure " +dec3.format(num1)+ " and " +dec3.format(num2));
		System.out.println("The hypotenuse would be " +dec3.format(num6));
	}
	
	//This will run the program in the appropriate order.
	public void runProgram()
	{
		input();
		findHyp();
		results();
	}
	
	//This will restart the program on a loop, as long as the user inputs "yes"
	public void runAgain()
	{
		while(again.equalsIgnoreCase("yes"))
		{
			runProgram();
			System.out.println("Do you have any more triangles for me to solve?");
			again = scan.nextLine();
		}
		System.out.println("Thanks for using my program.");
	}
	
	public static void main(String[] args)
	{
		RightTriangle bob = new RightTriangle();
		bob.runAgain();
	}

}
