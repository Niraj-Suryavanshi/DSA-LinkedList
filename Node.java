package linked_List;

public class Node{

	int data;
	Node next;
	
	Node(int data)
	{
		this.data=data;
	}
	
	static void traverse(Node head)
	{
		Node cur=head;
		while(cur!=null)
		{
			System.out.println(cur.data);
			cur=cur.next;
		}
	}
	
	static void insert(int data,Node head,int pos)
	{
		Node toAdd=new Node(data);
		if(pos==0)
		{
			toAdd.next=head;
			head=toAdd;
			return;
		}
		
		Node prev=head;
		for(int i=0;i<pos-1;i++)
		{
			prev=prev.next;
		}
		toAdd.next=prev.next;
		prev.next=toAdd;
	}
	static void delete(Node head,int pos)
	{
		if(pos==0)
		{
			head=head.next;
			return;
		}
		Node prev=head;
		for(int i=0;i<pos-1;i++)
		{
			prev=prev.next;
		}
		prev.next=prev.next.next;
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1=new Node(10);
		Node n2=new Node(20);
		Node n3=new Node(30);
		Node n4=new Node(40);
		Node n5=new Node(50);
		
		Node head=n1;
		head.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=null;
		System.out.println("Traversing");
		traverse(head);
		insert(100,head,3);
		System.out.println("Traversing after insertion:");
		traverse(head);
		delete(head,3);
		System.out.println("Traversing after deleting node");
		traverse(head);



	}

	
}
