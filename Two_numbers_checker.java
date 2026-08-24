import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	  Scanner dataInput = new Scanner(System.in);
	  
	  System.out.print("Give me the first number (a): ");
	  int a = dataInput.nextInt();
	  
	  System.out.print("Give me the second number (b): ");
	  int b = dataInput.nextInt();
	  
	   // int a=80 ,b=90;
	   if (a>0)
	     if (a==b)
		System.out.println("a and b match");
		else
		System.out.println("a and b are different");
		else
		System.out.println("a is less than 0 or equal  to o");
	}
}
