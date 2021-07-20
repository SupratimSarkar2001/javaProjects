class Qnode{
    int data;
    Qnode next;

    public Qnode(int d){
        data=d;
        next= null;
    }
}


class Queue  {
    Qnode front,rear;
    public void Enqueue(in k){
        Qnode new_node = new Qnode(k);
        if(front== null){
            front=rear=new_node;

        }
        else{
            rear.next=new_node;
            rear=new_node;
            new_node.next=front;
        }
    }
    public int Dequeue(){

        if(front==null){
            System.out.println("queue is empty.");
           return Integer.MIN_VALUE;

        }
        int val;
        val=front.data;
        front= front.next;
        rear.next=front;

        return front;
    }
    
}


public class circularQueue{
    public static void main(String[] args){
        Queue q= new Queue();
        q.Enqueue(5);
        q.Enqueue(6);
        q.Enqueue(7);
        q.Enqueue(8);
        System.out.println(q.Dequeue());

    }
}
