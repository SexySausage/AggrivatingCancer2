package classWork;
import java.util.Scanner;


public class Paint
{
	Scanner scan = new Scanner(System.in);
	final int COVERAGE=350;
	int length;
	int height;
	int width;
	double paintCansNeeded;
	double totalSqFt;
	double paintNeeded;
	
		//this introduces the user to the program, and lets them input their rooms dimensions
		public void input()
		{
			System.out.println("Welcome to the room painting calculator.");
			System.out.println("");
			System.out.println("This program is designed to tell you");
			System.out.println("the ammount of paint needed, and the");
			System.out.println("dimensions of the room being painted");
			System.out.println("based on the information given by the");
			System.out.println("user.");
			System.out.println("");
			System.out.println("Please answer the following questions below.");
			System.out.println("");
			System.out.println("What is the length of the room you are painting?");
			length=scan.nextInt();
			System.out.println("");
			System.out.println("What is the height of the room you are painting?");
			height=scan.nextInt();
			System.out.println("");
			System.out.println("What is the width of the room you are painting?");
			width=scan.nextInt();
			System.out.println("");
		}
	
		//This calculates the paint needed and the square footage.
		public void calculations()
		{
			totalSqFt=(2*(width*height))+(2*(length*height));
			paintNeeded=totalSqFt;
		}
	
		//This tells the user their rooms dimension and the amount of paint needed in gallons.
		public void output()
		{
			System.out.println("Below this is your rooms dimensions and paint needed.");
			System.out.println("");
			System.out.println("Your rooms height: " +height+ "ft.");
			System.out.println("");
			System.out.println("Your rooms width: " +width+ "ft.");
			System.out.println("");
			System.out.println("Your rooms length: " +length+ "ft.");
			System.out.println();
			System.out.println("You will need " +paintNeeded+ "gallons of paint.");
			System.out.println("");
			System.out.println("Now, get ready to paint you pro!");
		}
		
		public void runProgram()
		{
			input();
			calculations();
			output();
		}
	
	public static void main(String[] args)
	{
		Paint paintCalculator = new Paint();
		paintCalculator.runProgram();
	}

}
