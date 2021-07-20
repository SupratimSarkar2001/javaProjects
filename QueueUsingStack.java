import java.util.Stack;

public class QueueUsingStack {
    static class Queue{
        
        Stack<Integer> stack1= new Stack<>();
        Stack<Integer> stack2= new Stack<>();

        public void Enqueue(int k){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            stack1.push(k);
            while(!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
        }

        public int Dequeue(){
            if(stack1.isEmpty()){
                System.out.println("queue is Empty");
                return Integer.MIN_VALUE;

            }
            else{
                return stack1.pop();
            }
        }


    }
    public static void main(String[] args) {
        Queue q= new Queue();
        System.out.println(q.Dequeue());
        q.Enqueue(1);
        q.Enqueue(2);
        q.Enqueue(3);
        
        System.out.println(q.Dequeue());
        System.out.println(q.Dequeue());
     
        
    }
    
}
