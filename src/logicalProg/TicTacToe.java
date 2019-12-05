package logicalProg;

import java.util.Scanner;

public class TicTacToe {
	public static int board[][]=new int[3][3];
	public static void userInsert(int x,int y) {
		board[x][y]=1;
		
		
		
		int m=(int)Math.random()*100/3;
		double n=(int)Math.random()*100/3;
		System.out.println(m+","+n);
	}
	
	public static void computerInsert(int x,int y) {
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of x and  y");
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		userInsert(x,y);
		
		System.out.println(" | 0 : 1 : 2 :");
		System.out.println("--------------");
		for(int i=0;i<3;i++) {
			System.out.print(i+"| ");
			for(int j=0;j<3;j++) {
				
				System.out.print(board[i][j]+" : ");
			}
			System.out.println("\n");
		}
		sc.close();
	}
	
	
	
	
}
