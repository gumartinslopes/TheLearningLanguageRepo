import java.util.Date;

public class Testa_Date {
	public static Date b;
	public static void setRelease(Date a){
		b = a;
	}
	public static void main(String[] args){
		Date a = new Date(1921,1,3);
		System.out.println(a.getDate() + " " + a.getMonth() + " " + a.getYear());
		setRelease(a);
		System.out.println(b.getDate() + " " + b.getMonth() + " " + b.getYear());
	}
}

//This is just a test.The class Date is deprecated, instead of you should use Calendar.