package javaprograms;

public class BoxingOperation {

	public static void main(String[] args) {
		Double d1=25.50;
		System.out.println(d1);
		
		double d2=d1.doubleValue();
		System.out.println(d2);
		
		Boolean b1=true;
		
		System.out.println(b1);
		boolean b2=b1.booleanValue();
		System.out.println(b2);
		
		Character c1=new Character('A');
		
		System.out.println(c1);
		char c2=c1.charValue();
		System.out.println(c2);
		   
	}

}
