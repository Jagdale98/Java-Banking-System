package ProjectPrograms;

import java.util.Scanner;

public class abDriver {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter area of bank ");
		String area=sc.next();
		Bank b1=new Bank("HDFC Bank ",area);
		boolean exit=true;
		while(exit)
		{
		System.out.println("Enter your choice : \n1.Create Account \n2.Delete Account \n3.Display Account Details \n4.Update Details \n5.Withdraw ammount \n6.Deposite \n7.Check Balance \n8. Change pin \n9.Exite");
        int choice=sc.nextInt();
      
        switch(choice)
        {
        case 1:
        {
			System.out.println("Enter your choice \n1.SBI Bank \n2.HDFC Bank \n3.Union Bank");
			int choice1=sc.nextInt();
			if(choice1==1)
			{
     	      b1.createAccount();	
			}
			else if(choice1==2)
			{
				b1.createAccount();
			}
			else if(choice1==3)
			{
				b1.createAccount();
			}
			else
			{
				System.out.println("Invalid Choice....");
			}
        }
        break;
        case 2:
        {
        	b1.deleteAccount();
        }
        break;
        case 3:
        {
        	b1.accountDetails();
        }
        break;
        case 4:
        {
        	b1.updateDetails();
        }
        break;
        case 5:
        {
        	b1.withdraw();
        }
        break;
        case 6:
        {
        	b1.deposite();
        }
        case 7:
        {
        	b1.checkbalance();
        }
        break;
        case 8:
        {
        	b1.changepin();
        }
        break;
        case 9:
        {
        	exit=false;
        	System.out.println("HDFC application closed successfully....");
        	
        }
        break;
        default:
        {
        	System.out.println("Invalide Chioice...");
        }
        }
        }
	}
}
