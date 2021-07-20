package projects2;

public class ExtendingRunnable implements Runnable  {
	
	public void run() {
		System.out.println("Thread is created by extending Runnable interface.");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtendingRunnable er= new ExtendingRunnable();
		Thread t= new Thread(er);
		t.start();

	}

}
