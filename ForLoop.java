package com.practiceLoops;

public class ForLoop {

	public static void main(String[] args) {
/*		for (int i = 0; i < 10; i++) {      // print  0-10
			System.out.println(i);
		}
*/
/*	for(int i=1; i<=10; i++) {      // table of 2
			System.out.println(i*2);
		}
*/
		for(int i=1; i<=10; i++) { 
			if(i==5)
		       //break;                  // table of 2
				continue;
			System.out.println(i*2);
		}
	}
}
