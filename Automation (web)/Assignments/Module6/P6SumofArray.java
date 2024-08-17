package Java_Assignment;

public class P6SumofArray {
	
public static void main(String[] args) {
	int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int length = array.length;
	 int sum = 0;
	 for (int i =0;i<length;i++) {
		 sum = sum+ array[i];
	 }
	 
	System.out.println("sum of elements of array : " +sum);
}


	

}
