package bank;

import org.testng.annotations.Test;

public class BankManager {
@Test (groups = "smoke")
	public void Employesshandling() {
		System.out.println("employees handling");
	}
@Test
    public void HandleCustomerComplaints() {
    	System.out.println(" Customer handling");
    }
@Test
    public void MakePolicies() {
    	System.out.println(" make policy");
    }
@Test (groups = "sanity")
   public void BranchManagement() {
	System.out.println(" branch management");
}

}
