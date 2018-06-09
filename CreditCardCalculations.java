package classWork;
import java.util.Scanner;


public class CreditCardCalculations 
{
	Scanner scan = new Scanner(System.in);
	int cardNumber1;
	int cardNumber2;
	int cardNumber3;
	int cardNumber4;
	int sum;
	int checkDigit;
	
	//This is the intro, it explains the program to the user, and allows them to input their cards number.
	public void intro()
	{
		System.out.println("Welcome, this program is designed to");
		System.out.println("quickly verify the intergrity of your");
		System.out.println("American Express travel card.");
		System.out.println("");
		System.out.println("To start, tell me all of the digits");
		System.out.println("excluding the last digit on your credit card,");
		System.out.println("and I will tell you what the last digit is");
		System.out.println("");
		System.out.println("please type in your four digit card number below,");
		System.out.println("in order, and only one digit at a time, be sure to");
		System.out.println("type the 'Enter' key after every digit you type.");
		cardNumber1 = scan.nextInt();
		cardNumber2 = scan.nextInt();
		cardNumber3 = scan.nextInt();
		cardNumber4 = scan.nextInt();
		
	}
	
	//This is the calculations, it calculates the check digit using what information the user had given it.
	public void calculate()
	{
		sum=cardNumber1+cardNumber2+cardNumber3+cardNumber4;
		checkDigit=7-(sum%7);
	}
	
	//This is the outro, it tells the user their check digit number in a polite fashion.
	public void outro()
	{
		System.out.println("I have sucessfully calculated and verified");
		System.out.println("the check digit of your American Express card.");
		System.out.println("Your check digit should be " +checkDigit+ ".");
		System.out.println("If this number is incorrect, please rescan card.");
		System.out.println("");
		System.out.println("Thank you for using American Express!");
	}
	
	//This runs the entire program, thats 'bout it.
	public void findCheckDigit()
	{
		intro();
		calculate();
		outro();
	}
	
	public static void main(String[] args) 
	{
		CreditCardCalculations americanExpressMachine = new CreditCardCalculations();
		americanExpressMachine.findCheckDigit();
	}

}
