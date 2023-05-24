package day2.basicexamples;

public class Staticmethodcall 
{
	public static void display()
	{
		System.out.println("Arifbhai");
		System.out.println("Bramhani");
		System.out.println("9545786351");
	}
 static void showdetails(String name,char grade,int num)
{ 
	System.out.println(name);
	System.out.println(grade);
	System.out.println(num);
}

static void addNumber() {
	int num1=20,num2=30,res;
	res=num1+num2;
	System.out.println("no 1 is :" + num1);
	System.out.println("no 2 is :" + num2);
	System.out.println("Result is :"+res);
}
	static void addNumber(int num1,int num2) {
	int res;
	res=num1+num2;
	System.out.println("no 1 is :" + num1);
	System.out.println("no 2 is :" + num2);
	System.out.println("Result is :"+res);
	
	}
	
	static double intrest(int p,int n,double r)
	{
		System.out.println(p);
		System.out.println(n);
		System.out.println(r);
		double res=(p*n*r)/100;
		return res;
	}
	
	static void evenodd(int num)
	{
		if(num%2==0)
		{
			System.out.println("The given no is even");
		}
		else
		{
			System.out.println("The given no is odd");
		}
	}
	static int largest(int n1,int n2,int n3)
	{
	int res;
	if(n1>n2 && n1>n3)
		{
		res=n1;
		
		}
	else if(n2>n1 && n2>n3)
	{
		res=n2;
		
	}
	else
	{
	    res=n3;
		
	}
	return res;
		}
	  
	
	public static void main(String[] args) {
		display();
		addNumber();
		showdetails("pune",'A',77777);
		showdetails("Mumai",'B',7799);
		addNumber(50,60);
		
double amount=(intrest(34000,18,2.0));
System.out.println(amount);

double discount=amount-(amount*2/100);
System.out.println(discount);


evenodd(50);

System.out.println(largest(15,5,50));
	}

}
