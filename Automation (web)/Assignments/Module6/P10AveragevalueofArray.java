package Java_Assignment;



public class P10AveragevalueofArray {
public static void main(String[] args) {
	int a[] = {1,2,9,15,23,45};
	int length = a.length;
	int average = 0;
	int sum = 0;

	for(int i=0; i<a.length;i++) {
	sum = sum+a[i];
	}
	average = sum/length;
	System.out.println(average);
	
	
}
}