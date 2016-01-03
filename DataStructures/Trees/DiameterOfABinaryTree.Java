/*
Diameter of a Binary Tree
The diameter of a tree (sometimes called the width) is the number of nodes on the longest path between two leaves in the tree. The diagram below shows two trees each with diameter nine, the leaves that form the ends of a longest path are shaded (note that there is more than one path in each tree of length nine, but no path longer than nine nodes).

Source : http://www.geeksforgeeks.org/diameter-of-a-binary-tree/

*/



class Node{

	int data;
	Node left, right;

	public Node(int d){
		data =d;
		left=right=null;

	}
}

class BinaryTreeLevelTraversal{
	Node root;

	public BinaryTreeLevelTraversal(){
		root = null;
	}

	public BinaryTreeLevelTraversal(int value){
		root = new Node(value);
	}

	 public static Node createTree(){
		BinaryTreeLevelTraversal tree = new BinaryTreeLevelTraversal(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		//tree.root.right.left = new Node(60);
		tree.root.right.right = new Node(15);
		tree.root.left.left.left = new Node(6);
		tree.root.left.left.right = new Node(7);
		//tree.root.right.left.right = new Node(100);
		tree.root.left.right.right = new Node(11);
		tree.root.left.right.right.left = new Node(12);
		tree.root.left.right.right.right = new Node(13);
		tree.root.left.right.right.right.right = new Node(14);
		tree.root.left.left.right.left = new Node(8);
		tree.root.left.left.right.left.left = new Node(9);
		tree.root.left.left.right.left.right = new Node(10);
		
		return tree.root;
		
		
	
	}

	
	
}


public class DiameterOfABinaryTree{
	
	public static void main(String[] args){
		
		Node root = new BinaryTreeLevelTraversal().createTree();
		DiameterOfABinaryTree d = new DiameterOfABinaryTree();
		int diameter = d.diameterofTree(root);
		
		System.out.println("\nThe diameter of the binary tree is:  "+ diameter);
		
		
	}
	
	
	int diameterofTree(Node root){
		
		if(root == null)
			return 0;
		
		int lheight = height(root.left);
		int rheight = height(root.right);
		
		int ldiameter = diameterofTree(root.left);
		int rdiameter = diameterofTree(root.right);
		
		
		
		return Math.max(lheight+rheight+1, Math.max(ldiameter,rdiameter));
		
		
	}
	
	
	public static int height(Node root){

		if(root == null){
			return 0;
		}

		int lheight = height(root.left);
		int rheight = height(root.right);

		if(lheight > rheight){
			return lheight + 1;
		}
		else
			return rheight + 1;

	}
	
}