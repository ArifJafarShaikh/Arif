package javaprograms;

public class ExceptionHandling4 {

	public static void main(String[] args) {
		try
		{
			int a[] =new int[5];
			a[5]=30/0;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBounds Exception occurs "+e);
		}
		catch(ArithmeticException e) 
		{
			System.out.println("ArithmeticException" + e);
		}
		catch (Exception e) {
			System.out.println("Parent Exception occurs "+e);
		}
		finally {
			System.out.println("I will execute as me  finally block");
		}
	}

}
