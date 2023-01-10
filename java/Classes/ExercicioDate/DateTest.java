public class DateTest
{
	public static void displayDate(Date date)
	{	
		System.out.println(date.getMonth() + "/" + date.getDay() + "/" + date.getYear());
	}	

	public static void main(String[] args)
	{
		Date today = new Date(03,01,2021);
		displayDate(today);
	}

}