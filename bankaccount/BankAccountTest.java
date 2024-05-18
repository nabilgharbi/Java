
public class BankAccountTest {
	public static void main(String[] args) {
		
	BankAccount user1 = new BankAccount();
	BankAccount user2 = new BankAccount();
	BankAccount user3 = new BankAccount();

	user1.accountDeposit("Savings", 300.00);
	user2.accountDeposit("checking", 805.00);
	user3.accountDeposit("savings", 20654.50);
    
	user1.accountWithdrawal("Checking", 365.00);
	user2.accountWithdrawal("checking", 80.00);
	user3.accountWithdrawal("savings", 3000.00);
    
	user2.myBalance();
	user1.myBalance();
	user3.myBalance();
	}
}