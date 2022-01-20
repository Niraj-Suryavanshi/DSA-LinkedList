package talentBattle;

class Node
{
	int data;
	Node next;
	Node()
	{
		data=0;
		next=null;
	}
	Node(int data)
	{
		this.data=data;
		
	}
}

class LinkedList
{
	Node head;
	int count=0;
	Node tail;
	public LinkedList()
	{
		head=null;
		
	}
	void addEnd(int val)
	{
		Node n=new Node(val);
		if(head==null)
		{
			head=n;
			tail=n;
			n.next=head;
		}
		else
		{
			Node temp=head;
			while(temp.next!=head)
			{
				temp=temp.next;
			}
			temp.next=n;
			tail=n;
			n.next=head;
		}
		count++;
	}
	
	void addPosition(int val,int pos)
	{
		Node n=new Node(val);
		if(head==null)
		{
			head=n;
		}
		else
		{
			Node temp=head;
		
			for(int i=1;i<pos-1;i++)
			{
				temp=temp.next;
			}
			n.next=temp.next;
			temp.next=n;
			count++;
			
		}
	}
	
	void addBeg(int val)
	{
		Node n=new Node(val);
		Node temp=head;
		while(temp.next!=head)
			{
				temp=temp.next;
			}
			Node lastnode=temp;
			n.next=head;
			head=n;
			lastnode.next=n;
		
		count++;
	}
	
	void deleteBeg()
	{
		
			Node temp=head;
			Node lastnode=head;
			while(lastnode.next!=head)
			{
				lastnode=lastnode.next;
			}
			head=temp.next;
			lastnode.next=head;
			temp.next=null;
			count--;
		
	}
	
	void deletelast()
	{
		
			Node temp=head;
			
			while(temp.next.next!=head)
			{
				temp=temp.next;
			}
			temp.next=head;
			tail=temp;
			count--;
		
	}
	
	void deletePos(int pos)
	{
		
			Node temp=head;
			
			for(int i=1;i<pos-1;i++)
			{
				temp=temp.next;
			}
			temp.next=temp.next.next;
			count--;
		
	}
	
	void disp()
	{
		Node temp=head;
		for(int i=0;i<count;i++)
		{
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		System.out.println();
		
	}
	
}



public class SinglyCircularLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l=new LinkedList();
		l.addEnd(43);
		l.addEnd(41);
		l.addEnd(3);
		l.addBeg(1);
		l.addPosition(111,5);
		l.disp();
		l.deleteBeg();
		l.disp();
		l.deletelast();
		l.disp();
		l.deletePos(2);
		l.disp();

	}

}
