package classWork;
import java.util.Scanner;

//Per Taylor
//Period B
//3/38/2018
//Description: Learn to use SwitchStatements and stuff.
public class SwitchStuff
{
	Scanner scan = new Scanner(System.in);
	char grade;
	
	//Allows the student to input their grade.
	public void getGrade()
	{
		System.out.println("Please write your letter grade for an inspirations comment.");
		grade = scan.nextLine().charAt(0);
	}
	
	//Gives the student an inspirational quote based on their grade.
	public void comment()
	{
		switch(grade)
		{
			case 'A':
			case 'a':
				System.out.println("Thats awesome dude!");
				break;
			case 'B':
			case 'b':
				System.out.println("Keep up the great work!");
				break;
			case 'C':
			case 'c':
				System.out.println("Whats up average joe, good job!");
				break;
			case 'D':
			case 'd':
				System.out.println("C'mon now, you got this!");
				break;
			case 'F':
			case 'f':
				System.out.println("please... nevermind. Go back to sleep.");
				break;
			default:
				System.out.println("Enter A, B, C, D, or F. How hard is that?");
		}
	}
	
	public void runProgram()
	{
		getGrade();
		comment();
	}
	
	public static void main(String[] args)
	{
		SwitchStuff bob = new SwitchStuff();
		bob.runProgram();
	}

}
