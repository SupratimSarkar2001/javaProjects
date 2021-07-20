package javaopp;

class hi implements Runnable{

 public void run() {	
	for(int i=0 ;i< 5;i++) {
		System.out.println("hi");
//		try{
//			Thread.sleep(500);
//		}
//		catch(Exception e) {
//			
//		}
	}
 }	
}
class hello  implements Runnable{
	 public void run() {	
		for(int i=0 ;i< 5;i++) {
			System.out.println("hello");
//			try{
//				Thread.sleep(500);
//			}
//			catch(Exception e) {
//				
//			}
		}
	 }	
	}

public class MultiThreading{
    
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		hi obj1= new hi();
		hello obj2= new hello();
		Thread t1= new Thread(obj1,"hi Thread");
		Thread t2= new Thread(obj2,"hello Thread");
		t1.start();
		//try { Thread.sleep(10);}catch(Exception e) {}
		t2.start();
//		t1.setName("hi Thread");
//		t2.setName("hello thread");
		t1.setPriority(1);
		t2.setPriority(10);
	     System.out.println(t1.getName());
	     System.out.println(t2.getName());
	     System.out.println(t1.getPriority());
	     System.out.println(t2.getPriority());
		t1.join();
		t2.join();
		
		System.out.println("The end..");

	}

}
