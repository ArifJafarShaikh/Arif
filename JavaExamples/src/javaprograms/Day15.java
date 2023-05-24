package javaprograms;

public class Day15 {
	
	
	
	static void Display()
	{
		System.out.println("Hi im display");
	}
static void num(int l)
{
	System.out.println("Hi i'm num : " +l);
	
}
	//simple interest SI=p*n*r/100
	static double Si(int p,int n,double r)
	{
		System.out.println(p);
		System.out.println(n);
		System.out.println(r);
		
		double res =(p*n*r/100);
				return res;
	
}
	static void evenodd(int k)
	{
		if(k%2==0) 
		{
			System.out.println("k is even");
		}
		else 
		{
			System.out.println("k is odd");
		}
	}
	
	static int largest(int a,int b,int c)
	{
		int res;
		if(a>b && a>c)
		{
			res=a;
		}
		else if(b>c && b>a)
		{
			res=b;
		}
		else
		{
			res=c;
		}
		return res;
	}
	
	static void even()
	{
		int num=50;
		for(int i=1;i<=num;i++)
		if(i%2==0)
		{
			System.out.println("even num is :"+i );
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		Display();
		num(456789);
		num(123);
	System.out.println(	Si(45000,12,7.5));
	
	double amount=Si(45000,12,7.5);
	System.out.println(amount);
	
	//2% discount
	
	double discount =amount -(amount*2)/100;
		System.out.println(discount);
		
	evenodd(55);
		
	System.out.println(largest(15,5,50));
			
		
		even();
		

	}

}
