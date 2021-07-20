public class deque{
    static final int Max=100;
    int arr[];
    int front;
    int rear;
    int size;

    public deque(int size){
        front=-1;
        rear=0;
        arr= new int[Max];
        this.size=size;
    }

    public boolean isFull(){
        if((front==0 && rear== size-1)|| front==rear+1){
            return true;
        }
        return false;
    }
    public boolean isEmpty(){
        if(front==-1 && rear==-1){
            return true;
        }
        return false;
    }
    public void insertFront(int x){
        if(isFull()){
            System.out.println("the deque is full.");
            return ;
        }
        else if(front==-1){
            front=0;
            rear=0;
        }
        else if(front==0){
            front=size-1;
        }
        else{
            front=front-1;
        }

        arr[front]=x;

    }
    public void insertRear(int x){
        if(isFull()){
            System.out.println("the deque is full.");
            return ;
        }
        else if(front==-1){
            front=0;
            rear=0;
        }
        else if(rear==size-1){
            rear=0;
        }
        else{
            rear++;
        }
        arr[rear]=x;

    }
    public void deleteFront(){
        if(isEmpty()){
            System.out.println("Empty");
            return;
        }
        else if(front== rear){
            front=-1;
            rear=-1;
        }
        else if(front==size-1){
            front=0;
        }
        else{
            front++;
        }
    }
    public void deleteRear(){
        if(isEmpty()){
            System.out.println("Empty");
            return;
        }
        else if(front== rear){
            front=-1;
            rear=-1;
        }
        else if(rear==0){
            rear=size-1;
        }
        else{
            rear--;
        }

    }
    public int showFront(){
        return arr[front];
    }
    public int showRear(){
        return arr[rear];
    }


    public static void main(String[] args){
        deque d= new  deque(5);
        d.insertFront(25);
        d.insertFront(45);
        d.insertRear(7);
        d.insertRear(9);
        System.out.println(d.showFront());
        System.out.println(d.showRear());
        d.deleteFront();
        d.deleteRear();
        System.out.println(d.showFront());
        System.out.println(d.showRear());


    }
}