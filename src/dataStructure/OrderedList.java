import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class Node1{
		int data;
		Node1 next;
		
		Node1(int data){
			this.data=data;
			next=null;
			
		}
	}
	
public class OrderedList {

	
	Node1 head;
	////////////////////////////////////////////////////////insert//////////////////////////////////////
	static OrderedList insert(OrderedList list, int value) {
		Node1 new_node = new Node1(value); // create new node with data
		new_node.next = null;

		if (list.head == null) {// if linkedlist empty then make new node
			list.head = new_node;
		} else {

			Node1 currNode = list.head;

			if (currNode.data < new_node.data) {
				while (currNode.data < new_node.data && currNode != null) {
					// currNode.next=new_node;
					currNode = currNode.next;
					System.out.println(currNode.data + "," + currNode.next);
				}
				currNode.next = new_node;
				new_node.next = currNode.next.next;
			} else {
				// while(currNode.next!=null ) {
				new_node.next = list.head;
				list.head = new_node;

			}

		}
		return list;
	}
	
	static OrderedList insertMid(OrderedList list,int value) {
		Node1 new_node=new Node1(value);  //create new node with data
		new_node.next=null;
		Node1 currNode=list.head; 
		Node1 prev=null;
	
		//-----------------------case 1: key at head---------------------
		
		if (list.head == null ) { 
           list.head=new_node;	
		}else { 
			currNode=list.head; 
//		//---------------------case 2: key other than head--------------
			
			
			//int mid=count/2;
		while( true) {
			if(currNode.data>=value) {
				prev =currNode;
				currNode=currNode.next;
			}else if(currNode.data<value) {
				list.head=new_node;		
				new_node.next=list.head;	//insert at first node	
				
			}else {
				break;
			}
			
			
			//mid--;
		}
		
		
			prev.next=new_node;
			new_node.next=currNode;
		}

		
		return list;
	}
////////////////////////////////////////////////////////traversal/////////////////////////////////////////
	
	static void printList(OrderedList list) {
		Node1 currNode=list.head;
		
		System.out.print("List:");
		while(currNode != null) {
			System.out.print(currNode.data+"-");
			currNode=currNode.next;		//goto next node
		}
	}
	
//////////////////////////////////////////////////////delete//////////////////////////////////////////////
	
	static OrderedList deleteByValue(OrderedList list,int value) {
		
		Node1 currNode=list.head;
		Node1 prev=null;
		
		//-----------------------case 1: key at head---------------------

		if (currNode != null && currNode.data==value) { 
            list.head = currNode.next; // Changed head 
  
            // Display the message 
            System.out.println(value + " found and deleted"); 
            printToFile(list);
            // Return the updated List 
            return list; 
        } 
		
		//---------------------case 2: key other than head--------------
		
		
		while(currNode !=null && currNode.data!=value) {
			prev =currNode;
			currNode=currNode.next; // getting next node
			
		}
		
		if(currNode != null) {
			prev.next=currNode.next;
			System.out.println("\n'"+value+"' found and deleted");
			printToFile(list);
		}
		
		//--------------------case 3:key not present----------------------
		//System.out.println("list prv="+prev+"="+value);
		if(currNode == null) {
			System.out.println("\n'"+value+"' not found");
			
			insertMid(list,value);
			String val=value+" ";
			addToList(val);
		}
		
		return list;
	}
	
	////////////////////////////////////////////////deletion at position /////////////////////////////////////////////////
	
	static OrderedList deleteByIndex(OrderedList list,int index) {
		Node1 currNode=list.head;
		Node1 prev=null;
		
		//------------------------case 1: index 0----------------------------------
		
		if(index ==0 && currNode !=null) {
			list.head=currNode.next;
			System.out.println(index+" index data deleted");
			return list;
		}
		
		//-----------------------case 2:0<index<list size------------------
		
		int counter=0;
		
		while(currNode!=null) {
			if(counter ==index) {
				prev.next=currNode.next;
				System.out.println(index+" index data deleted");
				break;
			}else {
				prev=currNode;
				currNode=currNode.next;
				counter++;
			}
		}
		
		if(currNode==null) {
			System.out.println(index+" index data deleted");
		}
		
		return list;
	}
	
	static void printToFile(OrderedList list) {
		Node1 currNode=list.head;
		try {
		FileOutputStream fos=new FileOutputStream("/home/admin1/Desktop/Text.txt");
		//System.out.print("List:");
		while(currNode != null) {
			String s=currNode.data+" ";
			byte b[]=s.getBytes();
			fos.write(b);
			currNode=currNode.next;		//goto next node
		}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	static void addToList(String value) {
		try {
		FileOutputStream fos=new FileOutputStream("/home/admin1/Desktop/Text.txt",true);
		byte b[]=value.getBytes();
		fos.write(b);
		fos.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

	
	public static void main(String[] args) {
		
		try {
				OrderedList list=new OrderedList();
				BufferedReader br=new BufferedReader(new FileReader("/home/admin1/Desktop/Text.txt"));

				StringBuffer stringBuffer = new StringBuffer("");
				
				String line ="";
				int i=1;
				while ((line = br.readLine()) != null) {
				
					String	 l[]=line.replaceAll("[^0-9]+"," ").split(" ");i--;
//int sd[]=new int[],z=0;
					for(String sk:l){
						int sd=Integer.parseInt(sk);//z++;
						insert(list,sd);
					}
				    stringBuffer.append(line);
				}
				
				printList(list);
				System.out.println("\nEnter word to search:");
				Scanner sc=new Scanner(System.in);
				int search=sc.nextInt();
				
				deleteByValue(list,search);
				
				printList(list);
				sc.close();
				br.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
