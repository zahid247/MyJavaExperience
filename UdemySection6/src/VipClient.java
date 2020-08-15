
public class VipClient {

	private double creditLimit;
	private String name;
	private String email;
	
	public VipClient() {
		this(0, "NoName", "NoEmail");
	}
	public VipClient(double creditLimit, String name) {
		this(creditLimit, name, "default@email.com");
	}
	public VipClient(double creditLimit, String name, String email) {
		this.creditLimit=creditLimit;
		this.name=name;
		this.email=email;
	}
	
	public double getCreditLimit() {
		return creditLimit;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	
}
