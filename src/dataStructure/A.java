

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class A {



	public static void main(String[] args) throws IOException {
		
		LinkedList<String> list =new LinkedList<String>();
		Scanner sc=new Scanner(System.in);
		
		File file = new File("/home/admin1/Desktop/Text.txt");
				
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
	
		String str;
		String words[] = null;
		String input,yes;
		
		int choice,flag=0;
		char ch;
		
		// Add the All Data to linked List
		
		while((str=br.readLine())!=null)
		{
			words = str.split(" ");
			for(String word : words)
			{
				list.addLast(word);
			}
			System.out.println("Linked list is :"+list);
		}
		
	
		
		
		do {
			
					System.out.println("Enter your choice ......");
					System.out.println("1. search()");
					System.out.println("2.show");
					
					choice = sc.nextInt();
				
					
				   
					System.out.println("Enter the Word to Searching.....");
								input = sc.next();
				
					switch(choice)
					{
							// Search the element 
					case 1:
							
								
									
								///// check if , word is found then remove otherwise add at the end
									flag=0;
									for(String s : list)
									{
										if(input.equals(s))
										{
											flag=1;
											list.remove(s);
										    writeToFileAfterDelete(list,file);
											System.out.println("removed:"+s);break;
										}	
									}

//									
									if(flag==0)
									{
										list.add(input);
										writeToFileAfterAdd(list,file);
										for(String s : list)
										{
											System.out.print(s+"-");
											
											
										}
									}
									
									
									System.out.println("Flag : "+flag);
									
									break;
									
					case 2 :
									
									show(list);
									
									break;
									
									
					default : 
							
								System.out.println("Enter the Valid choice...........");
					
				}
				
				
				System.out.println("Do you want to continue ? press y or Y ");
				
				ch=sc.next().charAt(0);
				
		}while(ch=='Y'||ch=='y');
		
		
	}



	private static void writeToFileAfterAdd(LinkedList<java.lang.String> list,File file) throws IOException {
		FileWriter fw = new FileWriter(file,true);  
	    BufferedWriter bw = new BufferedWriter(fw);
	   
	    for(String s : list)
		{
	    	System.out.println(" "+s);
			bw.write(s);
		}
		
	    System.out.println("File Written Successfully: After ADD");
	    System.out.println("After ADD : "+list);
	}



	private static void writeToFileAfterDelete(LinkedList<java.lang.String> list,File file) throws IOException {
		
		FileWriter fw = new FileWriter(file,true);  
	    BufferedWriter bw = new BufferedWriter(fw);  
	  
		
		for(String s : list)
		{
			System.out.println(" "+s);
			bw.write(s);
			
		}
	
		System.out.println("File Written Successfully: After DELETE");
	    
	    System.out.println("After delete : "+list);
	}



	private static void show(LinkedList<java.lang.String> list) {
		
		System.out.println(list);
	}


}