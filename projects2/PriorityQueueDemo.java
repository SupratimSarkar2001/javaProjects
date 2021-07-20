package projects2;

import java.util.Iterator;
import java.util.PriorityQueue;



public class PriorityQueueDemo {
	public static void main(String args[])
    {
        // Creating empty priority queue
       /* PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
 
        // Adding items to the pQueue using add()
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);
 
        // Printing the top element of PriorityQueue
        System.out.println(pQueue.peek());
 
        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(pQueue.poll());
 
      
        System.out.println(pQueue.peek());*/
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("hello");
		pq.add("everyone");
		pq.add("how are youu....");
		pq.add("everyone");
		System.out.println(pq);
		/*pq.remove("everyone");
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq.peek());*/
		
		Iterator iterator = pq.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
	
    }

}
