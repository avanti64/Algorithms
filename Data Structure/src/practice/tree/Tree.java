package practice.tree;

import java.util.Scanner;
import practice.datastructure.StackUsingList;

class TreeNode{
	int data;
	TreeNode lchild,rchild;
	
	TreeNode(int data){
		this.data = data;
		this.lchild = null;
		this.rchild = null;
	}
}


public class Tree {
	static TreeNode root = null;
	
	public static void main(String[] args) {
		Tree t = new Tree();
		int ch,ele;
		Scanner sc = new Scanner(System.in);
		
		while(true){
			t.displayMenu();
			ch = sc.nextInt();
			switch(ch){
			case 1: 
				System.out.println("Enter element to insert in tree :");
				ele = sc.nextInt();
				t.insert(ele);
			break;
			
			case 2:
			break;
			
			case 3:
				System.out.println("Inorder tree traversal :");
				t.inOrder(root);
			break;
			
			case 4:
				System.out.println("Preorder tree traversal :");
				t.preOrder(root);
			break;
			
			case 5:
				System.out.println("Inorder tree traversal :");
				t.postOrder(root);
			break;
			
			case 6:
				int min = t.findMin(root);
				System.out.println("Minimum element in tree is :"+min);
			break;
			
			case 7:
				int max = t.findMax(root);
				System.out.println("Maximum element in tree is :"+max);
			break;
			
			case 8:
				System.out.println("Enter node data whose successor need to find :");
				int data = sc.nextInt();
				t.findSucc(data);
			break;
			
			case 9:
				System.out.println("Enter data to be find in the tree :");
				ele = sc.nextInt();
				t.findData(ele);
			break;
				
			case 10: 
				sc.close();
				System.exit(0);
			break;
			
			default:
				System.out.println("Enter choice between 1-10");
			}
		}
		
	}
	
	private void displayMenu(){
		System.out.println("\n**********************   Tree Operations *********************");
		System.out.println("1.Insert\n2.Delete\n3.Inorder\n4.Preorder\n5.Postorder");
		System.out.println("6.Find Minimum\n7.Find Maximum\n8.Find Successor\n9.Find element\n10.Exit");
		System.out.println("Enter your choie :");
	}
	
	private void insert(int ele){
		if(root == null){
			TreeNode t = new TreeNode(ele);
			root = t;
		}
		else{
			TreeNode t = root;
			TreeNode child = new TreeNode(ele);
			TreeNode p = null;
			//While right position to insert key not found
			while(t != null){
				//Store parent as after existing this loop, t will be null
				p = t;
				if(ele < t.data)
					t = t.lchild;
				else
					t = t.rchild;
			}
			//Check duplicate
			if(ele == p.data)
				System.out.println("Duplicate data");
			//Place child at right position
			else if(ele < p.data)
				p.lchild = child;
			else
				p.rchild = child;
		}
	}
	
	private void inOrder(TreeNode t){
		if(t != null){
			inOrder(t.lchild);
			System.out.print(" "+t.data);
			inOrder(t.rchild);
		}
	}
	
	private void preOrder(TreeNode t){
		if(t != null){
			System.out.print(" "+t.data);
			preOrder(t.lchild);
			preOrder(t.rchild);
		}
	}
	
	private void postOrder(TreeNode t){
		if(t != null){
			postOrder(t.lchild);
			postOrder(t.rchild);
			System.out.print(" "+t.data);
		}
	}
	
	private int findMin(TreeNode t){
		while(t.lchild != null)
			t = t.lchild;
		return t.data;
	}
	
	private int findMax(TreeNode t){
		while(t.rchild != null)
			t = t.rchild;
		return t.data;
	}
	
	private void findData(int data){
		TreeNode p = root;
		while(p.data != data && p != null){
			if(data < p.data)
				p = p.lchild;
			else
				p = p.rchild;
		}
		if(p == null)
			System.out.println("Data not found in given tree");
		else
			System.out.println("Element "+data+" found in the tree");
			
	}
	
	/**
	 * Finds inorder successor of a given node
	 * @param data :: node of which successor will be printed
	 */
	private void findSucc(int data){
		TreeNode p = root;
		StackUsingList s = new StackUsingList();
		
		while(p.data != data && p != null){
			s.push(p.data);
			if(data < p.data)
				p = p.lchild;
			else{
				p = p.rchild;
				int e = s.pop();
			}
		}
		if(p == null){
			System.out.println("Given data not found in the tree ");
		}
		else{
			//if right child not null then minimum element in right subtree is inorder successor
			int succ;
			if(p.rchild != null)
				succ = findMin(p.rchild);
			else
				succ = s.pop();

			System.out.println("Inorder successor for "+data+" is "+succ);
		}
			
	}

}
