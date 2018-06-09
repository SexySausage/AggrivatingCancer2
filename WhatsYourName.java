package classWork;
import java.io.InputStream;
import java.util.Scanner;

public class WhatsYourName
{
	String name;
	int age;
	Scanner scan = new Scanner(System.in);
	
	public void askName()
	{
		System.out.println("Welcome to my program, what is your name?");
		name = scan.nextLine();
		System.out.println("Nice to meet you " + name + ".");
	}
	
	public void askAge()
	{
		System.out.println("How old are you " + name + ".");
		
	}
	
	public static void main(String[] args)
	{
		WhatsYourName bob = new WhatsYourName();
		bob.askName();
	}

}
