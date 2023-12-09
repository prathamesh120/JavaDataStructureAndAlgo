package LinkedList.CircularDoublyLinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
		cdll.createCDLL(1);
		System.out.println(cdll.head.value);
		for(int i =1 ; i< 10; i++) {
			cdll.insertNode(i+7, i);
		}
		
		System.out.println(cdll.head.next.value);
		cdll.treverseCDLL();
		cdll.reverseTraversalCDLL();
		cdll.searchNode(14);
		cdll.deleteNode(5);
		cdll.treverseCDLL();
		cdll.deleteCDLL();
		cdll.treverseCDLL();
	}

}
