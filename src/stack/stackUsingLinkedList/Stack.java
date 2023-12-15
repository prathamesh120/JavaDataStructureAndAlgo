package stack.stackUsingLinkedList;

public class Stack {
      
	LinkedList ll;
	public Stack() {
		ll = new LinkedList();
		
		
	}
	
	
	// Push method
	public void push(int value) {
		ll.insertInLinkedList(value, 0);
		System.out.println("Inserted "+value+" in Stack");
	}
	
	// isEmpty
	public boolean isEmpty() {
		if(ll.head == null) {
			return true;
		}else {
			return false;
		}
	}
	
	// Pop 
	public int pop() {
		int result = -1;
		if(isEmpty()) {
			System.out.println("The Stack is Empty!");
		}else {
			result = ll.head.value;
			ll.deletionOfNode(0);
		}
		return result;
	}
	
	//Peek 
	public int peek() {
		if(isEmpty()) {
			System.out.println("The Stack is Empty!");
			return -1;
		}else {
			return ll.head.value;
			
		}
	}
	
	// delete stack
	
	public void deleteStack() {
		ll.head = null;
		System.out.println("The Stack is deleted");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
