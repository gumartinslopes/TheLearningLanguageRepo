public class Employee
{
	String name, surname;
	double remuneration;

	public Employee(String name, String surname, double remuneration)
	{
		setName(name);
		setSurname(surname);
		setRemuneration(remuneration);
	}

	public double getAnualSalary()
	{
		return getRemuneration() * 12;
	}

	public void updateRemuneration(double update){
		setRemuneration(this.remuneration * update);
	}

	//métodos getters
	public String getName(){
		return this.name;
	}

	public String getSurname(){
		return this.surname;
	}

	public double getRemuneration(){
		return this.remuneration;
	}


	//metodos setters
	public void setName(String name)
	{
		this.name = name;
	}

	public void setSurname(String surname)
	{
		this.surname = surname;
	}

	public void setRemuneration(double remuneration)
	{
		if(remuneration < 0){
			remuneration = 0;
			System.out.println("Invalid negative value");
		}
		else
			this.remuneration = remuneration;
	}


}