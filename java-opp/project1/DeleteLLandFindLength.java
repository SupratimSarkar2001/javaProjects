package project1;

public class DeleteLLandFindLength {
	Node head;
	class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	public void find(int key) {
		Node current= head;
		while(current != null) {
			if(current.data== key) {
				System.out.println("the element is found");
				return;
			}
			current=current.next;
		}
		System.out.println("the element isnt present");
	}
	public void delete() {
		head=null;
	}
	public void length() {
		Node temp=head;
		int count=0;
		while(temp != null) {
			count++;
			temp=temp.next;
			
		}
		System.out.println("the length of the linked list is :"+ count);
	}
	public void push(int data1) {
		Node new_node=new Node(data1);
		new_node.next=head;
		head=new_node;
	}
	public void print() {
		Node n=head;
		while(n!= null) {
			System.out.print(n.data+" ");
			n=n.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeleteLLandFindLength dl= new DeleteLLandFindLength();
		dl.push(55);
		dl.push(88);
		dl.push(75);
		dl.push(5);
		dl.push(8);
		dl.push(65);
		dl.print();
	    System.out.println();
		dl.length();
		// find a element in the linked list----------------------->
		dl.find(8);
		//dl.delete();
		//dl.print();
		//System.out.println("end");
		

	}

}
