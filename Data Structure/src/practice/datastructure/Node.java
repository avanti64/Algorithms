package practice.datastructure;

//Single node for singly link list
class Node{
	private int data;
	private Node node;
	
	public Node(int data,Node node) {
		// TODO Auto-generated constructor stub
		this.data = data;
		this.node = node;
	}
	
	public Node getNode() {
		return node;
	}

	public void setNode(Node node) {
		this.node = node;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	public int getData(){
		return this.data;
	}

	public Node() {
		// TODO Auto-generated constructor stub
	}
}