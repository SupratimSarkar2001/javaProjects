class queue{
    static final int N=100;
    int front;
    int rear;
    int arr[];
    public queue(){
        front=-1;
        rear=-1;
        arr= new int[N];

    }

    public void enqueue(int data){
        if(this.rear== N-1){
            System.out.println("the queue is in overflow condition");
            return;
        }
        else if(front==-1){
            rear++;
            arr[rear]=data;
            front++;

        }
        else{
            rear++;
            arr[rear]=data;
        }
    }
    public void dequeue(){
        if(this.front==-1 || front>rear){
            System.out.println("the dequeue is in underflow condition");
            return;
        }
        else{
            front++;
        }
    }

    public int peek(){
        if(this.front==-1 || front>rear){
            System.out.println("the dequeue is in underflow condition");
            return -1; 
        }
        else{
            return arr[front];
        }

    }
    public boolean isEmpty(){
        if(this.front==-1 || front>rear){
            return true;
        }
        return false;

    }
}

public class queue1{
    public static void main(String[] args){
        queue q= new queue();
        q.enqueue(10);
        q.enqueue(23);
        q.enqueue(33);
        q.enqueue(43);
        q.enqueue(83);
        q.dequeue();
        q.dequeue();

        q.dequeue();
       System.out.println(q.peek());
        q.isEmpty();

        
    }

}