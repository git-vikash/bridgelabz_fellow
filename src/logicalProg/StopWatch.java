package logicalProg;

import java.util.Scanner;

public class StopWatch {
	private static double startTime,stopTime,totalTime;

	private static void startStopwatch() {
		startTime=System.currentTimeMillis();
		System.out.println("Start Time:"+startTime);
	}

	private static void stopStopwatch() {
		stopTime=System.currentTimeMillis();
		System.out.println("Stop Time"+stopTime);
		totalTime=stopTime-startTime;

		System.out.println("Total time:"+totalTime/1000+" sec");
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean state=true;
		do {
			System.out.println("Press 1 to start and 0 to stop:");

			switch(sc.nextInt()){
			case 1: startStopwatch();
			state=true;
			break;
			case 0: stopStopwatch();
			state=false;
			break;
			default: System.out.println("please choose a valid option:");
			}
		}while(state);		

		sc.close();
	}



}
