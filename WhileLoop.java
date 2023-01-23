package com.practiceLoops;

public class WhileLoop {

	public static void main(String[] args) {
		int i = 0;
		/*	while (i < 5) {
		  System.out.println(i);
		  i++;           /increment
		}
		*/
		i=10;                                    //print all even  no. btw 10-80
		while(i<=80) {
			if(i % 2== 0)
			System.out.println(i);
			i++;
			
		}
	}

}
