package javaprograms;
class fruits{
	int fruitAge;
	fruits() {
		System.out.println("fruit class cons..");
		fruitAge = 7;
	}
	public void taste() {
		System.out.println("Fruits are sweet");
	}
}
	class orange extends fruits
	{
		int fruitAge;
		orange()
		{
			System.out.println("orange class cons.....");
			fruitAge=5;
		}
		public void teste()
		{
			System.out.println("orange are sweet");
		}
		public void shape()
		{
			System.out.println("orange round");
			System.out.println(fruitAge);
			System.out.println(super.fruitAge);
			
			taste();
//			fruits age=new fruits();
//			age.taste();
			
		super.taste();
			
			
		}
	}
	


public class March23 {

	public static void main(String[] args) {
		orange o=new orange();
		o.shape();
	}
}
	

	
	
