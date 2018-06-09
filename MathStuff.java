package classWork;
import java.text.DecimalFormat;
import java.util.Random;

//Per Taylor
//Period B
//March 1, 2018
//Learn about math and stuff.

public class MathStuff
{
	int num1, num2, num3;
	double num4, num5, num6, num7, num8;
	
	Random gen = new Random();
	DecimalFormat dec3 = new DecimalFormat("0.000");
	DecimalFormat money = new DecimalFormat("$0.00");
	DecimalFormat percent = new DecimalFormat("0.0%");
	DecimalFormat feet = new DecimalFormat("0.0 feet");
	
	public void doMath()
	{
		num4 = gen.nextDouble()*40+10;
		System.out.println("A random number between 10 and 50 is " +num4);
		
		num5 = Math.sqrt(num4);
		System.out.println("The square root of that number is " +num5);
		
		num6 = Math.pow(num5, 2);
		System.out.println("Num5 to the 2nd power is " +num6);
		
		num1 = gen.nextInt();
		num2 = gen.nextInt();
		num7 = Math.hypot(num1, num2);
		System.out.println("The hypotenuse of a random triangle is " +num7);
		
		num8 = Math.max(82423870, 92859285-98);
		System.out.println(num8);
		
		System.out.println("num4 using dec3 is "+ dec3.format(num4));
		System.out.println("num4 using money is "+ money.format(num4));
		System.out.println("num4 using percent is "+ percent.format(num4));
		System.out.println("num4 using feet is "+ feet.format(num4));
	}
	
	public static void main(String[] args)
	{
		MathStuff bob = new MathStuff();
		bob.doMath();
	}

}
