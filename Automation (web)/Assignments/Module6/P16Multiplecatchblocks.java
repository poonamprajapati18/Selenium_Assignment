package Java_Assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

class Divide1 {
	public void division() throws ArithmeticException,InputMismatchException {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("enter a = ");
		int a = sc.nextInt(); 
		System.out.println("enter b =");
		int b= sc.nextInt();
		int c =a/b;
		System.out.println("c");
		
		
	}

public class P16Multiplecatchblocks {
public static void main(String[]args) {
	try {
		Divide1 d = new Divide1();
		d.division();
	}catch (ArithmeticException e) {
		System.out.println("denominator should be greater than zero");
	}catch (InputMismatchException e) {
	 System.out.println("denominator should have numeric value");
	
	
}
	
	
}	
	
}
}