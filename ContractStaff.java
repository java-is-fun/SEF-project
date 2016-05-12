
public class ContractStaff extends Employee {
private int rates;

	public ContractStaff(String name,String skillLevel int rates) {
		super(name);
		this.rates = rates;
	}
	
	public int getRates() {
		return rates;
	}
	
	public void setRates(int rates) {
		this.rates = rates;
	}
}
