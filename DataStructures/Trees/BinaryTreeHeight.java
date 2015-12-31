/**
 * Created by Adarsh on 12/24/2015.
 */

class Node{
    int data;
    Node left;
    Node right;

    public Node(int item){
        data = item;
        left = null;
        right = null;
    }

}

public class BinaryTreeHeight{
    Node root;

    public BinaryTreeHeight(){
        root = null;
    }

    public BinaryTreeHeight(int item){
        root = new Node(item);
    }

    public static void main(String[] args) {
        BinaryTreeHeight tree = new BinaryTreeHeight(50);
        //tree.root.data = 50;
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(10);
        tree.root.left.right = new Node(25);
        tree.root.right.left = new Node(28);
        tree.root.right.right = new Node(45);

        System.out.println("Tree:\n");
        System.out.println("      " + tree.root.data);
        System.out.print("  " + tree.root.left.data);
        System.out.print("         " + tree.root.right.data);
        System.out.print("\n" + tree.root.left.left.data);
        System.out.print("  " + tree.root.left.right.data);
        System.out.print("   " + tree.root.right.left.data);
        System.out.print("     " + tree.root.right.right.data);
        System.out.println("\n");

        int treeHeight = getHeight(tree.root);
        System.out.println("\n\n\n Height of the tree is : " + treeHeight);


    }

    public static int getHeight(Node root){

        if(root == null)
            return 0;

        else {
            int leftHeight = getHeight(root.left);
            int rightHeight = getHeight(root.right);

            if (leftHeight > rightHeight)
                return leftHeight + 1;
            else
                return rightHeight + 1;
        }

    }



}
