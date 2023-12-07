package LinkedList.CircularLinkedList;

public class Main {
		
	public static void main(String[] args) {
		CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
		csll.createCSLL(5);
		System.out.println(csll.head.value);
		System.out.println(csll.head.next.value);
		
		csll.insertCSLL(55, 0);
		csll.insertCSLL(27, 1);
		csll.insertCSLL(38, 2);
		csll.insertCSLL(46, 3);
		csll.insertCSLL(54, 4);
		csll.insertCSLL(64, 5);
		csll.traverseCSLL();
		csll.searchNode(46);
		csll.deleteNode(3);
		csll.traverseCSLL();
		csll.deleteCSLL();
		csll.traverseCSLL();
	}
}
