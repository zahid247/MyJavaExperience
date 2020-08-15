
public class BankAccount {
	
	private long accountNumber;
	private double balance;
	private String customerName;
	private String email;
	private long phoneNumber;
	
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public long getAccountNumber() {
		return this.accountNumber;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getBalance() {
		return this.balance;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerName() {
		return this.customerName;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return this.email;
	}
	
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public long getPhoneNumber() {
		return this.phoneNumber;
	}

	public double deposit(double money) {
		this.balance += money;
		return this.balance;
	}
	public double withdraw(double money) {
		this.balance -= money;
		if(this.balance<0) {
			System.out.println("Withdrawal not possible!");
			this.balance += money;
			return -1;
		}else return this.balance;
	}
	

}
