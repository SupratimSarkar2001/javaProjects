package project1;

public class InsertionInLL {
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	public void push(int data1) {
		Node new_node=new Node(data1);
		new_node.next=head;
		head=new_node;
	}
	public void insertAt(Node Prev_node,int data2) {
		if(Prev_node.next== null) {
			System.out.println("operation can't be procced");
			return;
		}
		Node new_node=new Node(data2);
		new_node.next=Prev_node.next;
		Prev_node.next=new_node;
		
		
	}
	public void append(int data3) {
        Node new_node = new Node(data3);
        
        /* 4. If the Linked List is empty, then make the
              new node as head */
        if (head == null)
        {
            head = new Node(data3);
            return;
        }
 
        /* 4. This new node is going to be the last node, so
              make next of it as null */
        new_node.next = null;
 
        /* 5. Else traverse till the last node */
        Node last = head;
        while (last.next != null)
            last = last.next;
 
        /* 6. Change the next of last node */
        last.next = new_node;
        return;
		
	}
	public void print() {
		Node n=head;
		while(n!= null) {
			System.out.print(n.data+" ");
			n=n.next;
		}
	}
	public static void main(String[] args) {
		InsertionInLL LL=new InsertionInLL();
		LL.head= new Node(1);
		Node second = new Node(2);
		Node third=new Node(3);
		LL.head.next=second;
		second.next=third;
		LL.push(0);
		LL.insertAt(second,5);
		LL.append(6);
		LL.print();
	
	}

}
