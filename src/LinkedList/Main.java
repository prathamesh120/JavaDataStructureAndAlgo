package LinkedList;

public class Main {
   
	
	public static void main(String[] args) {
		SinglyLinkedList  sll = new SinglyLinkedList();;
		sll.createSinglyLinkedList(5);
		System.out.println(sll.head.value);
		sll.insertInLinkedList(55,0 );
		System.out.println(sll.head.value);
		sll.insertInLinkedList(16,1);
		sll.insertInLinkedList(27,2);
		sll.insertInLinkedList(36,3);
		sll.insertInLinkedList(48,4);
		sll.insertInLinkedList(54,5);
		sll.insertInLinkedList(65,6);
		
		sll.traverseSinglyLinkedList();
		sll.searchNode(48);
		sll.searchNode(96);
		
		sll.deletionOfNode(4);
		sll.traverseSinglyLinkedList();
		sll.deleteSLL();
	
	
	}
}
