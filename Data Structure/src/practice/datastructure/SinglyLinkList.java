package practice.datastructure;

import java.util.Scanner;

public class SinglyLinkList {
	public Node head = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkList sl = new SinglyLinkList();
		
		int ch;
		do{
			sl.displayMenu();
			Scanner sc = new Scanner(System.in);
			ch = sc.nextInt();
			int ele;
			
			switch(ch){
			case 1:
				System.out.println("Enter element to add : ");
				ele = sc.nextInt();
				sl.createList(ele);
			break;
			
			case 2:
				System.out.println("Enter element to add : ");
				ele = sc.nextInt();
				sl.addEnd(ele);
			break;
			
			case 3: 
				System.out.println("Enter element after which next element to be added : ");
				int given = sc.nextInt();
				System.out.println("Enter element to be added :");
				ele = sc.nextInt();
				sl.addAfter(given,ele);
			break;
			
			case 4:
				System.out.println("Enter element to add : ");
				ele = sc.nextInt();
				sl.addStart(ele);
			break;
			
			case 5: 
				sl.delHead();
			break;
			
			case 6:
				sl.delEnd();
			break;
			
			case 7:
				System.out.println("Enter element to delete : ");
				ele = sc.nextInt();
				sl.delGiven(ele);
			break;
			
			case 8:
				sl.displayList();
			break;
			
			case 9:
				sl.reverse();
			break;
			
			default:
				System.out.println("Enter choices from 1-9");
			}
		}while(ch != 10);

	}
	
	private void displayMenu(){
		System.out.println("****** Singly Link List Operations ******");
		System.out.println("1. Create New List\n2. Add element at the end of list");
		System.out.println("3. Add after given element\n4. Add at the start of the list");
		System.out.println("5. Delete head\n6. Delete Last element\n7. Delete given element\n8. Display List\n9. Reverse List\n10. Exit");
		System.out.println(" *************** END *******************");
		System.out.println("Enter your choice : ");
	}
	
	private void createList(int ele){
		Node n = new Node(ele,null);
		head = n;
	}
	
	
	private void addEnd(int ele){
		Node n = head;
		
		if(head == null)
			head = new Node(ele,null);
		else{
			//n = new Node(ele,null);
		
			while(n.getNode() != null)
				n = n.getNode();
			
			Node n1 = new Node(ele,null);
			n.setNode(n1);
		}
	}
	
	private void addAfter(int given,int ele){
		Node n = head;
		boolean eleFnd = false;
		if(head == null)
			head = new Node(ele,null);
		else{
			//Iterate till element found or link list ends
			while(n != null){
				if(n.getData() == given){
					eleFnd = true;
					break;
				}
				n = n.getNode();
			}
			if(eleFnd ){
				Node n1 = new Node(ele,null);
				//Element found at last node
				if(n.getNode() == null)
					n.setNode(n1);
				else{
					//Store link of next node before adding new node
					Node temp = n.getNode();
					n.setNode(n1);
					n1.setNode(temp);
				}
					
			}
			else{
				System.out.println("Did not find elment "+ele+" in list");
			}
			
		}
	}
	
	private void addStart(int ele){
		Node n = head;
		if(head == null)
			head = new Node(ele,null);
		else{
			//Copy head link ref into newly created node
			Node n1 = new Node(ele,head);
			head = n1;
		}
	}
	
	private void delHead(){
		if(head != null){
			Node n = head.getNode();
			//Create new head
			head = n;
		}
	}
	
	private void delEnd(){
		if(head == null)
			head = null;
		else if(head.getNode() == null)
			head = null;
		else{
			Node n = head;
			// Travelled till second last element
			while(n.getNode().getNode() != null)
				n = n.getNode();
			
			//Set second last node link to null so that last node will be deleted
			n.setNode(null);
		}
	}
	
	private void delGiven(int ele){
		boolean eleFnd = false;
		if(head == null)
			System.out.println("Does not found given element");
		else if(head.getData() == ele){
			Node temp = head.getNode();
			head = temp;
		}
		else{
			Node n = head;
			while(n != null){
				if(n.getData() == ele){
					eleFnd = true;
					break;
				}
				n = n.getNode();
			}
			
			if(eleFnd){
				// Travel till node before node to be deleted
				Node n1 = head;
				while (n1.getNode() != n)
					n1 = n1.getNode();
				
				//set link of previous node to next node of the node to be deleted
				n1.setNode(n.getNode());
			}				
		}
	}
	
	private void displayList(){
		Node n = head;
		System.out.println("List is :");
		while(n != null){
			System.out.print(" "+n.getData());
			n = n.getNode();
		}
		System.out.println();
	}
	
	private void reverse(){
		Node p,q,r;
		
		p = head;
		q = r = null;
		while(p != null){
			r = q;
			q = p;
			p = p.getNode();
			q.setNode(r);
		}
		head = q;
	}
}
