package projects2;

class MyRunnable implements Runnable{
	 
	  public void run() {
	    System.out.println("Running....");	
	    try {
	      Thread.sleep(500);
	    } catch (InterruptedException e) {

	    }
	  }	
	}

	public class JoinAlive {

	  public static void main(String[] args) {
	    Thread t1 = new Thread(new MyRunnable());
	    Thread t2 = new Thread(new MyRunnable());
	    Thread t3 = new Thread(new MyRunnable());
	    Thread t4 = new Thread(new MyRunnable());
	    Thread t5 = new Thread(new MyRunnable());
	    
	    t1.start();
	    t2.start();
	    t3.start();
	    t4.start();
	    t5.start();
	        
	    System.out.println("Is t1 Alive " + t1.isAlive());
	    System.out.println("Is t2 Alive " + t2.isAlive());
	    System.out.println("Is t3 Alive " + t3.isAlive());	
	    System.out.println("Is t4 Alive " + t4.isAlive());
	    System.out.println("Is t5 Alive " + t5.isAlive());
	    try {
	      t1.join();
	      t2.join();
	      t3.join();
	      t4.join();
	      t5.join();
	    } catch (InterruptedException e) {
	      
	    }
	        
	    System.out.println("Is t1 Alive " + t1.isAlive());
	    System.out.println("Is t2 Alive " + t2.isAlive());
	    System.out.println("Is t3 Alive " + t3.isAlive());
	    System.out.println("Is t4 Alive " + t4.isAlive());
	    System.out.println("Is t5 Alive " + t5.isAlive());

	    
	  }
	}
