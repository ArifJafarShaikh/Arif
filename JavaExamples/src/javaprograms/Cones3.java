package javaprograms;

public class Cones3 {

	int roll;
	double salary;

	
	Cones3(int r,double s){
		roll=r;
		salary=s;
	}
	void display() {
		System.out.println(roll + " " + salary);
	}


	
	public static void main(String[] args) {
		
Cones3 dis = new Cones3(104,105.35);
dis.display();

Cones3 dis2=new Cones3(111,786.35);
dis2.display();

Cones3 dis3=new Cones3(786,111.55);
dis3.display();
	}

}
