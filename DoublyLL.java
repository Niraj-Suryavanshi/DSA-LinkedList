package talentBattle;
class Node
{
	int data;
	Node next;
	Node prev;
	
	Node()
	{
		
	}
	
	Node(int val)
	{
		data=val;
		prev=next=null;
	}
	
	
}

class DLL
{
	Node head;
	int count;
	
	public DLL()
	{
		head=null;
		count=0;
	}
	
	void addBeg(int val)
	{
		Node n=new Node(val);
		
		if(head==null)
		{
			head=n;
			
		}
		else
		{
			n.next=head;
			n.next.prev=n;
			head=n;
		}
		count++;
	}
	
	void addEnd(int val)
	{
		Node n=new Node(val);
		Node temp=head;
		if(head==null)
		{
			System.out.println("Empty");
			
		}
		else
		{
			
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=n;
			n.prev=temp;
			count++;
		}
		
	}
	
	void addPos(int val,int pos)
	{
		Node n=new Node(val);
		
			Node temp=head;
			for(int i=1;i<pos-1;i++)
			{
				temp=temp.next;
			}
			temp.next.prev=n;
			n.next=temp.next;
			temp.next=n;
			n.prev=temp;
			count++;
		
		
	}
	
	void deleteLast()
	{
		Node temp=head;
		while(temp.next.next!=null)
		{
			temp=temp.next;
		}
		
		
		temp.next=null;
		count--;
	}
	
	void deleteFirst()
	{
		head.next.prev=null;
		head=head.next;
		count--;
	}
	
	void dispForward()
	{
		Node temp=head;
		if(head==null)
		{
			System.out.println("Empty list");
		}
		else
		{
			for(int i=0;i<count;i++)
			{
				System.out.print(temp.data+"-->");
				temp=temp.next;
			}
			System.out.println();
		}
	}
	
	void deletePos(int pos)
	{
		Node temp=head;
		for(int i=1;i<pos-1;i++)
		{
			temp=temp.next;
		}
		temp.next.next.prev=temp;
		temp.next=temp.next.next;
		count--;
	}
	
	void dispBackward()
	{
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		
		for(int i=0;i<count;i++)
		{
			System.out.print(temp.data+"-->");
			temp=temp.prev;
		}
		System.out.println();
	}
}	

public class DoublyLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DLL l=new DLL();
		l.addBeg(5);
		l.addBeg(54);
		l.addBeg(99);
		l.addBeg(99);
		l.addEnd(100);
		l.dispForward();
		l.addPos(44, 2);
		
		l.dispBackward();
		l.dispForward();
		l.deleteLast();
		l.dispForward();
		l.deleteFirst();
		l.dispForward();
		l.deletePos(3);
		l.dispForward();
		

	}

}
