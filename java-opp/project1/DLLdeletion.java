package project1;

import project1.DLL.Node;

public class DLLdeletion {
	Node head;
	class Node{
		int data;
		Node next;
		Node prev;
		
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
	public void delete(Node n) {
		if(head== null || n == null) {
			return ;
		}
		if(head== n) {
			head=head.next;
		}
		if(n.next != null) {
			n.next.prev=n.prev;
			
		}
		if(n.prev != null) {
			n.prev.next= n.next;
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
		
		DLLdeletion dll = new DLLdeletion ();
		dll.push(2);
		dll.push(4);
		dll.push(6);
		dll.push(7);
		dll.push(8);
		dll.push(9);
		dll.print(dll.head);
		System.out.println();
		dll.delete(dll.head.next);
		dll.print(dll.head);
		System.out.println();
		dll.delete(dll.head);
		dll.print(dll.head);
		System.out.println();
		dll.delete(dll.head.next.next.next);
		dll.print(dll.head);
		

	}

}
