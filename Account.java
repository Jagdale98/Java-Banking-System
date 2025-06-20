package ProjectPrograms;

public class Account {

	private String acHolderName;
	private long acno;
	private String ifsc;
	private long cno;
	private String city;
	private double bal;
	private int pin;
	
	public Account(String acHolderName, long acno, String ifsc, long cno, String city, double bal, int pin) {
		super();
		this.acHolderName = acHolderName;
		this.acno = acno;
		this.ifsc = ifsc;
		this.cno = cno;
		this.city = city;
		this.bal = bal;
		this.pin = pin;
	}

	public String getAcHolderName() {
		return acHolderName;
	}

	public long getAcno() {
		return acno;
	}


	public String getIfsc() {
		return ifsc;
	}

	public long getCno() {
		return cno;
	}

	public void setCno(long cno) {
		this.cno = cno;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	
	
}
