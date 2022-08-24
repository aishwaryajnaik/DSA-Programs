import java.util.Scanner;

public class DoublyLinkedList {


    Scanner in = new Scanner(System.in);
    node head;


    public class node{
        int data;
        node next;
        node prev;
        node(int d){
            data=d;
            next=null;
            prev=null;
        }
    }


    public void insertAtBeginning(){
        System.out.printf("Enter data : ");
        int new_data = in.nextInt();
        node new_node = new node(new_data);
        if (head==null) {
            head=new_node;
            return;
        }
        new_node.next = head;
        head.prev=new_node;
        head=new_node;
    }

    public void insertAtEnd(){
        System.out.printf("Enter data : ");
        int new_data = in.nextInt();
        node new_node = new node(new_data);
        if (head==null) {
            head=new_node;
            return;
        }
        node last=head;
        while (last.next!=null) {
            last=last.next;
        }
        last.next=new_node;
        new_node.prev=last;
    }

    public void insertAtPos(){
        System.out.println("\nEnter after which node ? = ");
        int pos_data=in.nextInt();
        System.out.printf("\n Enter data : ");
        int new_data = in.nextInt();
        node new_node = new node(new_data);
        node ptr=head;
        while (ptr.data!=pos_data) {
            ptr=ptr.next;
        }
        node ptr1=ptr.next;
        ptr.next=new_node;
        new_node.prev=ptr;
        new_node.next=ptr1;
        ptr1.prev=new_node;
    }

    public void deleteAtBegining(){
        if (head==null) {
            System.out.println("No data in list to delete");
            return;
        }
        node del_node=head;
        head=head.next;
        del_node.next=null;
        head.prev=null;
        return;
    }

    public void deleteAtEnd(){
        if (head==null) {
            System.out.println("No data in list to delete");
            return;
        }
        node ptr=head;
        node ptr1=head;
        while(ptr.next!=null){
            ptr1=ptr;
            ptr=ptr.next;
        }
        ptr1.next=null;
        ptr.prev=null;
        return;

    }

    public void display(){
        node ptr=head;
        while (ptr!=null) {
            System.out.printf("%d <--> ",ptr.data);
            ptr=ptr.next;
        }
    }

    public void sort(){
        node ptr=head;
        while (ptr!=null) {
            node ptr1=ptr.next;
            while (ptr1!=null) {
                if (ptr.data>ptr1.data) {
                    int temp = ptr.data;
                    ptr.data = ptr1.data;
                    ptr1.data = temp;
                }
                ptr1=ptr1.next;
            }
            ptr=ptr.next;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList LL = new DoublyLinkedList();

        System.out.println("\n-----------------------------\nINSERT AT THE BEGINNING\n-----------------------------\n");
        LL.insertAtBeginning();
        LL.insertAtBeginning();

         System.out.println("\n-----------------------------\nINSERT AT THE END\n-----------------------------\n");
        LL.insertAtEnd();
        LL.insertAtEnd();

        LL.display();

        System.out.println("\n-----------------------------\nINSERT AT THE POSITION\n-----------------------------\n");
        LL.insertAtPos();
        LL.insertAtPos();

        LL.display();

        System.out.println("\n-----------------------------\nDELETE AT THE BEGINING\n-----------------------------\n");
        LL.deleteAtBegining();
        
        LL.display();

        System.out.println("\n-----------------------------\nDELETE AT THE END\n-----------------------------\n");
        LL.deleteAtEnd();

        LL.display();

        System.out.println("\n-----------------------------\nAFTER SORTING\n-----------------------------\n");
        LL.sort();

        LL.display();
    }

}