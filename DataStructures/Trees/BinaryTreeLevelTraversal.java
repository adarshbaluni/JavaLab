class Node{

	int data;
	Node left, right;

	public Node(int d){
		data =d;
		left=right=null;

	}
}

public class BinaryTreeLevelTraversal{
	Node root;

	public BinaryTreeLevelTraversal(){
		root = null;
	}

	public BinaryTreeLevelTraversal(int value){
		root = new Node(value);
	}

	public static void main(String[] args){
		BinaryTreeLevelTraversal tree = new BinaryTreeLevelTraversal(10);
		tree.root.left = new Node(20);
		tree.root.right = new Node(30);
		tree.root.left.left = new Node(40);
		tree.root.left.right = new Node(50);
		tree.root.right.left = new Node(60);
		tree.root.right.right = new Node(70);
		tree.root.left.left.left = new Node(80);
		tree.root.left.left.right = new Node(90);
		tree.root.right.left.right = new Node(100);

		//int h = height(tree.root);
		//tree.levelOrder(h);
		levelOrder(tree.root);


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

	public static void levelOrder(Node root){
		int h = height(root);
		for(int i=1; i<=h; i++){
			System.out.println("\n\n");
			levelPrintNodes(root,i);
		}
	}

	public static void levelPrintNodes(Node root, int level){

		if(root == null)
			return;
		if(level == 1){
			System.out.print("  "+root.data);
			
		}

		else{

			levelPrintNodes(root.left,level-1);
			levelPrintNodes(root.right,level-1);

		}

	}


}