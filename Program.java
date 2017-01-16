import java.util.Scanner;

public class Program
{
Scanner scanner = new Scanner (System.in);

public static void main(String [] args)
{
System.out.print("Hello");
Program program = new Program ();
program.start ();
}

public void start ()
{
int a = input ("First number : ");
int b = input ("Second number: ");
System.out.println ("sum of numbers: " + sum (a, b));
}

public int input (String text)
{
System.out.print (text + ": ");
return scanner.nextInt ();
}

public int sum (int a, int b)
{
return a + b;
}
}