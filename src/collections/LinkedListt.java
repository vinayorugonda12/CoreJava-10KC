package collections;



public class LinkedListt {
	
	private Node head;
	private Node tail;
	
	private int size;
	
	//assigning size of LL
	
	public LinkedListt() {
		this.size=size;
	}
	
	
		//insert the first most place in LL
	
	public void insertFirst(int val) {
		Node node=new Node(val);
		node.next=head;
		head=node;
		
		if(tail==null) {
			tail=head;
		}
		size+=1;
		
	}
	
	
	//inserting at last place 
	
	public void insertLast(int val) {
		
		if(tail==null) {
			insertFirst(val);
			return;
		}
		Node  node =new Node(val);
		tail.next=node;
		tail=node;
		size++;
		
	}
	
	//insert at particular index
	
	public void insert(int val,int index) {
		if(index==0) {
			insertFirst(val);
			return;
		}
		
		if(index==size) {
			insertLast(val);
			return;
		}
		
		Node temp=head;
		for (int i = 1; i < index; i++) {
			temp=temp.next;
		}
		Node node=new Node(val,temp.next);
		temp.next=node;
		
		size++;
	}
	
	//delete first
	
	public int deleteFirst() {
		int val=head.value;//not necessary for deleting only
		head=head.next;  //moving head to next node that means skipping first one
		
		if(head==null) {
			tail=null;
		}
		size--;
		
		return val;
		
	}
	
	
	
	//getting a reference by index
	
	public Node get(int index) {
		Node node=head;
		for (int i = 0; i < index; i++) {
			node=node.next;
			
		}
		return node;
	}
	
	//delete last element i.e size-2
	
	public void deleteLast() {
		if(size<=1) {
//			return 
					deleteFirst();
		}
		
		Node secondLast=get(size-2);
//		int val=tail.value;
		tail=secondLast;
		tail.next=null;
		
//		return val; 
		
	}
	
	
	//delete element by index
	
	public void delete(int index) {
		if(index==0) {
			deleteFirst();
		}
		
		if(index==size-1) {
			deleteLast();
		}
		
		Node prev=get(index-1);
		prev.next=prev.next.next;
		
		
	}
	
	
	//finding the node value in a LL
	
	public Node find(int value) {
		Node node=head;
		while(node!=null) {
			if(node.value==value) {
				return node;
			}
			node=node.next;
		}
		return null;
	}
	
	
	
	
	//displaying elements
	
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.value+" -> ");
			temp=temp.next;
		}
		System.out.println("END");
	}
	
	
	private class Node {
		private int value;
		private Node next;

		public Node(int value) {
			this.value = value;
			this.next=null;
		}

		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}

	}
	

}
