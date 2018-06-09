package classWork;
import java.util.Scanner;

public class SecondsProgram
{
	Scanner rock = new Scanner(System.in);
	int totalSeconds;
	int totalMinutes;
	int totalHours;
	int remainingSeconds;
	final int SECOND=1;
	final int MINUTE=60;
	final int HOUR=3600;
	
	public void calculations()
	{
		totalHours=totalSeconds/HOUR;
		totalMinutes=(totalSeconds%HOUR)/MINUTE;
		remainingSeconds=(totalSeconds%HOUR)%MINUTE/SECOND;
	}

	public void input()
	{
		System.out.println("Hello human!");
		System.out.println("Welcome to my seconds conversion program!");
		System.out.println("");
		System.out.println("I will translate 'X' ammount of seconds into");
		System.out.println("the equivalent number of hours, minutes and seconds.");
		System.out.println("");
		System.out.println("Enter the desired ammount of seconds desired");
		System.out.println("below and I will begin to calculate the answer");
		totalSeconds = rock.nextInt();
	}
	
	public void output()
	{
		System.out.println("Alright, I have finished calculating the answer.");
		System.out.println("The answer is " +totalHours+ "hours, " +totalMinutes+ "minutes and " +remainingSeconds+ "Seconds.");
	}
	
	public void runProgram()
	{
		input();
		calculations();
		output();
	}
	
	public static void main(String[] args)
	{
		SecondsProgram counter = new SecondsProgram();
		counter.runProgram();
	}

}
