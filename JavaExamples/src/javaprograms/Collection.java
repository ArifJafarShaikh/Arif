package javaprograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Collection {

	public static void main(String[] args) {
		Set<String> set=new HashSet<String>();
		set.add("Arif");
		set.add("Hasi");
		set.add("Aslya");
		set.add("Tilhya");
		
		System.out.println(set);
		System.out.println(set.size());
		
	Iterator<String> itr=	set.iterator();
	while(itr.hasNext());
	{
		System.out.println(itr.next());
	}
	System.out.println(	set.remove("Tilhya"));
	System.out.println(set);
	
	HashSet<String> set1=new HashSet<String>();
	set.addAll(set1);
	System.out.println(set);
	
	}

	}


