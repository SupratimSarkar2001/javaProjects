package projects2;

public class StackLL {
	StackNode head;
	class StackNode{
		int data;
		StackNode next;
		StackNode(int d){
			data=d;
		}
	}
   public boolean isEmpty() {
	   if(head== null) {
		   return true;
	   }
	   else {
		   return false;
	   }
   }
   public void push(int x) {
	   StackNode newnode= new StackNode(x);
	   if(head == null) {
		   head= newnode;
	   }
	   else {
		   StackNode temp= head;
		   head= newnode;
		   head.next= temp;
	   }
   }
   public int pop() {
	   int Popped= Integer.MIN_VALUE;
	   if(head== null) {
		   System.out.println("underflow");
		   return Integer.MIN_VALUE;
	   }
	   else {
		   Popped= head.data;
		   head=head.next;
		   return Popped;
	   }
   }
   public int peek() {
	   if(head== null) {
		   System.out.println("underflow");
		   return 0;
	   }
	   else {
		   return head.data;
	   }
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackLL sll=new StackLL();

        sll.push(10);
        sll.push(20);
        sll.push(30);
 
        System.out.println(sll.pop()
                           + " popped from stack");
 
        System.out.println("Top element is " + sll.peek());

	}

}
