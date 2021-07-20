package projects2;

public class ExtendingThread extends Thread {
    public void run() {
    	System.out.println("Thread Created by extending the Thread class.");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtendingThread et= new ExtendingThread();
		et.start();

	}

}
