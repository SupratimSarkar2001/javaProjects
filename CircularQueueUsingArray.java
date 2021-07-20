public class CircularQueueUsingArray {
    final int MAX=10;
    int front;
    int rear;
    int a[];
    public CircularQueueUsingArray(){
        front=-1;
        rear=-1;
        a= new int[MAX];
    }

    public void push(int k){
        if((front==0 && rear==MAX-1)|| front==(rear+1)%MAX){
            System.out.println("the Queue is full");
            return ;
        }
        else if(front == -1){
            front=0;
            rear=0;
        }
        else{
            rear=(rear+1)%MAX;
        }
        a[rear]=k;
    }
    public int pop(){
        if(front==-1){
            System.out.println("the queue is empty");
            return Integer.MIN_VALUE;
        }
        int data=a[front];
        if(front == rear){
            front=-1;
            rear=-1;
        }
        else{
            front=(front+1)%MAX;
        }
        return data;
    }


    public static void main(String[] args){
        CircularQueueUsingArray cq= new  CircularQueueUsingArray();
        cq.push(22);
        cq.push(33);
        cq.push(78);
        System.out.println(cq.pop());

    }
    
}
