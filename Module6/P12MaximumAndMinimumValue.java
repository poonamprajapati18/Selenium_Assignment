package Java_Assignment;

public class P12MaximumAndMinimumValue {
public static void main(String[] args) {
//	int a[] = {5,6,3,1,7,4};
//	int max = a[0];
//	 for (int i =1; i<a.length; i++) {
//		 if (max<a[i]) {
//			 max=a[i];
//		 }
//	 }
//	 System.out.println("maximum element is "+max);
//	
	
   int a[] = {5,8,6,3,7,1};
   int min = a[0];
   for (int index=0; index<a.length; index++) {
	   if (min>a[index]) {
	   min=a[index];
	   }
	   
   } 
	  
	   System.out.println("minimum element is "+min);
   
	
}
}
