public class Account
{
	private String name;		
	private double balance;

	//métodos construtores da classe Account
	public Account(String name)
	{
		setName(name);
		setBalance(0.0);
	}

	public Account(String name, double balance)
	{
		setName(name);
		setBalance(balance);
	}

	public void deposit(double depositAmount)
	{
		if(depositAmount > 0.0)
			this.balance += depositAmount;
		else 
			System.out.println("Deposit amount invalid"); 
	}

	//métodos de recuperação de variável 
	public String getName()
	{
		return this.name;
	}
	
	public double getBalance()
	{
		return this.balance;
	}

	//métodos de definição de variável 
	public void setName(String name)
	{
		this.name = name;
	}
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
}//fim da classe Account