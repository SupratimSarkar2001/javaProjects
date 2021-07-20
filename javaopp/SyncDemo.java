package javaopp;
class count{
	int countK=0;
	public synchronized void Count() {
		countK++;
	}
}

public class SyncDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		count c= new count();
    Thread t1= new Thread(new Runnable() {
    	public void run() {
    		for(int i=0 ;i<1000;i++) {
    			c.Count();
    		}
    	}
    });
    Thread t2= new Thread(new Runnable() {
    	public void run() {
    		for(int i=0 ;i<1000;i++) {
    			c.Count();
    		}
    	}
    });
    t1.start();
    t2.start();
    t1.join();
    t2.join();
	

    System.out.println(" count :"+ c.countK);
	}

}
