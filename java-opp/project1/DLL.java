package project1;

public class DLL {
	Node head;
	class Node{
		int data;
		Node prev;
		Node next;
		Node(int d){
			data=d;
		}
	}
	
	public void push(int data1) {
		Node new_node = new Node(data1);
		new_node.prev=null;
		if(head== null) {
			new_node.next=null;
		}else {
		new_node.next= head;
		head.prev= new_node;
		}
		
		head= new_node;
	}	
	 void append(int data2) {
		Node new_node = new Node(data2);
		new_node.next= null;
		if(head == null) {
			new_node.prev= null;
			head= new_node;
			return;
		}
		Node temp= head;
		while(temp.next != null) {
			temp= temp.next;
		}
		new_node.prev=temp;
		temp.next=new_node;
		
		
		
	 }
	 public void insertAfter(Node n,int data3) {
		 if(head== null) {
			 System.out.println("insertion after a null node cant be possible.... ");
			 return;
		 }
		 Node new_node = new Node(data3);
		 new_node.next=n.next;
		 new_node.prev=n;
		 n.next=new_node;
		 if(new_node.next != null) {
			 new_node.next.prev= new_node;
		 }

		 
		 
	 }
	    void reverse()
	    {
	        Node temp = null;
	        Node current = head;
	 
	        
	        while (current != null) {
	            temp = current.prev;
	            current.prev = current.next;
	            current.next = temp;
	            current = current.prev;
	        }
	 

	        if (temp != null) {
	            head = temp.prev;
	        }
	    }
	public void print(Node node) {
        Node last = null;
        System.out.println("Traversal in forward Direction");
        while (node != null) {
            System.out.print(node.data + " ");
            last = node;
            node = node.next;
        }
        System.out.println();
        System.out.println("Traversal in reverse direction");
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.prev;
        }

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DLL d= new DLL();
		d.push(6);
		d.push(7);
		d.append(5);
		d.insertAfter(d.head.next,4);
		d.print(d.head);
		System.out.println();
		d.reverse();
		d.print(d.head);

	}

}
