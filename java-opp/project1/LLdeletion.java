package project1;

public class LLdeletion {
	Node head;
	class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	public void deleteAtpos(int pos) {
		if(head== null) {
			return;
		}
		Node temp2=head;
		if(pos==0) {
			head=temp2.next;
		}
		for(int i=0;i<pos-1 && head != null;i++) {
			temp2=temp2.next;
		}
		if(temp2== null || temp2.next== null) {
			return;
		}
		Node next= temp2.next.next;
		temp2.next=next;
		
	}
	public void delete(int key) {
		Node temp=head;
		Node prev=null;
		
		if(temp != null && temp.data== key) {
			head=temp.next;
			return;
		}
		while(temp != null && temp.data!= key) {
			prev=temp;
			temp=temp.next;
		}
		if(temp == null) {
			return;
		}
		
		prev.next=temp.next;
		
	}
	public void push(int data1) {
		Node new_node= new Node(data1);
		new_node.next=head;
		head=new_node;
	}
	public void print() {
		Node n= head;
		while(n!=null) {
			System.out.print(n.data+" ");
			n=n.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LLdeletion ld= new  LLdeletion();
		 ld.push(23);
		 ld.push(69);
		 ld.push(99);
		 ld.push(66);
		 ld.push(21);
		 System.out.println("the entire list is: ");
		 ld.print();
		 System.out.println();
		 System.out.println("after deletion: ");
		 ld.delete(99);
		 ld.print();
		 System.out.println();
		 System.out.println("after deletion at position 3: ");
		 ld.deleteAtpos(3);
		 ld.print();

	}

}
