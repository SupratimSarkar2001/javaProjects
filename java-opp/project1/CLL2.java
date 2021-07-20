package project1;

public class CLL2 {
	static class Node{
		int data;
		Node next;
	}
	static Node pushAtempty(Node last,int data) {
		if(last != null) {
			return last;
		}
		Node temp=new Node();
		temp.data=data;
		temp.next=temp;
		last=temp;
		return last;
		
	}
	static Node pushAtBeg(Node last,int data) {
		if(last== null) {
			last=pushAtempty(last,data);
			return last;
		}
			Node temp=new Node();
			temp.next=last.next;
			temp.data=data;
			last.next=temp;
			
			return last;
	}
	static Node pushAtend(Node last,int data) {
		Node temp=new Node();
		temp.next=last.next;
		temp.data=data;
		last.next=temp;
		last=last.next;
		
		return last;
		
	}
	static Node pushAfter(Node last,int item,int data) {
		Node p=last.next;
		Node temp=new Node();
		do {
			if(p.data==item) {
				temp.data=data;
				temp.next=p.next;
				p.next=temp;
				
				if(p==last) {
					last=temp;
				return last;	
				}
			}
			p=p.next;
		}while(p !=last.next);
		return last;
		
	}
	static void travasl(Node last) {
		Node temp=last.next;
		do {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}while(temp != last.next);
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node last= null;
		last=pushAtempty(last,12);
		last=pushAtBeg(last,22);
		last=pushAtend(last,30);
		last=pushAfter(last,12,80);
		travasl(last);

	}

}
