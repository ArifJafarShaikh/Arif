
public class LocalGlobal {
 
	static int a=50;
	double salary=50000;
	
	
	static int arif;
	static int hasi;
	
int	shaikh=60;
int	bhai=19;
	
	public static void main(String[] args) 
	{
		
		int x,y,z;
		x=10;
		y=20;
		z=x+y;
		
		arif =44;
		hasi=50;
		System.out.println(arif);
		System.out.println(hasi);
		
		LocalGlobal lg =new LocalGlobal();
		System.out.println(lg.shaikh);
	System.out.println(	lg.bhai);
		System.out.println(lg.salary);
		
		

	}

}
