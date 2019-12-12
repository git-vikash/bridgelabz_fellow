package dataStructure;

import java.io.BufferedReader;

import java.io.FileOutputStream;
import java.io.FileReader;

import java.util.Scanner;

class Node{
		String data;
		Node next;
		
		Node(String data){
			this.data=data;
			next=null;
			
		}
	}
	
public class UnOrderedList {

	
	Node head;
	////////////////////////////////////////////////////////insert//////////////////////////////////////
	static UnOrderedList insert(UnOrderedList list,String data) {
		Node new_node=new Node(data);  //create new node with data
		new_node.next=null;
		
		if(list.head==null) {//if linkedlist empty then make new node
			list.head=new_node;
		}else {
			Node last=list.head;	//else goto last node and add new node
			
			while(last.next != null) {
				last=last.next;
			}
			last.next=new_node;
		}
		return list;
	}
	
////////////////////////////////////////////////////////traversal/////////////////////////////////////////
	
	static void printList(UnOrderedList list) {
		Node currNode=list.head;
		
		System.out.print("List:");
		while(currNode != null) {
			System.out.print(currNode.data+"-");
			currNode=currNode.next;		//goto next node
		}
	}
	
	
//////////////////////////////////////////////////////search////////////////////////////////////////////

//	static void search(LinkedList list,String input) {
//		Node currNode=list.head;
//		
//		while(currNode != null && currNode.data==input) {
//			
//			System.out.print(currNode.data+" found! ");
//			currNode=currNode.next;		//goto next node
//		}
//		if(currNode == null) {
//			System.out.println(key+" not found");
//		}
//		
//	}
//////////////////////////////////////////////////////delete//////////////////////////////////////////////
	
	static UnOrderedList deleteByValue(UnOrderedList list,String value) {
		
		Node currNode=list.head;
		Node prev=null;
		
		//-----------------------case 1: key at head---------------------
//		System.out.println("list head="+list.head.data+"="+list.head.next);
//		System.out.println("list curr="+currNode.data+"="+currNode.next);
//		System.out.println(currNode);
//		System.out.println("list prv="+prev+"="+value);
//		if(currNode !=null && currNode.data !=value) {
//			list.head=currNode.next;	//change head
//			System.out.println("deleted :"+value);
//			return list;
//		}
		if (currNode != null && currNode.data.equals(value)) { 
            list.head = currNode.next; // Changed head 
  
            // Display the message 
            System.out.println(value + " found and deleted"); 
            printToFile(list);
            // Return the updated List 
            return list; 
        } 
		
		//---------------------case 2: key other than head--------------
		
		
		while(currNode !=null && !currNode.data.equals(value)) {
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
			insert(list,value);
			String val=value+" ";
			addToList(val);
		}
		
		return list;
	}
	
	////////////////////////////////////////////////deletion at position /////////////////////////////////////////////////
	
	static UnOrderedList deleteByIndex(UnOrderedList list,int index) {
		Node currNode=list.head;
		Node prev=null;
		
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
	
	static void printToFile(UnOrderedList list) {
		Node currNode=list.head;
		try {
		FileOutputStream fos=new FileOutputStream("/home/admin1/Desktop/Text.txt");
		//System.out.print("List:");
		while(currNode != null) {
			String s=currNode.data+" ";
			byte b[]=s.getBytes();
			fos.write(b);
			currNode=currNode.next;		//goto next node
			
		}fos.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	static void addToList(String value) {
		try {
		FileOutputStream fos=new FileOutputStream("/home/admin1/Desktop/Text.txt",true);
		
		//String value="abc ";
		byte b[]=value.getBytes();
		fos.write(b);
		fos.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}


	public static void main(String[] args) {
		
		try {
				UnOrderedList list=new UnOrderedList();
				BufferedReader br=new BufferedReader(new FileReader("/home/admin1/Desktop/Text.txt"));

				StringBuffer stringBuffer = new StringBuffer("");
				
				String line ="";
				
				while ((line = br.readLine()) != null) {
					
					String l[]=line.replaceAll("[^a-zA-Z0-9]+"," ").split(" ");
					
					for(String sk:l){
						insert(list,sk);
					}
				    stringBuffer.append(line);
				}
				
				printList(list);
				System.out.println("\nEnter word to search:");
				Scanner sc=new Scanner(System.in);
				String search=sc.nextLine();
				
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
