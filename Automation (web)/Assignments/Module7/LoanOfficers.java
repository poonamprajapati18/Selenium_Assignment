package bank;

import org.testng.annotations.Test;

public class LoanOfficers {
@Test 
	public void Homeloan() {
		System.out.println(" home loan");
	}
@Test (groups =" smoke")
    public void GoldLoan() {
	System.out.println(" gold loan");
}
@Test (groups = {"smoke","sanity"})
    public void Educationloan() {
	System.out.println(" education loan");
}
@Test (groups ="sanity")
public void document() {
	System.out.println( "document"); 
	
}
}
