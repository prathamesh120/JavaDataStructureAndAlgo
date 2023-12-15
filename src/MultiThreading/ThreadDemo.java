package MultiThreading;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myThread t = new myThread();
		t.start();
		for(int i = 0; i< 10; i++) {
			System.out.println("This is main thread");
		
		}

	}

}
