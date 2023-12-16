package queue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueArray q = new QueueArray(5);
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		q.enQueue(4);
		q.enQueue(5);
		System.out.println(q.isFull());
		System.out.println(q.isEmpty());
		System.out.println(q.deQueue());
		int result = q.peek();
		System.out.println(result);
		System.out.println(result);
		System.out.println(result);


	}

}
