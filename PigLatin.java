package classWork;
import java.util.Scanner;

public class PigLatin
{
	Scanner scan = new Scanner(System.in);
	String word1, word2, word3, word4;
	char letter1, letter2, ay;
	int length, index1, index2;
	
	//This will ask the user to input a consonant.
	public void input()
	{
		System.out.println("Please give me a consonant and I");
		System.out.println("will translate it into pig latin");
		word1 = scan.nextLine();
	}
	
	//This will put the first letter of the consonant at the end of the word.
	public void modification()
	{
		//finding the first letter in the word.
		length = word1.length();
		index1 = length-length;
		letter1 = word1.charAt(index1);

		//finding the last letter in the word.
		index2 = length-1;
		letter2 = word1.charAt(index2);
		
		//replacing the last letter in the word with the first letter.
		word2 = word1.replace(letter2, letter1);
		word3 = word2.substring(index1+1, length);
		
		//This will add "ay" to the newly formed word.
		word4 = word3 + "ay";
	}
	

	//This will tell the user the second modification of the word.
	public void output()
	{
		System.out.println("Here you go!");
		System.out.println(word4);
		System.out.println("Have fun making people online angry");
		System.out.println("because they can't understand you.");
	}
	
	public void runProgram()
	{
		input();
		modification();
		output();
	}
	
	public static void main(String[] args)
	{
		PigLatin bob = new PigLatin();
		bob.runProgram();
	}

}
