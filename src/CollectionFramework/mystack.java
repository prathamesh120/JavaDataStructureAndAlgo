package CollectionFramework;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Stack;
import java.util.TreeSet;
import java.util.SortedSet;

public class mystack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		for(int i = 0;i<=23; i++) {
			s.push(i);
		}
		System.out.println(s);
		
		// Enumeration
		
		Enumeration e = s.elements();
		while(e.hasMoreElements()) {
			Integer I = (Integer)e.nextElement();
			System.out.println(I);
		}
		
		Iterator itr = s.iterator();
        while(itr.hasNext()) {
        	Integer n = (Integer)itr.next();
        	System.out.println(n);
        }
        
        ListIterator ltr = s.listIterator();
        while(ltr.hasNext()){
        	System.out.println(ltr.next());
        	ltr.remove();
        	ltr.add(5);
        	System.out.println(ltr.next());
        }
        
        HashSet h = new HashSet();
        h.add("b");
        h.add("c");
        h.add("e");
        h.add("p");
        h.add("b");
        h.add(null);
        System.out.println(h);
        
        
        LinkedHashSet llh = new LinkedHashSet();
        llh.add("b");
        llh.add("c");
        llh.add("e");
        llh.add("p");
        llh.add("b");
        llh.add(null);
        System.out.println(llh);
        
        SortedSet ss = new TreeSet();
        ss.add(55);
        ss.add(56);
        
        TreeSet t = new TreeSet();
        t.add("A");
        t.add("b");
        t.add("c");
        t.add("L");
        System.out.println(t);
        
        
        
        
        
        
        
        
	}

}
