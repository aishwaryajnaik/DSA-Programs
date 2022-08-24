class Node{
    int data;
    Node left,right;
    public Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class BinaryTree {
    Node root;
    BinaryTree(){
        root=null;
    }
    void infix(Node node){
        if(node==null)  return;

        infix(node.left);
        System.out.print(node.data+"-->");
        infix(node.right);
    }
    void prefix(Node node){
        if(node==null)  return;

        System.out.print(node.data+"-->");
        prefix(node.left);
        prefix(node.right);
    }
    void postfix(Node node){
        if(node==null)  return;

        postfix(node.left);
        postfix(node.right);
        System.out.print(node.data+"-->");
    }


    
   
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root=new Node(1);
        tree.root.left=new Node(12);
        tree.root.right=new Node(9);
        tree.root.left.left=new Node(8);
        tree.root.left.right=new Node(6);

        System.out.println("INFIX order------------");
        tree.infix(tree.root);
        System.out.println("\nPREFIX order-------------");
        tree.prefix(tree.root);
        System.out.println("\nPOSTFIX order--------------");
        tree.postfix(tree.root);

        
   }
    
}
 