package linked_List;

public class ReverseLinkedList {
	static void traverse(Node head)
	{
		Node cur=head;
		while(cur!=null)
		{
			System.out.println(cur.data);
			cur=cur.next;
		}
	}
	
	static Node reverseLinkedList(Node head)
	{
		Node cur=head;
		Node prev=null;
		while(cur!=null)
		{
			Node temp=cur.next;
			cur.next=prev;
			prev=cur;
			cur=temp;
		}
		
		return prev;
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
		System.out.println("Linked List Traversing");
		traverse(head);
		head=reverseLinkedList(head);
		System.out.println("Reverse Linked List Traversing");
		traverse(head);
	}

}
