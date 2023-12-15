package stack.stackUsingLinkedList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack newStack = new Stack();
		newStack.push(1);
		newStack.push(2);
		newStack.push(3);
		newStack.push(4);
		newStack.push(5);
		boolean result = newStack.isEmpty();
		System.out.println(result);
		System.out.println(newStack.pop());
		System.out.println(newStack.pop());
		System.out.println(newStack.peek());
		System.out.println(newStack.peek());
		newStack.deleteStack();


	}

}
