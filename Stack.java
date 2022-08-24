//STACK

class Stack{
    private int s[];
    private int top;
    private int capacity;

    Stack(int size){
        s=new int[size];
        top=-1;
        capacity=size;
    }

    public boolean isFull(){
        return top==capacity-1;
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public void push(int x){
        if(isFull()){
            System.out.println("Stack Overflow\nSystem terminated");
            System.exit(1);
        }
        System.out.println("Inserting "+x+" in Stack");
        s[++top]=x;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow\nSystem terminated");
            System.exit(1);
        }
        return s[top--];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Stack Underflow\nSystem terminated");
            System.exit(1);
        }
        System.out.println("Stack ITEMS are: ");
        for(int i=0;i<=top;i++){
            System.out.println(s[i]);
        }
    }

    public void peek(){
        System.out.println("Item at the TOP is "+s[top]);
    }

    public static void main(String[] args) {
        Stack st = new Stack(3);
        st.push(10);
        st.push(20);
        st.push(30);

        st.pop();

        st.display();

        st.push(40);

        st.display();

        st.peek();
    }
}