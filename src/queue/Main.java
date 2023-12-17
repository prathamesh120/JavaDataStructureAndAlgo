package queue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Normal Queue by array
//		QueueArray q = new QueueArray(5);
//		q.enQueue(1);
//		q.enQueue(2);
//		q.enQueue(3);
//		q.enQueue(4);
//		q.enQueue(5);
//		System.out.println(q.isFull());
//		System.out.println(q.isEmpty());
//		System.out.println(q.deQueue());
//		int result = q.peek();
//		System.out.println(result);
//		System.out.println(result);
//		System.out.println(result);
		
		//*****Circular Queue******
//		CircularQueue cq = new CircularQueue(10);
//		System.out.println(cq.isEmpty());
//		System.out.println(cq.isFull());
//		for(int i = 0 ; i< 10; i++) {
//			cq.enQueue(i+10);
//		}
//		System.out.println(cq.deQueue());
//		System.out.println(cq.deQueue());
//		System.out.println(cq.deQueue());
//		
//		System.out.println(cq.deQueue());
//		System.out.println(cq.peek());
//		System.out.println(cq.peek());
//		cq.deleteQueue();
		
	QueueLinkedList qll = new QueueLinkedList();
	System.out.println(qll.isEmpty());
     for(int i = 0; i< 10; i++) {
    	 qll.enQueue(i+23);
     }
     
     System.out.println(qll.deQueue());
     System.out.println(qll.peek());
     System.out.println(qll.peek());
	
	qll.deleteQueue();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



	}

}
