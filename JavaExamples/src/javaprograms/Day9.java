package javaprograms;

public class Day9 {

	public static void main(String[] args) {
		boolean b1 = true, b2 = false;
		System.out.println("and "+(b1 && b2));
		
		System.out.println("or "+(b1 || b2));
		
		System.out.println("!(bool1 && bool2) = " + !(b1 && b2));
		
		int num1 = 5, num2 = 55;
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);

		boolean res=(num1==num2);
		System.out.println(res);
		
		System.out.println("num1 || num2 = " + (num1 == num2));//
		
		System.out.println("num1 >  num2 = " + (num1 > num2));// 
		
		System.out.println("num1 <  num2 = " + (num1 < num2));// 
		
		int a=50;
		int b=a;
		
		int k=a--;
		
		
		System.out.println(k);
		System.out.println(a);
		
		
		a = 7;
		b = a-- + --a + --a + a;
	
		System.out.println("a: "+a);//
		System.out.println("b: "+b);// 

		

       //7+5+4+4
		
		
		

	}

}
