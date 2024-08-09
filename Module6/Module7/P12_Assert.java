package JunitNew.JunitNew;

import org.junit.Assert;
import org.junit.Test;

public class P12_Assert {
@Test
	public void test() {
		System.out.println("test is running");
	}
	@Test
	public void test1() {
		System.out.println("test1 is running");
		int a[] = {1,2,3,4,5,6,7};
		int b[]= {1,2,3,4,5,6};
		Assert.assertArrayEquals(a,b);
		Assert.assertFalse(true);
	}
	@Test
	
	public void test2() {
		System.out.println("test2 is running");
	   
	}
}
