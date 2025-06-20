package ProjectPrograms;

public class unionbank  extends Account{

	private String baname="Union Bank";

	public String getBaname() {
		return baname;
	}
	
	unionbank(String acHolderName, long acno, String ifsc, long cno, String city, double bal, int pin)
	{
		super(acHolderName,acno,ifsc,cno,city,bal,pin);
	}
}
