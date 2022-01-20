//package talentBattle;
//class Node
//{
//	int data;
//	Node next;
//	
//	Node()
//	{
//		data=0;
//		next=null;
//	}
//	
//	Node(int val)
//	{
//		data=val;
//		next=null;
//	}
//}
//
//class LinkedList
//{
//	Node head;
//	int count;
//	public LinkedList()
//	{
//		head=null;
//		count=0;
//	}
//	
//	void addBeg(int val)
//	{
//		Node n=new Node(val);
//		
//		if(head==null)
//		{
//			head=n;
//		}
//		else
//		{
//			n.next=head;
//			head=n;
//		}
//		count++;
//	}
//	
//	void addEnd(int val)
//	{
//		Node n=new Node(val);
//		if(head==null)
//		{
//			head=n;
//		}
//		else
//		{
//			Node temp=head;
//			while(temp.next!=null)
//			{
//				temp=temp.next;
//			}
//			temp.next=n;
//		}
//		count++;
//	}
//	
//	void addPos(int val,int pos)
//	{ 
//		Node n=new Node(val);
//		if(head==null)
//		{
//			head=n;
//		}
//		else
//		{
//			Node temp=head;
//			for(int i=1;i<pos-1;i++)
//			{	
//				temp=temp.next;
//			}
//			n.next=temp.next;
//			temp.next=n;
//		}
//		count++;
//	}
//	
//	void deleteLast()
//	{
//		if(head==null)
//		{
//			System.out.println("Empty");
//		}
//		else
//		{ 	Node temp=head;
//			while(temp.next.next!=null)
//			{
//				temp=temp.next;
//			}
//			temp.next=null;
//			count--;
//		}
//	}
//	
//	void deleteFirst()
//	{
//		if(head==null)
//		{
//			System.out.println("Empty");
//		}
//		else
//		{
//			head=head.next;
//		}
//		count--;
//	}
//	
//	void deletePos(int pos)
//	{
//		if(head==null)
//		{
//			System.out.println("Empty");
//		}
//		else
//		{
//			Node temp=head;
//			for(int i=1;i<pos-1;i++)
//			{
//				temp=temp.next;
//			}
//			temp.next=temp.next.next;
//		}
//		count--;
//		
//	}
//	
//	void disp()
//	{
//		Node temp=head;
//		for(int i=0;i<count;i++)
//		{
//			System.out.print(temp.data+"-->");
//			temp=temp.next;
//		}
//		System.out.println("");
//	}
//	
//	void search(int val)
//	{
//		if(head==null)
//		{
//			System.out.println("Empty");
//		}
//		else
//		{
//			Node temp=head;
//			
//			for(int i=1;i<=count;i++)
//			{
//
//				if(temp.data==val)
//				{
//					System.out.println("Valued found at position "+i);
//					break;
//				}
//				
//				temp=temp.next;
//			
//			}
//			
//		}
//	}
//	
//	
//	
//	
//}
//
//
//
//public class LinkedListDemo {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		LinkedList l=new LinkedList();
//		l.addEnd(10);
//		l.addEnd(20);
//		l.addEnd(30);
////		l.addBeg(0);
////		l.addPos(60,2);
////		l.disp();
////		l.deleteLast();
////		l.disp();
////		l.deleteFirst();
////		l.disp();
////		l.deletePos(2);
////		l.disp();
////		l.addEnd(30);
////		l.addBeg(0);
//		l.disp();
//		l.search(30);
//		
//		
//		
//
//	}
//
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
