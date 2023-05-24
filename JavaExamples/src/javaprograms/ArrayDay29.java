package javaprograms;

public class ArrayDay29 {

	public static void main(String[] args) {
		int a=10,b=20,c=30,d=40,e=50;
		
		int[] arr=new int[5];
		System.out.println(arr[3]);
		
	System.out.println(arr.length);
	int id=101;
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=id;
		
		System.out.println(arr[i]);
		id++;
	}
		System.out.println("****************************");
		
		boolean status[]= {true,false,true,true,false};
		
	for(int i=0;i<status.length;i++)
	{
		System.out.println(status[i]);
	}
	}

}
