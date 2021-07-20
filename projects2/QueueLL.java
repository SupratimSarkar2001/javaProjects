package projects2;
class Qnode{
	int data;
	Qnode next;
	Qnode(int d){
		data=d;
		next= null;
		
	}
}

class Queue {
	Qnode front;
	Qnode rear;
	Queue(){
		front= null;
		rear= null;
	}
	public void Enqueue(int k) {
		Qnode new_node= new Qnode(k);
		if(rear==null) {
			front =new_node;
			rear= new_node;
		}
		rear.next= new_node;
		rear=new_node;
	}
	public int Dequeue() {
		if(front== null) {
			System.out.println("queue is empty");
			return Integer.MIN_VALUE;
		}
		Qnode temp= front;
		front=front.next;
		if(front== null) {
			rear=null;
		}
		return temp.data;
	}

}
class QueueLL{
	public static void main(String[] args) {
		Queue q= new Queue();
		q.Enqueue(21);
		q.Enqueue(22);
		q.Enqueue(23);
		q.Enqueue(24);
		q.Dequeue();
		q.Dequeue();
		System.out.println("top element is "+q.front.data);
		System.out.println("last element is"+q.rear.data);
		
	}
}
