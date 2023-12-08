package LinkedList.DoublyLinkedList;

public class Main {
   
	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.createDLL(99);
		System.out.println(dll.head.value);
		dll.insertDLL(67, 1);
		dll.insertDLL(69, 2);
		dll.insertDLL(68, 3);
		dll.insertDLL(47, 4);
		dll.insertDLL(96, 5);
		dll.insertDLL(87, 6);
		dll.insertDLL(38, 7);
		
		dll.traverseDLL();
		dll.reverseTraverseDLL();
		dll.searchNode(47);
		dll.deleteNodeDLL(5);
		dll.traverseDLL();
		dll.deleteDLL();
		dll.traverseDLL();
	}
}
