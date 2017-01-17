import java.util.Scanner;
public class sum3
{
	public static void main (String [] args)
	{
		Scanner scanner = new Scanner(System.in);
		int a; 
		int b; 
		int c; 
		int sum;
		
		System.out.println("Enter first number");
		a = scanner.nextInt();
		System.out.println("Enter second number");
		b = scanner.nextInt();
		System.out.println("Enter third number");
		c = scanner.nextInt();
		sum = a + b + c;
		System.out.println ("sum of theese 3 numbers is: " +sum);
		
	}
}