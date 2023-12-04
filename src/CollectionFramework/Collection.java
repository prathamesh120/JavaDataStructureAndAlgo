package CollectionFramework;
import java.util.*;

public class Collection {
	
	public static void main(String[] args) {
		
		/*
		 * creating collection
		 * 1)Type Safe- same type of elements(objects) are added to collection
		 * 2)Un Type safe- different types of elements can be added to collection
		 * 
		 */
		
		//Type safe collection
		//Ordered preserved, duplicates allowed, Index collection
		ArrayList<String> names =new ArrayList<String>();
		names.add("Ram");
		names.add("Only string");
	
		System.out.println(names);
		System.out.println(names.get(0));
		//un type safe
		LinkedList list = new LinkedList();
		list.add("krishna");
		list.add(3344);
		list.add(true);
		System.out.println(list);
		
		
	}

}
