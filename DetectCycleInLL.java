package linked_List;

public class DetectCycleInLL {
	static Node detectCycle(Node head)
	{
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast)
			{
				return slow;
			}
		}
		return null;
	}
	
		void detectFirstNode(Node head)
		{
			Node meet=detectCycle(head);
			Node start=head;
			while(start!=meet)
			{
				start=start.next;
				meet=meet.next;
			}
			while(start.next!=meet)
			{
				start=start.next;
			}
			start.next=null;
			
			
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(3);
		Node n4=new Node(4);
		Node n5=new Node(5);
		Node n6=new Node(6);
		
		
		Node head=n1;
		
		head.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		n6.next=n3;
		
		DetectCycleInLL n11=new DetectCycleInLL();
		n11.detectFirstNode(head);
		
		System.out.println("Linked List after removing loop is:");
		traverse(head);
	}
		

	}


