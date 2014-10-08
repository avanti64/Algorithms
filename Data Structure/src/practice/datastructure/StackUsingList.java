package practice.datastructure;

import java.util.Scanner;

class StackNode{
	private int data;
	private StackNode next;
	
	public StackNode(int data,StackNode node) {
		// TODO Auto-generated constructor stub
		this.data = data;
		this.next = node;
	}
	
	public StackNode getNode() {
		return next;
	}

	public void setNode(StackNode node) {
		this.next = node;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	public int getData(){
		return this.data;
	}
}

public class StackUsingList {
	public StackNode top = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUsingList s =new StackUsingList();
		int ch;
		while(true){
			s.displayMenu();
			Scanner sc = new Scanner(System.in);
			ch = sc.nextInt();
			int ele;
			
			switch(ch){
			case 1:
				System.out.println("Enter element to push onto stack :");
				ele = sc.nextInt();
				s.push(ele);
			break;
			
			case 2:
				ele = s.pop();
				if(ele == -1)
					System.out.println("Stack is empty!");
				else
					System.out.println("Popped element is :"+ele);
			break;
			
			case 3:
				s.display();
			break;
			
			case 4:
				System.exit(0);
			break;
			
			default:
				System.out.println("Wrong choice!, Enter choices between 1-4");
			}
		}

	}
	
	private void displayMenu(){
		System.out.println("****** Stack Operations ******");
		System.out.println("1.Push\n2.Pop\n3.Display\n4.Exit");
		System.out.println("Enter your choice : ");
	}
	
	public void push(int ele){
		StackNode n = new StackNode(ele,null);
		if(top == null)
			top = n;
		else{
			n.setNode(top);
			top = n;
		}
	}
	
	public int pop(){
		if(top == null)
			return -1;
		else{
			int data = top.getData();
			top = top.getNode();
			return data;
		}
			
	}
	
	private void display(){
		StackNode n = top;
		System.out.println("Stack elements are :");
		while(n != null){
			System.out.print(" "+n.getData());
			n = n.getNode();
		}
		System.out.println();
	}

}
