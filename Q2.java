class Bank
{
	
	int accno = 100;
	double balance = 1000;
	
	void withdraw(int withdrawal)
	{if (balance> withdrawal);
		try
		{
			System.out.println("You are withdrawing  "+withdrawal+"  amount from your balance");
			balance = balance - withdrawal;
			System.out.println("Your new balance is  "+balance);
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
		Bank c = new Bank();
		c.show();
	}
}