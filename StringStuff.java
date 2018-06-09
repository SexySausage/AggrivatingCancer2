package classWork;
import java.util.Scanner;

public class StringStuff
{
	String word1, word2, word3, word4;
	int index, length, position;
	char letter, letter2, letter3, letter4;
	Scanner scan = new Scanner(System.in);
	
	public void  input()
	{
		System.out.println("Please enter your favorite ice cream so I can learn about strings");
		word1 = scan.nextLine();
		
		word2 = word1.toUpperCase();
		System.out.println(word1 + " in uppercase is " + word2);
		
		length = word1.length();
		System.out.println("The length of " + word1 + " is " + length + ".");
		System.out.println("Please enter a number less then " + length + " and ill return that character");
		index = scan.nextInt();
		scan.nextLine();
		
		letter = word1.charAt(index);
		System.out.println("The letter at position " + index + " is " + letter + ".");
		System.out.println("Enter a letter to be replaced.");
		letter2 = scan.nextLine().charAt(0);
		word3 = word1.replace(letter2, letter3);
		System.out.println(word1 + " is now " + word3);
		
		System.out.println("please enter a letter and ill tell you the first location.");
		letter4 = scan.nextLine().charAt(0);
		position = word1.indexOf(letter4);
		System.out.println(letter4 + " is in position " + position);
		
		word4 = word1.substring(0, 3); //this will get the first 3 letters.
		System.out.println("the first 3 letters will be " + word4);
		
	}
	
	public static void main(String[] args)
	{
		StringStuff bob = new StringStuff();
		bob.input();
	}

}
