package javaprograms;

public class Day16 {
	int age=25;
	void display() {
		System.out.println("Hi, I am display method");
	}
	public static void main(String[] args) {
		Day16 c1=new Day16();//calling default constructor of the current class written by java compiler
		System.out.println(c1.age);
		c1.display();
		


	}

}
