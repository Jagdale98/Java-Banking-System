package ProjectPrograms;

import java.util.Scanner;

public class Bank {

	String bankname;
	String branch;
	Account a;
	sbi s;
	
	Scanner sc=new Scanner(System.in);
	
	public Bank(String bankname, String branch) {
		super();
		this.bankname = bankname;
		this.branch = branch;
	}
	
	public void createAccount()
	{
		if(this.a==null)
		{			
			System.out.println("Enter the Account Holder name:");
			String aname=sc.next();
			System.out.println("Enter Account number :");
			long acno=sc.nextLong();
			System.out.println("Enter ifcs code");
			String ifsc=sc.next();
			System.out.println("Enter contact number");
			long cno=sc.nextLong();
			System.out.println("Enter city ");
			String city=sc.next();
			System.out.println("Enter Account Balnce :");
			double bal=sc.nextDouble();
			System.out.println("Enter the pin :");
			int pin=sc.nextInt();
			this.a=new Account(aname,acno,ifsc,cno,city,bal,pin);
			System.out.println("Account Created successfully....");
			
		}
		else
		{
			System.out.println("First create account");
		}
	}
	
	public void deleteAccount()
	{
		if(this.a==null)
		{
			System.out.println("First create account...");
		}
		else
		{
			System.out.println("Enter the pin :");
			int pin=sc.nextInt();
			if(pin==a.getPin())
			{
			this.a=null;
			System.out.println("Account deleted successfully.....");
			}
			else
			{
				System.out.println("Incorrect pin");
			}
		}
	}
	
	public void accountDetails()
	{
		if(this.a==null)
		{
			System.out.println("First create account...");
		}
		else
		{
			System.out.println("Enter the pin :");
			int pin=sc.nextInt();
			if(pin==a.getPin())
			{
				
				System.out.println("Bankname : ");
				System.out.println("Bank Branch : "+branch);
				System.out.println("Account Holder Name : "+a.getAcHolderName());
				System.out.println("Account No. : "+a.getAcno());
				System.out.println("Ifsc code : "+a.getIfsc());
				System.out.println("Contact No. : "+a.getCno());
				System.out.println("City : "+a.getCity());
			}
			else
			{
				System.out.println("Incorrect pin");
			}
		}
	}
	public void updateDetails()
	{
		if(this.a==null)
		{
			System.out.println("First ctreate account....");
		}
		else
		{
			System.out.println("Enter the pin :");
			int pin=sc.nextInt();
			if(pin==a.getPin())
			{
			    System.out.println("Enter city to update");
			    String city=sc.next();
			    a.setCity(city);
			    System.out.println("City updated successfully....");
			}
			else
			{
				System.out.println("Incorrect pin");
			}
		}
	}
	public void withdraw()
	{
		if(this.a==null)
		{
			System.out.println("First ctreate account....");
		}
		else
		{
		System.out.println("Enter the pin :");
		int pin=sc.nextInt();
		if(pin==a.getPin())
		  {
			 System.out.println("Enter account to withdraw :");
			 double amount=sc.nextDouble();
			 if(amount<=a.getBal())
			 {
				 double nbal=a.getBal()-amount;
				 a.setBal(nbal);
				 System.out.println("Amount withdraw successfyll....");
			 }
			 else
			 {
				 System.out.println("Incorrect pin");
			 }
		  }
		}
	}
	public void deposite()
	{
		if(this.a==null)
		{
			System.out.println("First create account...");
		}
		else
		{
			System.out.println("Enter the pin :");
			int pin=sc.nextInt();
			if(pin==a.getPin())
			{
				System.out.println("Enter ammount to deposite :");
				double amount=sc.nextDouble();
				
				double namount=a.getBal()+amount;
				a.setBal(namount);
				System.out.println("Amount added successfully....");
			}
		}
	}
	public void checkbalance()
	{
		if(this.a==null)
		{
			System.out.println("First create account...");
		}
		else
		{
			System.out.println("Enter the pin :");
			int pin=sc.nextInt();
			if(pin==a.getPin())
			{
				System.out.println("Available Balance : "+a.getBal() );
			}
			else
			{
				System.out.println("Incorrect pin");
			}
		}
	}
	public void changepin()
	{
		if(this.a==null)
		{
			System.out.println("First create account...");
		}
		else
		{
			System.out.println("Enter the pin :");
			int pin=sc.nextInt();
			if(pin==a.getPin())
			{
				System.out.println("Enter old pin ");
				int opin=sc.nextInt();
				if(opin==a.getPin())
				{
					System.out.println("Enter new pin ");
					int npin=sc.nextInt();
					a.setPin(npin);
					System.out.println("Pin change successfully....");
				}
				else
				{
					System.out.println("Incorrect pin");
				}
			}
		}
	}
}
