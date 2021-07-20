package project1;

public class linkedlist1 {
	Node head;
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data=d;
			next=null;	
		}
	}
	public void printlist() {
		Node n=head;
		while(n!=null) {
			System.out.print(n.data+" ");
			n=n.next;
	
		}
		
		
	}

	public static void main(String[] args) {
		linkedlist1 list=new linkedlist1();
		list.head= new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		
		list.head.next=second;
		second.next=third;
		
		list.printlist();
	}

}
