package bank;

import org.testng.annotations.Test;

public class Cashier {
@Test (groups = "smoke")
	public void CashManagement() {
		System.out.println(" cash mangagement");
	}
@Test  (groups =" sanity")
    public void ChequeCollection() {
    	System.out.println(" cheque collection");
    }
@Test (groups ={"smoke","sanity"})
     public void reporting() {
    	 System.out.println(" reporting");
     }
 @Test
 public void Deposits() {
	 System.out.println(" deposits");
}
 @Test
 public void Withdrawals() {
	 System.out.println(" withdrawals");
 }
}
