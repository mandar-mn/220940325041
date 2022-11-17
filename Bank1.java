class Bank1
{
	
	int accno = 100;
	double balance = 1000;
	
	void withdraw(int withdrawal)
	{try
		{
			if (balance>withdrawal);
			{
				
				System.out.println("You are withdrawing  "+withdrawal+"  amount from your balance");
				balance = balance - withdrawal;
				System.out.println("Your new balance is  "+balance);
				
			}
		
		}
	catch(Exception e)
	{
		System.out.println("You cannot withdraw amount larger than your balance");
			
	}
		
		
		
	}
	
	void deposit(int deposited)
	{
		balance = balance + deposited;
		System.out.println("Your new balance is  "+balance);
	}
	void show()
	{
		System.out.println("Your balance is  "+balance);
	}


	public static void main(String args[])
	{
		Bank1 c = new Bank1();
		c.show();
		c.withdraw(100);
		c.show();
		c.deposit(1000);
		c.withdraw(10000);
		
		
	}	
}