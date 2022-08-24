//CIRCULAR QUEUE

public class CircularQueue {
    private int q[];
    private int r,f;
    private int capacity;

    CircularQueue(int size){
        q=new int[size];
        r=f=-1;
        capacity=size;
    }

    public boolean isFull(){
        return f==r+1;
    }

    public boolean isEmpty(){
        return r==-1;
    }

    public void enqueue(int x){
        if(isFull()){
            System.out.println("Queue Overflow\nSystem terminated");
            System.exit(1);
        }
        if(r==-1){
            f=r=0;

            q[r]=x;
            return;
        }
        else{
            r=(r+1)%capacity;
            q[r]=x;
            return;
        }
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue Underflow\nSystem terminated");
            System.exit(1);
        }
        if(r==f){
            int s=q[f];
            f=r=-1;
            return s;
        }
        else{
            int s=q[f];
            f=(f+1)%capacity;
            return s;
        }
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue Underflow\nSystem terminated");
            System.exit(1);
        }
        System.out.println("Queue ITEMS are: ");
        int i;
        for(i=f;i!=r;i=(i+1)%capacity){
            System.out.println(q[i]);
        }
        System.out.println(q[i]);
    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(3);
        
        cq.enqueue(10);
        System.out.println("REAR = "+cq.r+" FRONT = "+cq.f);
        
        cq.enqueue(20);
        System.out.println("REAR = "+cq.r+" FRONT = "+cq.f);

        cq.enqueue(30);
        System.out.println("REAR = "+cq.r+" FRONT = "+cq.f);


        cq.display();

        cq.dequeue();
        System.out.println("REAR = "+cq.r+" FRONT = "+cq.f);

        cq.dequeue();
        System.out.println("REAR = "+cq.r+" FRONT = "+cq.f);


        cq.display();

        cq.enqueue(40);
        System.out.println("REAR = "+cq.r+" FRONT = "+cq.f);

        cq.enqueue(50);
        System.out.println("REAR = "+cq.r+" FRONT = "+cq.f);

        
        cq.display();

    }
}
