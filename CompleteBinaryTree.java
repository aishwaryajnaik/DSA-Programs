

class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        left=null;
        right=null;
    }
}
public class CompleteBinaryTree {
    Node root;
    CompleteBinaryTree(){
        root=null;
    }
    int countNumNode(Node root){
        if(root==null)  return 0;
        return (1+countNumNode(root.left)+countNumNode(root.right));
    }
    boolean isCompleteBinaryTree(Node root,int index,int numberNode){
        if(root==null)  return true;
        if(index>=numberNode)   return false;
        return isCompleteBinaryTree(root.left, 2+index+1, numberNode)&&isCompleteBinaryTree(root.right, 2*index+2, numberNode);
    }
    public static void main(String[] args) {
        CompleteBinaryTree tree = new CompleteBinaryTree();
        int index=0;
        int numberNode=tree.countNumNode(tree.root);
        tree.root=new Node(1);
        tree.root.left=new Node(12);
        tree.root.right=new Node(9);
        tree.root.left.left=new Node(8);
        tree.root.left.right=new Node(6);
        tree.root.right.left=new Node(18);
        //tree.root.right.right=new Node(2);

        System.out.println("Is given tree is a \"COMPLETE BINARY TREE\" : "+ tree.isCompleteBinaryTree(tree.root, index, numberNode));
    }
}
