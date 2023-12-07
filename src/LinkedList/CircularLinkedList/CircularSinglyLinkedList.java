package LinkedList.CircularLinkedList;

public class CircularSinglyLinkedList {
		
	public node head;
	public node tail;
	public int size;
	
	public node createCSLL(int nodeValue) {
		head = new node();
		node nod = new node();
		nod.value = nodeValue;
		nod.next = nod;
		head = nod;
		tail = nod;
		size = 1;
		return head;
		
	}
	
	
	// Insert node at the beginning of the circular singly linked list
	
	public void insertCSLL(int nodeValue, int location) {
	     
	     node nod = new node();
	     nod.value = nodeValue;
	     if(head == null) {
	    	 createCSLL(nodeValue);
	    	 return;
	    	 
	     }else if(location == 0) {
	    	 nod.next = head;
	    	 head = nod;
	    	 tail.next = head;
	    	 
	     }else if(location >= size) {
	    	 tail.next = nod;
	    	 tail = nod;
	    	 tail.next =head;
	     }else {
	    	 node tempNode = head;
	    	 int index = 0;
	    	 while(index < location - 1){
	    		 tempNode = tempNode.next;
	    		 index++;
	    	 }
	    	 nod.next = tempNode.next;
	    	 tempNode.next = nod;
	     }
	     size++;
	     
	     
	}
	// Traversl method  time and space complexity is O(N) and space O(1)
	public void traverseCSLL() {
	if(head != null) {
		node tempNode = head;
		for(int i =0; i<size; i++) {
			System.out.print(tempNode.value);
		if(i != size -1) {
			System.out.print(" -> ");
		}
		tempNode = tempNode.next;
		}
		System.out.println("\n");
	}else {
		System.out.println("\n CSLL does not exist!");
	}
	}
	
	
	// Search Method time O(N) spaceO(1)
	
	public boolean searchNode(int nodeValue) {
		if(head != null) {
			node tempNode = head;
			for(int i=0; i<size; i++) {
				if(tempNode.value == nodeValue) {
				System.out.println("Found node at location: " + i);
				System.out.println("\n \n");
				return true;
			}
			tempNode = tempNode.next;
		}

		
	}
	System.out.println("Node not found! ");
	return false;
	
	}
	
	// Delete Method time  O(N) space O(1)
	public void deleteNode(int location) {
		if(head == null) {
			System.out.println("The CSLL does not exist: ");
			return;
		}else if(location == 0) {
			head = head.next;
			tail.next = head;
			size--;
			if(size == 0) {
				tail = null;
				head.next = null;
				head = null;
			}
		}else if(location >= size) {
			node tempNode = head;
			for(int i =0; i< size-1; i++) {
				tempNode = tempNode.next;
				
			}
			if(tempNode == head) {
				head.next = null;
			    head = null;
			    size --;
				return;
			}
			tempNode.next = head;
			tail = tempNode;
			size--;
		}else {
			node tempNode = head;
			for(int i = 0; i< location-1; i++) {
			    tempNode = tempNode.next;	
			}		
			tempNode.next = tempNode.next.next;
			size--;
			}
			
	}
	
	
	// Delete entire Circular singly linked List
	
	
	public void deleteCSLL() {
		if(head == null) {
			System.out.println("The CSLL does not exist ");
		}else {
			head =null;
			tail.next = null;
			tail = null;
			System.out.println("The CSLL has been deleted!");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
