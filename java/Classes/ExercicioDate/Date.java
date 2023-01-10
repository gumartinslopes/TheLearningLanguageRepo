public class Date
{
	int month, day, year;

	public Date()
	{

	}
	public Date(int month, int day, int year)
	{
		setMonth(month);
		setDay(day);
		setYear(year);
	}

	//getters
	public int getMonth()
	{
		return this.month;
	}

	public int getDay()
	{
		return this.day;
	}

	public int getYear()
	{
		return this.year;
	}

	//setters
	public void setMonth(int month)
	{
		this.month = month;
	}

	public void setDay(int day)
	{
		this.day = day;
	}

	public void setYear(int year)
	{
		this.year = year;
	}
}