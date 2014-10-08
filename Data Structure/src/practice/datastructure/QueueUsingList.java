package practice.datastructure;

import java.util.LinkedList;
import java.util.Scanner;

class QueueNode{
	private int data;
	private QueueNode next;
	
	public QueueNode(int data,QueueNode node) {
		// TODO Auto-generated constructor stub
		this.data = data;
		this.next = node;
	}
	
	public QueueNode getNode() {
		return next;
	}

	public void setNode(QueueNode node) {
		this.next = node;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	public int getData(){
		return this.data;
	}
}

public class QueueUsingList {
	//Initialize queue pointers
	public QueueNode head = null;
	public QueueNode tail = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingList q = new QueueUsingList();
		int ch;
		while(true){
			q.displayMenu();
			Scanner sc = new Scanner(System.in);
			ch = sc.nextInt();
			int ele;
			
			switch(ch){
			case 1:
				System.out.println("Enter element to enque into queue :");
				ele = sc.nextInt();
				q.enque(ele);
			break;
			
			case 2:
				ele = q.deque();
				if(ele == -1)
					System.out.println("Queue is empty!");
				else
					System.out.println("Dequed element is :"+ele);
			break;
			
			case 3:
				q.display();
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
		System.out.println("****** Queue Operations ******");
		System.out.println("1.Enque\n2.Deque\n3.Display\n4.Exit");
		System.out.println("Enter your choice : ");
	}
	
	private void enque(int ele){
		QueueNode n = new QueueNode(ele, null);
		if(head == null){
			head = tail = n;
		}
		else{
			tail.setNode(n);
			tail = n;
		}
	}
	
	private int deque(){
		if(head == null)
			return -1;
		else{
			int data = head.getData();
			head = head.getNode();
			//If dequed node was the only node then make tail point to null
			if(head == null)
				tail = null;
			
			return data;
		}
	}

	
	private void display(){
		QueueNode n = head;
		System.out.println("Elements in queue are :");
		while(n != null){
			System.out.print(" "+n.getData());
			n = n.getNode();
		}
		System.out.println();
	}
}
