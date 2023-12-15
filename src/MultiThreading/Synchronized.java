package MultiThreading;

public class Synchronized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d1 = new Display();
		MyThread t1 = new MyThread(d1, "Rama");
		MyThread t2 = new MyThread(d1, "Krishna");
		MyThread t3 = new MyThread(d1, "Ganesha");
		MyThread t4 = new MyThread(d1, "Balaji");
		MyThread t5 = new MyThread(d1, "Shiva");
		MyThread t6 = new MyThread(d1, "Vishnu");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		

	}

}

class Display{
	 public synchronized void wish(String name) {
	    	for(int i= 0; i< 10; i++) {
	    		System.out.print("Shree ");
	    		try{
	    			
	    			Thread.sleep(1000);
	    		}catch(InterruptedException e) {
	    			
	    		}
	    		System.out.println(name);
	    		
	    	}
	    }
}

class MyThread extends Thread{
	Display d;
	String name;
	MyThread(Display d, String name){
		this.d= d;
		this.name = name;
	}
	public void run() {
		d.wish(name);
	}
}
