package classWork;
import java.util.Scanner;

public class name
{
	Scanner scan = new Scanner(System.in);
	String name1, name2;
	char letter1, letter2, letter3, letter4, letter5, letter6;
	int index1, index2, index3, index4, index5, index6, length1, length2;
	
	//This method introduces the user to the program,
	//and allows you to input the first and last name.
	public void input()
	{
		System.out.println("Welcome to the randomized password generator.");
		System.out.println("To begin, you will type your full name below,");
		System.out.println("once finished, a password will be generated");
		System.out.println("based on the following:");
		System.out.println("");
		System.out.println("The first three letters of your first name.");
		System.out.println("The last three letters of your last name.");
		System.out.println("");
		System.out.println("Type your first name here.");
		name1 = scan.nextLine();
		System.out.println("Type your last name here.");
		name2 = scan.nextLine();
		System.out.println("keep in mind that your password will be in all caps.");
	}
	
	//This method creates the password
	public void generate() 
	{
		//This is for the first name/first three letters of the password
		name1 = name1.toUpperCase();
		length1 = name1.length();
		index1 = (length1)-length1;
		index2 = (length1+1)-length1;
		index3 = (length1+2)-length1;
				
		letter1 = name1.charAt(index1);
		letter2 = name1.charAt(index2);
		letter3 = name1.charAt(index3);
		
		//This is for the last name/last three letters of the password
		name2 = name2.toUpperCase();
		length2 = name2.length();
		index4 = length2-3;
		index5 = length2-2;
		index6 = length2-1;
		
		letter4 = name2.charAt(index4);
		letter5 = name2.charAt(index5);
		letter6 = name2.charAt(index6);
	}
	
	//This method tells the user the newly created password.
	public void output()
	{
		System.out.println("Your new password is " + letter1 + letter2 + letter3 + letter4 + letter5 + letter6);
	}
	
	//This runs all of the methods in the appropriate order.
	public void runProgram()
	{
		input();
		generate();
		output();
	}
	
	public static void main(String[] args)
	{
		name bob = new name();
		bob.runProgram();
	}

}
