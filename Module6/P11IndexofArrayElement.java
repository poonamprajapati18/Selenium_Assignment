package Java_Assignment;

import java.lang.reflect.Array;




public class P11IndexofArrayElement {
public static void main(String[] args) {
	int a[] = {10,20,35,60,23};
	int element = 20;
	int  Index = -1;
	for(int i=0; i< a.length; i++) {
		if ( a[i] == element) {
			Index = i;
		}
	}
	if (Index != -1) {
	System.out.println("Element is found");
	}else {
		System.out.println("Element is not found in array ");
	}
		
	
	
	
	
}
	
}
