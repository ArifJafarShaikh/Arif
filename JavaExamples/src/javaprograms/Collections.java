package javaprograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collections {

	public static void main(String[] args) {
		List l1=new ArrayList();
		
		l1.add("Arif");
		l1.add(414105);
		l1.add("Pune");
		l1.add("null");
		l1.add("Pune");
		
	System.out.println(	l1.get(0));
	System.out.println(	l1.get(1));
	System.out.println(	l1.get(2));
	
System.out.println(	l1.size());
l1.add(1, "java");
	System.out.println(l1);
	
	for(int i=0;i<l1.size();i++)
	{
		System.out.println("Element at index" + i+ " "+ l1.get(i));
	}
		for(Object obj :l1)
		{
			System.out.println(obj);
		}
		
	Iterator it =	l1.iterator();
	
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
		

	}

}
