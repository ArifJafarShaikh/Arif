package day2.basicexamples;

class Example2 {
//It is mandatory to have class name and source file name as same ?
//no,if the class is not declared as public otherwise yes
	
	
	
	public static void main(String[] args) {
		System.out.println("Allah Huakbar");
		
		int x=20;
		int y=30;
	int	z=x+y;
System.out.println("The addition of x+y is :" +x+y);
System.out.println("The addition of x+y is :" +(x+y));

x=15;
y=15;
z=x-y;
System.out.println("The substractioon of x+y is :" + z);

z=x*y;

System.out.println("The multiplication of x+y is :" + z);

z=x%y;
System.out.println("The mod of x+y is :" + z);

z=x/y;
System.out.println("The dividion of x+y is :" + z);

int num1=25; 
int num2=5;

double result=num1/num2 ;
System.out.println("The dividion of x+y is :" + result);

double area,pi,r;


pi=5;
r=2;

area=pi*r*r;

System.out.println("Arif is :"+ area);

int p,t;
double SI;
p=4;
t=5;
r=2;

SI=p*r*t/100;

System.out.println("Arif is :"+ SI);

	}

}
