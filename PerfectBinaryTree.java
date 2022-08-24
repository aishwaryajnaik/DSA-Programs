class Node{
    int data;
    Node left,right;
    public Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class PerfectBinaryTree {
    Node root;
    PerfectBinaryTree(){
        root=null;
    }
    int depth(Node node){
        int d=0;
        while(node!=null){
            d++;
            node=node.left;
        }
        return d;
    }
    boolean isPerfectBinaryTree(Node node,int d,int level){
        if(node==null)      return true;
        if(node.left == null && node.right == null)     return (d==level+1);
        if(node.left == null || node.right == null)     return false;
        return isPerfectBinaryTree(node.left,d,level+1)&&isPerfectBinaryTree(node.right,d,level+1);
    }
    boolean isPerfectBinaryTree(Node node){
        int d = depth(node);
        return isPerfectBinaryTree(node,d,0);
    }

    public static void main(String[] args) {
        PerfectBinaryTree tree = new PerfectBinaryTree();
        tree.root=new Node(1);
        tree.root.left=new Node(12);
        tree.root.right=new Node(9);
        tree.root.left.left=new Node(8);
        tree.root.left.right=new Node(6);
        tree.root.right.left=new Node(18);
        tree.root.right.right=new Node(2);
        System.out.println("Is given tree is a \"PERFECT BINARYTREE\" : "+tree.isPerfectBinaryTree(tree.root));
    }
}
