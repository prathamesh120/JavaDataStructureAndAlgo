package stack;

public class main {

	public static void main(String[] args) {
		Stack newStack = new Stack(4);
		boolean result = newStack.isEmpty();
		System.out.println(result);
		System.out.println(newStack.isFull());
		newStack.push(5);
		newStack.push(45);
		newStack.push(59);
		newStack.push(8);
		System.out.println(newStack.pop());
		System.out.println(newStack.peek());
		newStack.deleteStack();
		
		
	}
}
