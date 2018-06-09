package classWork;
import java.util.Scanner;

public class Sentence
{
	Scanner scan = new Scanner(System.in);
	String sentence1, letter2;
	char letter1;
	int length1, index1, position1;
	
	//This methods lets the user input the sentence, and it will find the length.
	public void findLength()
	{
		System.out.println("Welcome to my program!");
		System.out.println("To begin, input a sentence down below.");
		sentence1 = scan.nextLine();
		length1 = sentence1.length();
		System.out.println("The length of this sentence is " + length1);
	}
	
	//This method will ask the user to input a number less then the length,
	//then it will tell the user what character in the sentence is in that position.
	public void returnLetter()
	{
		System.out.println("Please enter a number less then the length, and");
		System.out.println("I will return the character at the specified index.");
		index1 = scan.nextInt();
		letter1 = sentence1.charAt(index1);
		System.out.println("The character at the specified index is " + letter1);
	}
	
	//This method will ask the user to input a letter, then it will tell the user
	//where that letter occurs first in the sentence, assuming the letter is in
	//the sentence.
	public void returnNumber()
	{
		System.out.println("Now enter a letter, and I will tell you the first");
		System.out.println("position that character is found in the sentence.");
		scan.nextLine();
		
		letter2 = scan.nextLine();
		position1 = sentence1.indexOf(letter2);
		System.out.print("The first " + letter2 + " is in position " + position1);
	}
	
	//obviously this runs all of the methods.
	public void runProgram()
	{
		findLength();
		returnLetter();
		returnNumber();
	}
	
	public static void main(String[] args)
	{
		Sentence bob = new Sentence();
		bob.runProgram();

	}

}
