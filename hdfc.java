package ProjectPrograms;

public class hdfc extends Account{

	private String bname="HDFC Bank";

	public String getBname() {
		return bname;
	}
	
  hdfc(String acHolderName, long acno, String ifsc, long cno, String city, double bal, int pin)
	{
		super(acHolderName,acno,ifsc,cno,city,bal,pin);
	}
}
