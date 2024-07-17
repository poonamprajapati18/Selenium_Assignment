package Java_Assignment;

public class P20Array4 {
public static void main(String[] args) {
	int a[] = {11,12,15,6,9,13};
	int b[] =  new int[a.length];
	b=a;

	for (int i=0;i<a.length; i++) {
		System.out.print(b[i] +" ");
}
	

}
}