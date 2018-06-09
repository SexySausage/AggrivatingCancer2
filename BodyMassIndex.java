package classWork;
import java.util.Scanner;
import java.text.DecimalFormat;

//Per Taylor
//Block: B
//3/23/2018
//Description: This finds the users body mass index based on their height in inches and their weight in pounds.

public class BodyMassIndex
{
	Scanner scan = new Scanner(System.in);
	DecimalFormat dec1 = new DecimalFormat("0.0");
	
	String again = "yes";
	Double weight, height, BMI;
	
	//This allows the user to input their height and weight.
	public void input()
	{
		System.out.println("Welcome to the body mass index calculator!");
		System.out.println("This will determine your body mass index based on:");
		System.out.println("Your height in inches");
		System.out.println("Your weight in pounds");
		
		System.out.println("");
		System.out.println("Please input your height here.");
		height = scan.nextDouble();
		
		System.out.println("");
		System.out.println("Please input your weight here.");
		weight = scan.nextDouble();
		
		scan.nextLine();
	}
	
	//This calculates the users BMI.
	public void doMath()
	{
		BMI = (weight * 703) / (Math.pow(height, 2));
	}
	
	//This tells the user their BMI, and if they are obese, overweight, normal or underweight/
	public void output()
	{
		System.out.println("The following is a body mass index chart:");
		System.out.println("anything below 18.5 - Underweight");
		System.out.println("between 18.5 and 24.9 - Normal");
		System.out.println("between 25 and 29.9 - Overweight");
		System.out.println("anything above 30 - Obese");
		
		System.out.println("");
		System.out.println("Your body mass index is " +dec1.format(BMI));
		if(BMI >= 30)
		{
			System.out.println("Congratulations, you are OBESE.");
		}
		else
		{
			if(BMI >= 25)
			{
				System.out.println("You are overweight...");
			}
			else
			{
				if(BMI >= 18.5)
				{
					System.out.println("You are at a normal weight, good job!");
				}
				else
				{
					if(BMI < 18.5)
					{
						System.out.println("You are underweight.");
					}
				}
			}
		}
	}
	
	//This runs the methods in the appropriate order
	public void runProgram()
	{
		input();
		doMath();
		output();
	}
	
	//This is a while loop that lets the user restart the program if they choose so.
	public void runAgain()
	{
		while(again.equalsIgnoreCase("yes"))
		{
			runProgram();
			System.out.println("Would you like to restart the program?");
			again = scan.nextLine();
		}
		System.out.println("Thanks for using my program.");
	}
	
	public static void main(String[] args)
	{
		BodyMassIndex billy = new BodyMassIndex();
		billy.runAgain();
	}

}
