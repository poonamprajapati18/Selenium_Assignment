package Java_Assignment;

import java.util.Scanner;

public class P1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("enter the second number: ");
        int num2 = sc.nextInt();
        System.out.println("enter the third number: ");
        int num3 = sc.nextInt();
        
        if (num1>num2 && num1>num3) {
        	System.out.println("greatest number "+num1);
        } else if (num2>num1 && num2>num3) {  
        	System.out.println("greatest number "+num2);
        } else {
        	System.out.println("greatest number "+num3);
        }
        	

        	
        	
        	
        }
	
	
	
	
}	

