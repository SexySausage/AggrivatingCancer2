package classWork;
import java.util.Random;

public class RandomStuff
{
	int num1, num2, num3, num4;
	double num5, num6;
	
	Random gen = new Random();
	
	public void randomness()
	{
		num5 = gen.nextDouble();
		System.out.println("A random double is " +num5);
		
		num1 = gen.nextInt();
		System.out.println("A random int is " +num1);
		
		num2 = gen.nextInt(10);
		System.out.println("A random nextInt(10) is " +num2);
	}
	
	public void dice()
	{
		int count = 0;
		int countTotal = 0;
		while(count < 10000)
		{
			count = 0;
			num3 = 0;
		while(num3 != 6)
			{
			num3 = gen.nextInt(6)+1;
			count++;
			countTotal++;
			System.out.println("You rolled a "+num3+ " count = "+count+ "" +countTotal);
			}
		}
	}
	
	public static void main(String[] args)
	{
		RandomStuff bob = new RandomStuff();
		bob.dice();

	}

}
