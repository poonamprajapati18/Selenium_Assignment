package Java_Assignment;

public class P22Reverse {
	public static void Reverse1(int[]a) {
		int i=0, j=a.length-1;
		while (i<j) {
		int temp = a[i];
		a[i] =a[j];
		i++;
		j--;
		
		
		
		}
		
	}
	
	
	
	
	
public static void main(String[] args) {
	
	int a[] = {24,56,8,32,4,10};
	 for (int i =0; i<a.length;i++) {
		 System.out.print(a[i] +" ");
		 
	 }
	
	
	
	
      Reverse1(a);
	System.out.println();
	 for (int i =0; i<a.length;i++) {
		 System.out.print(a[i] +" ");
	
	
	
	
}
}	
}
