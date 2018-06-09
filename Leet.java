package classWork;
import java.util.Scanner;

public class Leet
{
	Scanner scan = new Scanner(System.in);
	String sentence, sentence2;
	int position;
	char letter1, letter2, letter3, letter4;
	
	//This lets the user input their sentence.	
	public void intro()
	{
		System.out.println("Enter your sentence or word below.");
		sentence = scan.nextLine();
	}
	
	//This replaces the letters.
	public void replaceLetters()
	{
		sentence2 = sentence.replace('e', '3');
		sentence2 = sentence2.replace('a', '4');
		sentence2 = sentence2.replace('t', '7');
		sentence2 = sentence2.replace('l', '1');
		sentence2 = sentence2.replace('s', '5');
		sentence2 = sentence2.replace('b', '8');
		sentence2 = sentence2.toUpperCase();
	}
	
	//This tells the user the result of the transformation.
	public void outro()
	{
		System.out.println("I have changed your sentence from");
		System.out.println(sentence);
		System.out.println("to");
		System.out.println(sentence2);
	}
	
	//This runs all of the methods in the appropriate order.
	public void runProgram()
	{
		intro();
		replaceLetters();
		outro();
	}
	
	public static void main(String[] args)
	{
		Leet chatKiller = new Leet();
		chatKiller.runProgram();
	}

}
