//SIMPLE QUEUE

public class Queue {
    private int q[];
    private int r,f;
    private int capacity;

    Queue(int size){
        q=new int[size];
        r=f=-1;
        capacity=size;
    }

    public boolean isFull(){
        return r==capacity-1;
    }

    public boolean isEmpty(){
        return f>r||r==-1;
    }

    public void enqueue(int x){
        if(isFull()){
            System.out.println("Queue Overflow\nSystem terminated");
            System.exit(1);
        }
        if(r==-1){
            f=0;
            q[++r]=x;
            return;
        }
        else{
            q[++r]=x;
            return;
        }
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Stack Underflow\nSystem terminated");
            System.exit(1);
        }
        if(r==f){
            int s=q[++f];
            r=f=-1;
            return s;
        }
        else{
            return q[++f];
        }
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Stack Underflow\nSystem terminated");
            System.exit(1);
        }
        System.out.println("Queue ITEMS are: ");
        for(int i=f;i<=r;i++){
            System.out.println(q[i]);
        }
    }

    public void peek(){
        System.out.println("Items at the peek is "+q[r]);
    }

    public static void main(String[] args) {
        Queue simplQueue = new Queue(3);
        simplQueue.enqueue(20);
        simplQueue.enqueue(40);
        simplQueue.enqueue(60);
        simplQueue.display();
        simplQueue.dequeue();
        simplQueue.peek();
    }

}
