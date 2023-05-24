package javaprograms;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int i,j,k;
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter first num1: ");
		i=scn.nextInt();
		System.out.println("Enter first num2: ");
		j=scn.nextInt();
				try
				{
					System.out.println("Inside try block");
					k=i/j;
					System.out.println(k);
					System.out.println("No exception occurs");
				}
				catch(ArithmeticException e)
				{
					System.out.println("Exception handled by Catch ");
					System.out.println(e);
					// / by zero
				}
		System.out.println("Programs ends here...");
	
	}

}
