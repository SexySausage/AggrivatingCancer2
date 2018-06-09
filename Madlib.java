package classWork;

import java.util.Scanner;

//Per Taylor
//Period 2B
//Dec 11, 2017
//Description:
//

public class Madlib
{
	Scanner scan = new Scanner(System.in);
	String name;
	
	public void instructions()
	{
		System.out.println("Welcome to the madlib generator, to begin, what is your name?");
		name = scan.nextLine();
		
	}
	
	
	public void story()
	{
		System.out.println("Your name is + name + , and you work for Comcast customer service.");
		System.out.println("You love your job because you get to make people angry over the phone.");
		System.out.println("Your boss is foreign, and very hard to understand, but you can tollerate it.");
		System.out.println("The best part is that half the time, you can just leave the caller on hold, and talk to your freinds.");
		System.out.println("");
	}
	
	
	public static void main(String[] args)
	{
		
	}

}

