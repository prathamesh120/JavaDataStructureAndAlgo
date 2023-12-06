package CollectionFramework;
import java.util.*;
public class arraylist {
    
	 public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(1);
		l.add(333);
	   System.out.println(l);
	   
	   ArrayList<Integer> numbers = new ArrayList<Integer>();
	   System.out.println(numbers);
	   numbers.add(1);
	   numbers.add(2);
	   numbers.add(3);
	   System.out.println(numbers);
	   ArrayList<String> stringList = new ArrayList<String>();//time complexity O(1
	   stringList.add("ab");
	   stringList.add("ram");
	   stringList.add(1, "ss");
	   System.out.println(stringList);
	   System.out.println(stringList.get(2)); //O(1) both
	   //traversal
	   
	   for (int i =0; i< numbers.size(); i++) { // O(N) s O(1)
		   int letter = numbers.get(i);
		   System.out.println(letter);
	   }
	   
	   for(String letter: stringList) { // Time O(N) Space O(1)
		   System.out.println(letter);
	   }
	   
	   Iterator<String> iterator = stringList.iterator();
	   while(iterator.hasNext()) {//O(N) and O(1)
		   String letter = iterator.next();
		   System.out.println(letter);
	   }
	   
	   for(String letter: stringList) {
		   if(letter.equals("F")) {
			   System.out.println("The element is found");
			   break;
		   }else {
			   System.out.println("The element not found");
		   }
	   }
	   
	   //indexOf
	   int index = stringList.indexOf("ram");  // time O(N) space O(1)
	   System.out.println("The element is found at index: "+index);
	   
	   
	   // Delete element
	   
	   stringList.remove("ram");
	   System.out.println(stringList);
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   }
}
