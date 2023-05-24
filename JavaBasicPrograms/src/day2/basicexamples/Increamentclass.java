package day2.basicexamples;

public class Increamentclass {

	public static void main(String[] args) {
		int a=95,b,c=50;
		b=a++;
		
		int x=a,y;
		System.out.println();
		
		
		if(a>b)
		{
			System.out.println("a is ok");
			if(a>c)
			{
				System.out.println("a is greater to c");
			}
			else
			{
				
					System.out.println("c is greater to a");
				
			}
			
		}
		else
		{
			System.out.println("b is ok");
		}

	
	int i=-5;
	if(i>0)
	{
		System.out.println("Positive no");
	}
	else if(i<0)
	{
		System.out.println("Negative no");
	}
	else
	{
		System.out.println("Zero");
	}

}
}