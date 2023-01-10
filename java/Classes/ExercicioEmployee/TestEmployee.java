import java.util.Scanner;

public class TestEmployee
{
	public static Scanner input = new Scanner(System.in);

	public static void displayEmployee(Employee employee)
	{
		System.out.println("Name: " + employee.getName() + " " + employee.getSurname());
		System.out.println("Monthly remuneration: " + employee.getRemuneration());		
	}

	public static void manageRemuneration(Employee employee)
	{
		double percentage;
		
		do{
			System.out.println(employee.getName() + "'s Current remuneration is " + employee.getRemuneration());
			System.out.println("Insert the update percentage :");
			percentage = input.nextFloat();
				if(percentage < 0)
					System.out.println("Invalid value please insert again");
		}while(percentage < 0);
		employee.updateRemuneration(percentage);
		System.out.println(employee.getName() + "'sNew remuneration: " + employee.getRemuneration());
	}

	public static void main(String[] args)
	{
		Employee jhon =  new Employee("Jhon", "Doe", 15000);
	 	Employee jack =  new Employee("Jack", "Sparrow", 20000);
	 	displayEmployee(jhon);
	 	manageRemuneration(jhon);
	}

}