package classWork;
import java.util.Scanner;

//Per Taylor
//4/4/2018
//Block: B
//Description: This will have the user enter three words, the words will then be moved into alphabetical order.
public class Alphabet
{
	Scanner scan = new Scanner(System.in);
	
	String word1, word2, word3;
	int length1, length2, length3;
	
	public void input()
	{
		System.out.println("Welcome to my program!");
		System.out.println("I will rearrange three words given to me in alphabetical order.");
		
		System.out.println("Please type the first word.");
		word1 = scan.nextLine();
		System.out.println("Please type the second word.");
		word2 = scan.nextLine();
		System.out.println("Please type the third word.");
		word3 = scan.nextLine();
	}
	
	public void change()
	{
		length1 = word1.length();
		
		length2 = word2.length();
		
		length3 = word3.length();
		
	}
	
	public static void main(String[] args)
	{
		Alphabet bob = new Alphabet();
	}

}
