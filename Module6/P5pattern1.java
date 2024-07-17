package Java_Assignment;

public class P5pattern1 {
public static void main(String[] args) {
	for (int i=1; i<=5; i++ ) {
	for (int j=1; j<=i; j++) {	
	System.out.print(j);
	}
	System.out.println();
	}
	
	for (int I=1; I<=4; I++) {
	for (int j=1; j<=I; j++)	{
     System.out.print(I + " ");;
	}
		System.out.println();
		
	}
	
	for (int i=1; i<=5; i++) {
	for (int j=1; j<=i;j++) {
		System.out.print("*");
	}
	System.out.println();
	}
	 
	for (int i=1; i<=6; i++) {
	for (int j=1; j<=i; j++) {
    	int sum = i+j;
     if (sum % 2 ==0) {  //even
    	 System.out.print("1 ");
     } else { //odd
    	 System.out.print("0 ");
     }
	}
	System.out.println();
}
}
}

