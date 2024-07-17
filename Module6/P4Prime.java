package Java_Assignment;

import java.util.Scanner;

public class P4Prime {
public static void main(String[] args) {
//	int number = 7;
	int count = 0;
	 
	for (int i=1;i<=100;i++) {
		if(count % i ==0) {
			count++;
		}
	if( count==2) {
	System.out.println("Prime");
	}else
	System.out.println("not prime");
		
	}
	
	
	
	
	
}
	
}
