package javaopp;

public class PriorityQueue {
	static class Node{
		int data;
		int priority;
		Node next;
	}
	static Node newNode(int d,int p) {
		 Node temp= new Node();
		 temp.data=d;
		 temp.priority=p;
		 temp.next= null;
		 
		 return temp;
	}
	
	static int peek(Node head) {
		return head.data;
	}
	static Node pop(Node head) {
		int temp= head.data;
		head= head.next;
		
		return head;
	}
	static boolean isEmpty(Node head) {
		if(head== null) {
			return true;
		}else {
			return false;
		}
	}
	static Node push(Node head,int d,int p) {
		Node start=head;
		Node temp=newNode(d,p);
		
		if(temp.priority<head.priority) {
			temp.next=head;
			head=temp;
		}else {
			while(start.next != null && start.next.priority>p) {
			start=start.next;
			}
			temp.next=start.next;
			start.next=temp;
		}
		return head;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node pq = newNode(4, 1);
		pq =push(pq, 5, 2);
		pq =push(pq, 6, 3);
		pq =push(pq, 7, 0);
		
		while(!isEmpty(pq)) {
			System.out.printf("%d ", peek(pq));
			pq=pop(pq);
		}

	}

}
