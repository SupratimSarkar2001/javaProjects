package javaopp;

public class DeStaQueue {
	// this is required linkedlist...
	static class Qnode{
		int data;
		Qnode next;
		Qnode prev;
	}
	//making of the dequeue.....
	static class deque{
		private Qnode head;
		private Qnode tail;
		public deque() {
			head=tail=null;
		}
		
		boolean isEmpty() {
			if(head== null) {
				return true;
			}
			else {
				return false;
			}
		}
		
		int size() {
			int len=0;
			if(isEmpty()) {
				System.out.println("empty..");
				return 0;
			}
			
			else {
				Qnode temp= head;
				
				while(temp!= null) {
					len++;
					temp=temp.next;
				}
			}
			return len;
		}
		
		void insertFront(int d) {
			Qnode temp = new Qnode();
			temp.data=d;
			if(head== null) {
				head=tail=temp;
				temp.next= null;
				temp.prev=null;
			}
			else {
				temp.next=head;
				head.prev=temp;
				temp.prev= null;
				head=temp;
			}
		}
		
		void insertRear(int d) {
			Qnode temp = new Qnode();
			temp.data=d;
			if(head== null) {
				head=tail=temp;
				temp.next= null;
				temp.prev=null;
			}
			else {
				tail.next=temp;
				temp.prev=tail;
				temp.next=null;
				tail=temp;
			}
			
		}
		void DeleteFront() {
			if(isEmpty()) {
				System.out.println("Nothing to delete...");
				return;
			}
			else {
				  head=head.next;
		          head.prev= null;
			}
		}
		void DeleteRear() {
			if(isEmpty()) {
				System.out.println("Nothing to delete...");
				return;
			}else {
				tail=tail.prev;
				tail.next=null;
				
			}
			
		}
		void display() {
			Qnode temp= head;
			
			while(temp !=null) {
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
		}
	}
	
	// implementation of stack....
	static class Stack{
		 deque dq= new deque();
		 
		 void push(int k) {
			 dq.insertFront(k);
		 }
		 void pop() {
			dq.DeleteRear();
		 }
		 int size() {
			 int n= dq.size();
			 return n;
		 }
		 void display() {
			 dq.display();
		 }
	}
	//implementation of queue.....
	static class Queue{
		 deque dq= new deque();
		 
		 void Enqueue(int k) {
			 dq.insertFront(k);
		 }
		 void Dequeue() {
			dq.DeleteFront();
		 }
		 int size() {
			 int n= dq.size();
			 return n;
		 }
		 void display() {
			 dq.display();
		 }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// stack calling......
		Stack sq= new Stack();
		sq.push(5);
		sq.push(6);
		sq.push(0);
		sq.push(30);
		sq.push(22);
		
		sq.pop();
		sq.pop();
		System.out.println("stack size is :"+sq.size());
		sq.display();
		System.out.println();
		
		//queue calling....
		
		Queue q=new Queue();
		q.Enqueue(2);
		q.Enqueue(22);
		q.Enqueue(21);
		q.Enqueue(23);
		q.Enqueue(25);
		
		
		q.Dequeue();
		q.Dequeue();
		
		System.out.println("queue size is :"+q.size());
		q.display();
	}

}
