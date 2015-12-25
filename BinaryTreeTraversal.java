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

public class BinaryTreeTraversal {
    Node root;

    public BinaryTreeTraversal(){
        root = null;
    }

    public BinaryTreeTraversal(int item){
       root = new Node(item);
    }

    public static void main(String[] args) {
        BinaryTreeTraversal tree = new BinaryTreeTraversal(50);
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



      


        System.out.print("Preorder:\t");        
        preorder(tree.root);

        System.out.print("\n");

        System.out.print("Inorder:\t");
        inorder(tree.root);
        
        System.out.print("\n");
        
        System.out.print("Postorder:\t");
        postorder(tree.root);

    }

    public static void preorder(Node root){
        //root -> left -> right
        if(root == null){
            return;
        }
        System.out.print(root.data + "  ");
        preorder(root.left);
        preorder(root.right);

    }
    public static void postorder(Node root){
        //left -> right --> root
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + "  ");

    }

    public static void inorder(Node root){
        // left -> root -> right
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + "  ");
        inorder(root.right);

    }


}
