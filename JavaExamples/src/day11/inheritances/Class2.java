package day11.inheritances;



	 class info
		{
			void display()
			{
				System.out.println("i am void method");
			}
		}
		 
		 class emp extends info
		 {
			 void country()
			 {
				 System.out.println("I am emp method");
			 }
		 }
		 public class Class2 {
	public static void main(String[] args) {
	
		emp e1=new emp();
		e1.country();
		e1.display();

	}

}
