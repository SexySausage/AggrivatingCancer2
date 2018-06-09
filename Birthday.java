package classWork;
import java.util.Scanner;

//Per Taylor
//4/18/2018
//Block: B
//Description:

public class Birthday
{
	Scanner scan = new Scanner(System.in);
	
	
	String name1, name2, year1, year2, month1, month2, day1, day2, date1, date2;
	
	//This will explain to the user what the program does and how to use it.
	public void instructions()
	{
		System.out.println("Welcome to the birthday comparison program thingy.");
		System.out.println("This program will take the birth date of two people");
		System.out.println("and tell you which person is older.");
	}
	
	//This will allow the user to input the name and date of birth of both people.
	public void input()
	{
		System.out.println("Please give me the date the first person was born in the format mm/dd/yyyy.");
		System.out.println("Please remember to add in the forward slashes in between the month, date and year.");
		System.out.println("Example: 03/27/1978");
		
		System.out.println("");
		
		System.out.println("Type the persons name here.");
		name1 = scan.nextLine();
		
		System.out.println("Now type the persons date of birth here.");
		date1 = scan.nextLine();
		month1 = date1.substring(0, 1);
		day1 = date1.substring(3, 4);
  		year1 = date1.substring(6, 9);
  		
  		System.out.println("");
  		
  		System.out.println("Type the second persons name here.");
  		name2 = scan.nextLine();
  		
  		System.out.println("Now type the second persons date of birth here.");
  		date2 = scan.nextLine();
  		month2 = date2.substring(0, 1);
  		day2 = date2.substring(3, 4);
  		year2 = date2.substring(6, 9);
	}
	
	//This will determine the number of days each person has been alive, it will account for leap years as well.
	public void Calculations()
	{
		if(year1 < year2)
		{
			System.out.println(name1 + " Is older than " + name2);
		}
		else
		{
			if(year1 > year2)
			{
				System.out.println(name2 + " Is older than " + name1);
			}
			else
			{
				if(year1 == year2)
				{
					DO MONTHS HERE!
				}
			}
		}
	}
	
	//This runs the program in the appropriate order.
	public void runProgram()
	{
		instructions();
		input();
	}
	
	public static void main(String[] args)
	{
		

	}

}


