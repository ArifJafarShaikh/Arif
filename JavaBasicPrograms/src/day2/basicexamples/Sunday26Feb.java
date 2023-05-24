package day2.basicexamples;

public class Sunday26Feb {

	public static void main(String[] args) {
		int a=5,b=10;
		int c=a+b;
		System.out.println(c);
		
		double d=3,e=5;
		double f=d*e;
		System.out.println(f);
		
		for(char c1='a';c1<'b';c1++)
			
		{
			int ascii=c1;
		System.out.println(ascii);
		}
		
		//Quotient
	int	k=50,p=5;
		int l=k/p;
		System.out.println(l);
		
		//reminder
		int m=k%p;
		System.out.println(m);
		
	//	check wheather the no is even or odd using if else statement
		int q=10;
	//	int n=q/2;
		if(q%2==0)
		{
			System.out.println("even no");
		}
		else
		{
			System.out.println("odd no");
		}
		
		//check wheather the alphabet is vowel or consonent using if else statement
		char ch='a';
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");

		//check wheather the number is positive or negative using if else statement
		
		int in=12;
		if(in>0)
		{
			System.out.println("The no is positive no");
		}
		
		else
			{
			System.out.println("The no is negative no");
			}
		
		//Display the text 5 
		for(int i=0;i<5;i++)
		{
			System.out.println("Gm ArifBhai");
		}
		//Display the no 1 to 5 times
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
		}
		
		int num=100,sum=0;
		for(int i=1;i<=num;++i)
		{
			//sum=sum+i
		sum+=i;
		}
			System.out.println(sum);
		

//	uppercase letter using for loop in java

	char r;
	for(r='A';r<='Z';r++)
	{
		System.out.println(r);
	}
	char s;
	for(s='a';s<='z';s++)
	{
		System.out.println(s);
	}
//	factors of a positive integer using for loop in java
	
	int number = 60;



    // loop runs from 1 to 60
    for (int i = 1; i <= number; ++i) {

      // if number is divided by i
      // i is the factor
      if (number % i == 0) {
        System.out.print(i + " ");
      }
			
	}
    
  // count number of digits in an integer using while loop in java
    int count=0, num1=56789;
    while(num1 !=0)
    {
    	num1 /= 10;
    	count++;
    }
    System.out.println(count);
    
	}
}



	




