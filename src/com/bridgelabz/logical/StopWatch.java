package com.bridgelabz.logical;

import com.bridgelabz.utils.InputUtility;

/*************************************************************************************
 * @author   Arvind kumar
 * @Version  1.0
 * @purpose  program to calculate the seconds
 * @date     19-11-19
 *************************************************************************************/

public class StopWatch{
		public static long starttime = 0;
		public static long stoptime = 0;
		static long elapsed;
		
		public static void start(int n){
			starttime = System.currentTimeMillis();
		//	System.out.println("The Started time is : "+starttime);
		}
		public static void stop(int n2){
			stoptime = System.currentTimeMillis();
		//	System.out.println("Stop time is : "+stoptime);
		}
		public static long getElapsed(){
			elapsed = stoptime - starttime;
			return elapsed;
		}
		
		public static void main(String[] args){
			
			System.out.println("Press any no. to start stopwatch : ");
			int n = InputUtility.nextInt();
			StopWatch.start(n);
			System.out.println("Press any no. to stop stopwatch");
			int n2 = InputUtility.nextInt();
			StopWatch.stop(n2);
			System.out.println(StopWatch.getElapsed()/1000+" sec");
			
		}
}
