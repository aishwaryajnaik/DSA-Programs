//This program has to be Debugged in function : DeleteAtEnd() and Sort()

import java.util.Scanner;


public class CircularLinkedList {
    Scanner in = new Scanner(System.in);
    node head,last;


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
            last=head=new_node;
            return;
        }
        new_node.next = head;
        head.prev=new_node;
        head=new_node;
        head.prev=last;
    }

    public void insertAtEnd(){
        System.out.printf("Enter data : ");
        int new_data = in.nextInt();
        node new_node = new node(new_data);
        if (head==null) {
            last=head=new_node;
            return;
        }
        if (head.next==null) {
            head.next=new_node;
            new_node.prev=head;
            last=new_node;
            return;
        }
        
        last.next=new_node;
        new_node.prev=last;
        last=new_node;
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
        //ptr1.prev=new_node;
    }


    public void deleteAtBegining(){
        if (head==null) {
            System.out.println("No data in list to delete");
            return;
        }
        if (head.next==null) {
            last=head=null;
            return;
        }
        node del_node=head;
        head=head.next;
        del_node.next=null;
        head.prev=last;
        return;
    }


    public void deleteAtEnd(){
        if (head==null) {
            System.out.println("No data in list to delete");
            return;
        }
        if (head.next==null) {
            last=head=null;
            return;
        }
        node ptr=last.prev;
        
        head.prev=ptr;
        ptr.next=head;
        last=ptr;
        return;

    }

    public void display(){
        node ptr=head;
        while (ptr!=last) {
            System.out.printf("%d <--> ",ptr.data);
            ptr=ptr.next;
        }
        System.out.printf("%d <--> ",ptr.data);

    }

    public void sort(){
        node ptr=head;
        while (ptr!=last.next) {
            node ptr1=ptr.next;
            while (ptr1!=last.next) {
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
        CircularLinkedList LL = new CircularLinkedList();

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
