package javaprograms;

public class Pyamid {

	public static void main(String[] args) {
		for(int i=1;i<6;i++)
		{
			for(int j=1;j<=i;j++)  //no of lines in pyramid
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
System.out.println("************************************");

for(int i=1;i<6;i++)
{
	for(int j=1;j<=i;j++)
	{
		System.out.print(i+" ");
	}
	System.out.println();
}
for(int i=1;i<6;i++)
{
	for(int j=1;j<=i;j++)
	{
		System.out.print("* ");
	}
	System.out.println();
}
System.out.println("************************************");

for(char i='a';i<'f';i++)
{
	for(char j='a';j<=i;j++)
	{
		System.out.print(j+" ");
	}
	System.out.println();
}

System.out.println("************************************");

for(int i=5;i>0;i--)
{
	for(int j=i;j>0;j--)
	{
		System.out.print(j+" ");
	}
	System.out.println();
}
		
System.out.println("************************************");
for(int i=5;i>0;i--)
{
	for(int j=i;j>0;j--)
	{
		System.out.print("* ");
	}
	System.out.println();
}
System.out.println("************************************");
for(int i=0;i<5;i++)
{
	for(int j=5-i;j>1;j--)
	{
		System.out.print(" ");
	}
	
	
	System.out.println();
}

System.out.println("************************************");

/*int i, j, row = 8; 
for (i=0; i<row; i++)
{
	for (j=row-i; j>1; j--) 
	{
		System.out.print(" ");  
     }
	for (j=0; j<=i; j++ )   
	{
		System.out.print("* ");
	}
	System.out.println();   
}*/
System.out.println("************************************");

//int i, j, row = 8; 
for (int i=1; i<8; i++)
{
	for (int j=8-i; j>1; j--) 
	{
		System.out.print(" ");  
     }
	for (int j=1; j<=i; j++ )   
	{
		System.out.print(j +" ");   
	}
	System.out.println();   
}



	}

}
