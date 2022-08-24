//DOUBLE ENDED CIRCULAR QUEUE

public class DoubleEndedQueue {
    private int q[];
    private int r,f;
    private int capacity;

    DoubleEndedQueue(int size){
        q=  new int[size];
        capacity=size;
        r=f=-1;
    }

    public boolean isFull(){
        return f==r+1;
    }

    public boolean isEmpty(){
        return r==-1;
    }

    public void insertRear(int x){
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

    public int deleteRear(){
        if(isEmpty()){
            System.out.println("Queue Underflow\nSystem terminated");
            System.exit(1);
        }
        if(f==r){
            int s=q[r];
            r=f=-1;
            return s;
        }
        else{
            int s=q[r];
            r=(r-1)%capacity;
            return s;
        }
    }

    public void insertFront(int x){
        if(isFull()){
            System.out.println("Queue Overflow\nSystem terminated");
            System.exit(1);
        }
        if(r==-1){
            f=r=0;
            q[f]=x;
            return;
        }
        else{
            f=(f-1)%capacity;
            q[f]=x;
            return;
        }
    }

    public int deleteFront(){
        if(isEmpty()){
            System.out.println("Queue Underflow\nSystem terminated");
            System.exit(1);
        }
        if(f==r){
            int s=q[f];
            r=f=-1;
            return s;
        }
        else{
            f=(f+1)%capacity;
            return q[f];
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
        DoubleEndedQueue cq = new DoubleEndedQueue(3);
        
        cq.insertRear(10);
        System.out.println("REAR = "+cq.r+" FRONT = "+cq.f);
        
        cq.insertRear(20);
        System.out.println("REAR = "+cq.r+" FRONT = "+cq.f);

        cq.insertRear(30);
        System.out.println("REAR = "+cq.r+" FRONT = "+cq.f);


        cq.display();

        cq.deleteFront();
        System.out.println("REAR = "+cq.r+" FRONT = "+cq.f);

        cq.deleteFront();
        System.out.println("REAR = "+cq.r+" FRONT = "+cq.f);


        cq.display();

        cq.deleteRear();
        System.out.println("REAR = "+cq.r+" FRONT = "+cq.f);

        cq.insertFront(50);
        System.out.println("REAR = "+cq.r+" FRONT = "+cq.f);

        
        cq.display();

    }
}
