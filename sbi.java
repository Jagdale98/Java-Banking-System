package ProjectPrograms;

public class sbi extends Account{

	private String bname="SBI Bank";

	public String getBname() {
		return bname;
	}
	
	sbi(String acHolderName, long acno, String ifsc, long cno, String city, double bal, int pin)
	{
		super(acHolderName,acno,ifsc,cno,city,bal,pin);
	}
}
