package Assignment6_;

import java.util.HashSet;
import java.util.Set;

public class Collection2 {

	public static void main(String [] args)
	{
		
	Set<Integer> set= new HashSet<>();
	set.add(12);
	set.add(24);
	set.add(36);
	set.add(48);
	set.add(60);
	set.add(72);
	set.add(84);
	set.add(96);
	set.add(108);
	set.add(120);
	 set.add(12);// when we try to input duplicate valueshashset will ignore it
	System.out.println(set);
	
	
	
	}
	
	
}