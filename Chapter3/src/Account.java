
public class Account {

	private double balance;
	
	public Account( double initialBalance){ // array called Account with type double initial balance
		
		if (initialBalance > 0.0)
			balance = initialBalance;
		
	}
	
	public void credit ( double amount ){
		
		balance = balance + amount;
		
	}
	
	public double getBalance(){
		
		return balance;
		
	}
	
}
