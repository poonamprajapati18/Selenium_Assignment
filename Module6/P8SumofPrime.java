package Java_Assignment;

public class P8SumofPrime {
public static void main(String[]args) {
	int count = 0;
	int sum = 0;
	for(int number =1;number<=100; number++) {
		count = 0;
		for (int i=2; i<=number/2;i++) {
			if (number % i == 0);	{
				count++;
			}
	}
		if (count == 0 && number!= 1) {
			sum = sum+number ;
		}
	}
      System.out.println("The sum of Prime Numbers from 1 to 100 is :"+sum);
    	
    
	}
	
	
	


}	

