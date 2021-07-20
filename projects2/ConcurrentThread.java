package projects2;
public class ConcurrentThread  {
	public static void main(String[] args) {
	thread2 j1=new thread2();
	Thread t1=new Thread(j1);
	t1.start();
	thread1 j2=new thread1();
	Thread t2=new Thread(j2);
	t2.start();			
}
	
}
class thread1 implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
		System.out.println("Thread 2 is Running");
		try {
			Thread.sleep(2000);
		}
		catch(Exception e) {
			
		}
			
		}
	}
	
}
class thread2 implements Runnable {
	public void run() {
		for(int i=1;i<=5;i++) {
		System.out.println("Thread 1 is Running");
		try {
			Thread.sleep(2000);
		}
		catch(Exception e) {
			
		}
			
		}
	}
	
}
