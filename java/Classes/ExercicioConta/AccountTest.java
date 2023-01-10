import java.util.Scanner;

public class AccountTest
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Account account1 = new Account("Arnold Shwarzenegger", 5);
		Account account2 = new Account("Bruce Willis");

		account1.deposit(150.24);
		System.out.println(account1.getName() + " current balance: $" + account1.getBalance());
	}
}//fim da classe Account test