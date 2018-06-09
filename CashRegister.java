package classWork;
import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

//Per Taylor
//Period B
//3/28/2018
//Description: The user will input the price of an object, the object will
//randomly be any multiple of 5% off so long as it is no higher than 75% off.
//It will then tell the user the following in an organized manner:
//The original price, discount percent, discount amount, sales price, tax and total price with 7% tax.
//After that it will tell the user how much money they owe, following this, it will give them correct change if necessary.

public class CashRegister
{
	Scanner scan = new Scanner(System.in);
	Random gen = new Random();
	DecimalFormat money = new DecimalFormat("$0.00");
	
	double originPrice, discountPrice, discount, totalPrice, taxes, moneyPaid, change1, change2, change3, change4, change5, finalChange;
	int discountPercent;
	String item, originPrice2, discountPrice2, discount2, totalPrice2, restart = "yes", moneyPaid2, finalChange2;
	
	//This rounds the prices to the nearest penny.
		public void format()
		{
			originPrice2 = money.format(originPrice2);
			discountPrice2 = money.format(discountPrice);
			discount2 = money.format(discount);
			totalPrice2 = money.format(totalPrice);
			moneyPaid2 = money.format(moneyPaid);
		}
		
	//This makes the user input the original price of the object they are buying.
	public void input()
	{
		System.out.println("Welcome to the automatic check-out aisle.");
		System.out.println("First, tell me the name of the item it is you're buying.");
		item = scan.nextLine();
		System.out.println("Now, please input the price of the item you're buying.");
		originPrice = scan.nextDouble();
	}
	
	//This finds the percentage of the discount, which is a random multiple of five anywhere from 5 - 75
	//and finds the discount amount in dollars
	public void discount()
	{
		discountPercent = gen.nextInt(15)*5+5;
		discount = originPrice % discountPercent;
		discountPrice = originPrice - discount;	
	}
	
	//This takes the discount price and adds a 7% tax onto it, leading to your total price.
	public void taxes()
	{
		taxes = discountPrice + discountPrice * 7;
		totalPrice = discountPrice + taxes;
	}
	
	
	
	//This tells the user all the information they need to know.
	public void output()
	{
		System.out.println("item purchased: " +item);
		System.out.println("Original Price: " +originPrice2);
		System.out.println("");
		System.out.println("Sale Percentage: " +discountPercent);
		System.out.println("Discount: " +discount2);
		System.out.println("Sales Price: " +discountPrice2);
		System.out.println("Taxes: " +taxes);
		System.out.println("");
		System.out.println("Total Price: " +totalPrice2);
		System.out.println("Money Paid: " +moneyPaid2);
		System.out.println("Your change is: " +finalChange+ "pennys, " +change2+ "nickels, " +change3+ "dimes, " +change4+ "quarters and " +change5+ "dollars.");
	}
	
	//This will give the user the correct amount of change in pennys, nickels, dimes, quarters and dollars.
	public void change()
	{
		System.out.println("Please insert money.");
		moneyPaid = scan.nextDouble();
		change1 = moneyPaid - totalPrice;

		if(change1 == 0)
		{
			
		}
		else
		{
			if(change1 > totalPrice + 0.01)
			{
				if(change1 < totalPrice + 0.05)
					{
						finalChange = change1 / 0.01;
					}
				else
				{
					if(change1 > totalPrice +0.05)
					{
						if(change1 < totalPrice + 0.10)
						{
							change2 = change1 / 0.05;
							finalChange = change2 / 0.01;
						}
						else
						{
							if(change1 > totalPrice +0.10)
							{
								if(change1 < totalPrice + 0.25)
								{
									change3 = change1 / 0.10;
									change2 = change3 / 0.05;
									finalChange = change2 / 0.01;
								}
								else
								{
									if(change1 > totalPrice +0.25)
									{
										if(change1 < totalPrice + 1.00)
										{
											change4 = change1 / 0.25;
											change3 = change4 / 0.10;
											change2 = change3 / 0.05;
											finalChange = change2 / 0.01;
										}
										else
										{
											if(change1 > totalPrice +1.00);
											{
												change5 = change1 / 1.00;
												change4 = change5 / 0.25;
												change3 = change4 / 0.10;
												change2 = change3 / 0.05;
												finalChange = change2 / 0.01;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}	
	
	//This restarts the program if the user agrees to do so.
	public void restartProgram()
	{
		while(restart.equalsIgnoreCase("yes"))
		{
			runProgram();
			System.out.println("Do you have any more items?");
			restart = scan.nextLine();
		}
		System.out.println("Thank you for using the automated cash register!");
		System.out.println("Have a nice day!");
	}
	
	//This runs all the methods in the appropriate order.
	public void runProgram()
	{
		format();
		input();
		discount();
		taxes();
		change();
		output();
	}
	
	public static void main(String[] args)
	{
		CashRegister bob = new CashRegister();
		bob.restartProgram();
	}

}
