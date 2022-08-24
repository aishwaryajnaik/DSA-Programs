class Node{
    int data;
    Node leftNode,rightNode;
    Node(int data){
        this.data=data;
        leftNode=rightNode=null;

    }
}
public class FullbinaryTree {
    Node root;
    FullbinaryTree(){
        root=null;
    }
    boolean isFullBinaryTree(Node node){
        if(node==null)      return true;
        if(node.leftNode==null && node.rightNode==null)     return true;
        if(node.leftNode==null || node.rightNode==null)     return isFullBinaryTree(node.leftNode)&&isFullBinaryTree(node.rightNode);

        return false;
    }
    public static void main(String[] args) {
        FullbinaryTree tree = new FullbinaryTree();
        tree.root=new Node(1);
        tree.root.leftNode=new Node(12);
        tree.root.rightNode=new Node(9);
        tree.root.leftNode.leftNode=new Node(8);
        tree.root.leftNode.rightNode=new Node(6);

        System.out.println("Is the given tree is \"FullBinary Tree\" "+tree.isFullBinaryTree(tree.root));
    }
    
}
