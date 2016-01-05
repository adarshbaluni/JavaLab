class Node{
	
	int data;
	Node left,right;
	
	Node(int data){
		this.data = data;
		left = right =null;
	}
}

class BST{
	
	Node root;
	
	BST(){
		root = null;
	}
	
	BST(int value){
		
		root = new Node(value);		
	}
	
	
	public void insertInBST(int key){
		
		root = insert(root, key);
	}
	public Node insert(Node root, int key){
		if(root == null){
			root = new Node(key);
		}
		
		else{
			if(key < root.data){
				root.left = insert(root.left , key);
				
			}
			
			else{
				root.right = insert(root.right,key);
			}
			
		}

		return root;

	}

	public void printTree(){
		inorder(root);
	}	
	
	public void inorder(Node root){
		if(root != null){
			inorder(root.left);
			System.out.print(root.data+"  ");
			inorder(root.right);			
		}
			
		else
			return;
	}
	
}

public class InsertionBST{
	
	public static void main(String[] args){
		
		BST bst = new BST(50);
		//bst.insertInBST(10);
		bst.insertInBST(60);
		bst.insertInBST(80);
		bst.insertInBST(70);
		bst.insertInBST(30);
		bst.insertInBST(40);
		bst.insertInBST(20);
		bst.insertInBST(10);
			
		bst.printTree();
	}
	
}